package implementations;

import hibernate.globalconf.TPAAPersistentManager;
import interfaces.ManageProfileLocal;
import java.util.List;
import javax.ejb.EJB;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import hibernate.feedback.Feedback;
import hibernate.user.User;
import utils.Profile;

public class ManageProfile implements ManageProfileLocal {

//    @EJB
//    private ManageProfileLocal mplEjb;
    
    @Override
    public Profile getUser(int userId) {
        Profile p = new Profile();
        
        p.setU(getUserById(userId));
        // feedback
        
        
        
        return p;
    }
    
    
    
    
    
    
    public static User getUserById(int userId) {
        PersistentSession entityManager = null;
        List<User> listUser = null;
        
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            
            Query login = entityManager.createQuery("from User where id=:user");
            login.setParameter("user", userId);
            
            listUser = (List<User>) login.list();
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (PersistentException ex) {
            //tratar excepção se correr mal a meia da transação
            ex.printStackTrace();
        }
        
        if (listUser.isEmpty()) {
            return null;
        }
        return listUser.get(0);
    }
    
    public static Feedback getFeedbackByUserid(int userId) {
        PersistentSession entityManager = null;
        List<Feedback> list = null;
        
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            // in progress.................
            Query login = entityManager.createQuery("from MakeWork where id=:user");
            login.setParameter("user", userId);
            
            list = (List<Feedback>) login.list();
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (PersistentException ex) {
            //tratar excepção se correr mal a meia da transação
            ex.printStackTrace();
        }
        
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}
