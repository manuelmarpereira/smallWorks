package implementations;

import interfaces.ManageMakeWorkLocal;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import tp_aa.MakeWork;
import tp_aa.TPAAPersistentManager;


@Stateless
@Local(ManageMakeWorkLocal.class)
public class ManageMakeWork implements ManageMakeWorkLocal {

    @Override

    public List<MakeWork> getMakedWorks(int idUser) {
        double avg = 0;
        PersistentSession entityManager = null;
        List<MakeWork> listTask = new ArrayList<>();
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query task = entityManager.createQuery("from MakeWork where Worker.id=:id");
            task.setParameter("id", idUser);
            
            listTask = (List<MakeWork>) task.list();
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (PersistentException ex) {
            ex.printStackTrace();
        }
        return listTask;
    }

    @Override
    public double getFeedback(int idUser) {
        List<MakeWork> tmp = this.getMakedWorks(idUser);
        
        double val = 0;
        for (MakeWork element : tmp) {
            val = val + element.getEvaluation().getClassification().getValue();
        }        
        return  val/tmp.size();

    }
    
}
