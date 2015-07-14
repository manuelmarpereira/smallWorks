package implementations;

import interfaces.ManageSubscriptionLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import tp_aa.District;
import tp_aa.DistrictDAO;
import tp_aa.SubTask;
import tp_aa.SubTaskDAO;
import tp_aa.TPAAPersistentManager;
import tp_aa.User;
import tp_aa.UserDAO;
import tp_aa.subscription;

@Stateless
@Local(ManageSubscriptionLocal.class)
public class ManageSubscription implements ManageSubscriptionLocal {

    @Override
    public boolean saveSubscriptions(int userid, Integer idSubtask, Integer idDistrict) {
        try {

            District d = null;
            SubTask st = null;
            if (idSubtask == 0) {
                idSubtask = null;
            } else {
                st = SubTaskDAO.getSubTaskByORMID(idSubtask);

            }

            if (idDistrict == 0) {
                idDistrict = null;

            } else {
                d = DistrictDAO.getDistrictByORMID(idDistrict);
            }

            User u = UserDAO.getUserByORMID(userid);

            tp_aa.subscription s = new subscription();
            s.setORM_User(u);

            s.setSubsDistrict(d);

            s.setSubsTask(st);

            // save subscription
            PersistentSession entityManager = null;
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            entityManager.save(s);
            entityManager.getTransaction().commit();
            entityManager.close();

        } catch (PersistentException p) {
            p.printStackTrace();
            return false;
        }
        return true;

    }

    @Override
    public boolean saveSubscription(int userid, int id, boolean type) { // true district false subcategory
        if (type) { // district quando true
            // guardar na base de dados a subcrição do distrito

        } else {
            // save in database this subscription
        }
        return true;
    }

    @Override
    public boolean removeSubscription(int userid, int id, boolean type) {
        if (type) {// district quando true
            // guardar na base de dados a subcrição do distrito

        } else {

        }
        return true;
    }

//    private List<User> getSubtasksSubscriptionUsers(int idst) {
//        PersistentSession entityManager = null;
//        List<subscription> list = new ArrayList<>();
//
//        try {
//            entityManager = TPAAPersistentManager.instance().getSession();
//            entityManager.beginTransaction();
//            Query q = entityManager.createQuery("from subscription where subsTask.id =:id");
//            q.setParameter("id", idst);
//
//            list = (List<subscription>) q.list();
//            entityManager.getTransaction().commit();
//            entityManager.close();
//        } catch (PersistentException ex) {
//            ex.printStackTrace();
//        }
//        
//        if(list.isEmpty()) {
//           return null; 
//        } 
//        List<User> tmp = new ArrayList<>();
//        for (subscription element : list) {
//            tmp.add(element.getUser());
//        }
//        return tmp;
//    }
//    
//    private List<User> getDistrictSubscriptionUsers(int idDist) {
//        PersistentSession entityManager = null;
//        List<subscription> list = new ArrayList<>();
//
//        try {
//            entityManager = TPAAPersistentManager.instance().getSession();
//            entityManager.beginTransaction();
//            Query q = entityManager.createQuery("from subscription where subsDistrict.id =:idd ");
//            
//            q.setParameter("idd", idDist);
//
//            list = (List<subscription>) q.list();
//            entityManager.getTransaction().commit();
//            entityManager.close();
//        } catch (PersistentException ex) {
//            ex.printStackTrace();
//        }
//        
//        if(list.isEmpty()) {
//           return null; 
//        } 
//        List<User> tmp = new ArrayList<>();
//        for (subscription element : list) {
//            tmp.add(element.getUser());
//        }
//        return tmp;
//    }
//    private List<User> getSubscriptions(int idsubtask, int iddistrict) {
//        PersistentSession entityManager = null;
//        List<subscription> list = new ArrayList<>();
//
//        try {
//            entityManager = TPAAPersistentManager.instance().getSession();
//            entityManager.beginTransaction();
//            Query q = entityManager.createQuery("from subscription where subsTask.id =:ids or subsDistrict.id =:idd");
//            q.setParameter("ids", idsubtask);
//            q.setParameter("idd", iddistrict);
//
//            list = (List<subscription>) q.list();
//            entityManager.getTransaction().commit();
//            entityManager.close();
//        } catch (PersistentException ex) {
//            ex.printStackTrace();
//        }
//        if(list.isEmpty()) {
//           return null; 
//        }
//        List<User> tmp = new ArrayList<>();
//        for (subscription element : list) {
//            tmp.add(element.getUser());
//        }
//        return tmp;
//        
//    }
    @Override
    public List<User> getUsersSubscriptions(int idsubtask, int iddistrict) {
        PersistentSession entityManager = null;
        List<subscription> list = new ArrayList<>();

        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query q = entityManager.createQuery("from subscription where subsTask.id =:ids or subsDistrict.id =:idd");
            q.setParameter("ids", idsubtask);
            q.setParameter("idd", iddistrict);

            list = (List<subscription>) q.list();
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (PersistentException ex) {
            ex.printStackTrace();
        }
        if (list.isEmpty()) {
            return null;
        }
        List<User> tmp = new ArrayList<>();
        for (subscription element : list) {
            tmp.add(element.getUser());
        }
        
        
        return tmp;

//                    uds = this.getDistrictSubscriptionUsers(iddistrict),
//                    usts = this.getSubtasksSubscriptionUsers(idsubtask);
//        if(uds != null) {
//            all.addAll(uds);
//        }
//        if(usts != null) {
//            all.addAll(usts);
//        }
//        return all;
    }
}
