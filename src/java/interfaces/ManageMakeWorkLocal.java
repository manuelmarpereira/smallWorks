package interfaces;

import javax.ejb.Local;

@Local
public interface ManageMakeWorkLocal {
    public Double getMakedWorks(int id);
}
