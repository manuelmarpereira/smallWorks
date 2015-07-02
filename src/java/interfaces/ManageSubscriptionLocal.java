package interfaces;

import javax.ejb.Local;

@Local
public interface ManageSubscriptionLocal {
    public void saveSubscription(long userid, String subs, boolean type);
    public void removeSubscription(long userid, String subs, boolean type);
}
