package implementations;

import interfaces.ManageTaskLocal;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import tp_aa.TPAAPersistentManager;
import tp_aa.Task;

@Stateless
@Local(ManageTaskLocal.class)
public class ManageTask implements ManageTaskLocal {

    @Override
    public List<Task> getTasks() {
        PersistentSession entityManager = null;
        List<Task> all = null;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query task = entityManager.createQuery("from Task");

            all = (List<Task>) task.list();
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (PersistentException ex) {
            //tratar excepção se correr mal a meia da transação
            ex.printStackTrace();
        }
        return all;
    }
    
}
