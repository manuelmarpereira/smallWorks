package implementations;

import interfaces.ManageMakeWorkLocal;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import org.orm.PersistentException;
import tp_aa.MakeWork;
import tp_aa.WorkDAO;

@Stateless
@Local(ManageMakeWorkLocal.class)
public class ManageMakeWork implements ManageMakeWorkLocal {

    @Override
    public Double getMakedWorks(int id) {
        Double val = null;
        try {
            // onde foi o trabalhador
            List<MakeWork> all = WorkDAO.queryWork("userid!="+id,"id");
            
            for (MakeWork elements : all) {
                System.out.println("");
            }
            
        } catch (PersistentException ex) {}

        return val;
    }
    
}
