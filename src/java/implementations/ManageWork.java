package implementations;

import interfaces.ManageWorkLocal;
import java.util.ArrayList;
import javax.ejb.Stateless;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import tp_aa.TPAAPersistentManager;
import tp_aa.Work;

@Stateless
public class ManageWork implements ManageWorkLocal {
    
    
    @Override
    public ArrayList<Work> getWorks(int userId, int min, int max, boolean active) {
        ArrayList<Work> a = null;
        
        
        return a;
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
    
}
