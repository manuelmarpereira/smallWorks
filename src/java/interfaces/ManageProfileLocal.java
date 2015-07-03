package interfaces;

import javax.ejb.Local;
import utils.Profile;

@Local
public interface ManageProfileLocal {
    public Profile getUser(int userId);
}
