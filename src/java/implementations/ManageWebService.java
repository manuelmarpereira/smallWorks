/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import interfaces.ManageWebServiceLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import tp_aa.TPAAPersistentManager;
import tp_aa.Work;
import webService.UserTest;

@Stateless
@Local(ManageWebServiceLocal.class)
public class ManageWebService implements ManageWebServiceLocal {

    @Override
    public ArrayList<UserTest> getuserWebService(int qtd, String task) {
        ArrayList<UserTest> ut = new ArrayList<UserTest>();
        List<Work> work = null;
        PersistentSession entityManager = null;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query q = entityManager.createQuery("from Work as w where subTask.task.name LIKE :task and  not exists (from MakeWork where w.id=id) and  not exists (from InitWork where w.id=id)");
            q.setParameter("task", task);
            q.setFirstResult(0);
            q.setMaxResults(qtd);
            work = (List<Work>) q.list();
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (PersistentException ex) {
            //tratar excepção se correr mal a meia da transação
            ex.printStackTrace();
        }

        if (work.isEmpty()) {

            return ut;
        } else {
            for (Work wk : work) {
                UserTest u = new UserTest();
                u.setDistricto(wk.getCreator().getDistrict().getName());
                u.setEmail(wk.getCreator().getEmail());
                u.setFirstname(wk.getCreator().getFirstname());
                u.setLastname(wk.getCreator().getLastname());
                ut.add(u);
            }
        }

        return ut;
    }

}
