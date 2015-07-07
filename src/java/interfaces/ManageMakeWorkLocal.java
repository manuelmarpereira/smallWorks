package interfaces;

import java.util.List;
import javax.ejb.Local;
import tp_aa.MakeWork;

@Local
public interface ManageMakeWorkLocal {
    public List<MakeWork> getMakedWorks(int idUser);
    public double getFeedback(int idUser);
}
