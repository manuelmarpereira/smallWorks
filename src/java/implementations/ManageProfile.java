package implementations;

import tp_aa.TPAAPersistentManager;
import interfaces.ManageProfileLocal;
import interfaces.ManageUserLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import tp_aa.Feedback;
import utils.Profile;

@Stateless
@Local(ManageProfileLocal.class)
public class ManageProfile implements ManageProfileLocal {

    @EJB
    ManageUserLocal mu;
    
    @Override
    public Profile getUser(int userId) {
        Profile p = new Profile();
        
        p.setU(mu.getUser(userId));
        // feedback
        
        return p;
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
