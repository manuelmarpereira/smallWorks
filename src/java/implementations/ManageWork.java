package implementations;

import interfaces.ManageWorkLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import tp_aa.InitWork;
import tp_aa.MakeWork;
import tp_aa.TPAAPersistentManager;
import tp_aa.Work;




@Stateless
@Local(ManageWorkLocal.class)
public class ManageWork implements ManageWorkLocal {

    @Override

    public ArrayList<Work> getWorks(int userId, int min, int max, boolean active, String district, String tasks, int order, String amount_low,String amount_high) {

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

            q.setParameter("amount_low", Double.parseDouble(amount_low));
            q.setParameter("amount_high", Double.parseDouble(amount_high));



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

            return "FROM Work where lower(Localization.name) like :district and lower(subTask.name) like :tasks and price between :amount_low and :amount_high order by id DESC";
        }else 
            if (order==2){
             return "FROM Work where lower(Localization.name) like :district and lower(subTask.name) like :tasks and price between :amount_low and :amount_high order by price DESC";

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

        PersistentSession entityManager = null;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            entityManager.save(o);
            entityManager.getTransaction().commit();
            entityManager.close();

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
                if (wk.getSubTask().getName().toLowerCase().contains(task.toLowerCase()) || wk.getLocalization().getName().toLowerCase().contains(district.toLowerCase())) {
                    a.add(wk);
                }
            }
        }

        return a;
    }

    @Override
    public List<Work> getWorksbyuserCreator(List<InitWork> init, List<MakeWork> make,int iduser) {
        PersistentSession entityManager = null;
        List<Work> list = new ArrayList<>();
        
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query q = entityManager.createQuery("from Work where Creator.id=:id");
            q.setParameter("id", iduser);
            
            list = (List<Work>) q.list();
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (PersistentException ex) {
            ex.printStackTrace();
        }
        
        for (InitWork i: init){
            for (Work w: list){
                if (i.getId()==w.getId()){
                    list.remove(w);
                    break;
                }
            }
        }
        for (MakeWork i: make){
            for (Work w: list){
                if (i.getId()==w.getId()){
                    list.remove(w);
                    break;
                }
            }
        }
        
        return list;
    }

}
