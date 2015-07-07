package implementations;

import interfaces.ManageSubTaskLocal;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import tp_aa.SubTask;
import tp_aa.TPAAPersistentManager;

@Stateless
@Local(ManageSubTaskLocal.class)
public class ManageSubTask implements ManageSubTaskLocal {
    
    @Override
    public SubTask getSubTask(int idSubTask) {
        SubTask st = null;
        PersistentSession entityManager = null;
        List<SubTask> listTask = null;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query task = entityManager.createQuery("from SubTask where id=:id");
            task.setParameter("id", idSubTask);
            
            listTask = (List<SubTask>) task.list();
            entityManager.getTransaction().commit();
            entityManager.close();
            
            if (!listTask.isEmpty()) {
                return listTask.get(0);
            }   
        } catch (PersistentException ex) {
            //tratar excepção se correr mal a meia da transação
            ex.printStackTrace();
        }
        return st;
    }

    @Override
    public List<SubTask> getSubTasks(int idTask) {
        PersistentSession entityManager = null;
        List<SubTask> listTask = null;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query task = entityManager.createQuery("from SubTask where taskid=:id");
            task.setParameter("id", idTask);
            
            listTask = (List<SubTask>) task.list();
            entityManager.getTransaction().commit();
            entityManager.close();
            
            if (!listTask.isEmpty()) {
                return listTask;
            }   
        } catch (PersistentException ex) {
            ex.printStackTrace();
        }
        return listTask;
    }
}
