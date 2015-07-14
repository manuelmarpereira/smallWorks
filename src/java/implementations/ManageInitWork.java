/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import interfaces.ManageInitWorkLocal;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import tp_aa.InitWork;
import tp_aa.TPAAPersistentManager;

/**
 *
 * @author PC
 */
@Stateless
@Local(ManageInitWorkLocal.class)
public class ManageInitWork implements ManageInitWorkLocal{

    @Override
    public List<InitWork> getInitWorkUser(int iduser) {
          PersistentSession entityManager = null;
        List<InitWork> listTask = null ;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query task = entityManager.createQuery("from InitWork where Creator.id=:id");
            task.setParameter("id", iduser);
            
            listTask = (List<InitWork>) task.list();
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (PersistentException ex) {
            ex.printStackTrace();
        }
        
        for (int i =0; i<listTask.size();i++){
        listTask.get(i).setPrice(ManageWork.round(listTask.get(i).getPrice(), 2));
        }
       return listTask;
    }
    
}
