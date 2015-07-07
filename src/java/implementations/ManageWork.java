package implementations;

import interfaces.ManageWorkLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import tp_aa.TPAAPersistentManager;
import tp_aa.Work;

@Stateless
@Local(ManageWorkLocal.class)
public class ManageWork implements ManageWorkLocal {

    @Override
    public ArrayList<Work> getWorks(int userId, int min, int max, boolean active, String district, String tasks, int order) {
        if (district.equals("") || district == null) {
            district = "%%";
        } else {
            district = "%" + district.toLowerCase();
        }
        if (tasks.equals("") || tasks == null) {
            tasks = "%%";
        } else {
            tasks = "%" + tasks.toLowerCase() + "%";
        }
        ArrayList<Work> a = new ArrayList<Work>();
        PersistentSession entityManager = null;
        List<Work> work = new ArrayList<Work>();

        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query q = entityManager.createQuery(query(order));
            q.setFirstResult(min);
            q.setMaxResults(max);
            q.setParameter("district", district);
            q.setParameter("tasks", tasks);

            work = (List<Work>) q.list();
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (PersistentException ex) {
            //tratar excepção se correr mal a meia da transação
            ex.printStackTrace();
        }

        if (!work.isEmpty()) {
            for (Work wk : work) {
                a.add(wk);
            }
        }
        return a;
    }
    
    private static String query(int order){
        if (order==1){
            return "FROM Work where lower(Localization.name) like :district and lower(Tasks.name) like :tasks order by id DESC";
        }else 
            if (order==2){
             return "FROM Work where lower(Localization.name) like :district and lower(Tasks.name) like :tasks order by price DESC";
            }
    return "";
    }

    @Override
    public ArrayList<Work> getAllWorks() {
        ArrayList<Work> a = null;

        return a;
    }

    @Override
    public void registWork(Work o) {
        System.out.println("save offer");
        PersistentSession entityManager = null;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            entityManager.save(o);
            entityManager.getTransaction().commit();
            entityManager.close();
            System.out.println("save offer successfully");
        } catch (PersistentException ex) {
            //tratar excepção se correr mal a meia da transação
            ex.printStackTrace();
        }
    }

    @Override
    public ArrayList<Work> getSelectWorks(String district, String task) {
        ArrayList<Work> a = new ArrayList<Work>();
        PersistentSession entityManager = null;
        List<Work> work = new ArrayList<Work>();

        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query q = entityManager.createQuery("from Work order by id desc");
            work = (List<Work>) q.list();
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (PersistentException ex) {
            //tratar excepção se correr mal a meia da transação
            ex.printStackTrace();
        }

        if (!work.isEmpty()) {
            for (Work wk : work) {
                if (wk.getTasks().getName().toLowerCase().contains(task.toLowerCase()) || wk.getLocalization().getName().toLowerCase().contains(district.toLowerCase())) {
                    a.add(wk);
                }
            }
        }

        return a;
    }

}
