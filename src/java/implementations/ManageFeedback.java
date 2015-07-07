package implementations;

import interfaces.ManageFeedbackLocal;
import javax.ejb.Stateless;

@Stateless
public class ManageFeedback implements ManageFeedbackLocal{

    @Override
    public double getFeedback(int idUser) {
        double avg = 1.23;
//        
//        PersistentSession entityManager = null;
//        List<Task> listTask = null;
//        try {
//            entityManager = TPAAPersistentManager.instance().getSession();
//            entityManager.beginTransaction();
//            Query task = entityManager.createQuery("average from Task where id=:id");
//            task.setParameter("id", id);
//            
//            listTask = (List<Task>) task.list();
//            entityManager.getTransaction().commit();
//            entityManager.close();
//        } catch (PersistentException ex) {
//            //tratar excepção se correr mal a meia da transação
//            ex.printStackTrace();
//        }
//        if (!listTask.isEmpty()) {
//            return listTask.get(0);
//        }
//        return null;
        return avg;
    }
    
}
