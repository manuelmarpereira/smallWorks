package interfaces;

import javax.ejb.Local;

@Local
public interface ManageFeedbackLocal {
    public double getFeedback(int idUser);
}
