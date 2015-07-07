package implementations;

import interfaces.ManageTaskLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import tp_aa.TPAAPersistentManager;
import tp_aa.Task;

@Stateless

public class ManageTask implements ManageTaskLocal {
    
    @Override
    public Task getTask(int id) {
        PersistentSession entityManager = null;
        List<Task> listTask = null;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query task = entityManager.createQuery("from Task where id=:id");
            task.setParameter("id", id);
            
            listTask = (List<Task>) task.list();
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (PersistentException ex) {
            //tratar excepção se correr mal a meia da transação
            ex.printStackTrace();
        }
        if (!listTask.isEmpty()) {
            return listTask.get(0);
        }
        return null;
    }

   @Override
    public List<Task> getAllTask() {
       PersistentSession entityManager = null;
       List<Task> task=new ArrayList<Task>();
       try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query q = entityManager.createQuery("from Task");
            
            
            task = (List<Task>) q.list();
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (PersistentException ex) {
            //tratar excepção se correr mal a meia da transação
            ex.printStackTrace();
        }
       
       return task;
    }
}
