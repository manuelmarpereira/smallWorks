package interfaces;

import java.util.List;
import javax.ejb.Local;
import tp_aa.User;

@Local
public interface ManageSubscriptionLocal {
    
    public boolean saveSubscriptions(int userid, Integer idSubtask, Integer idDistrict);
    public boolean saveSubscription(int userid, int id, boolean type);
    public boolean removeSubscription(int userid, int id, boolean type);
    public List<User> getUsersSubscriptions(int idsubtask, int iddistrict);
}