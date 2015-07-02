package implementations;

import interfaces.ManageSubscriptionLocal;

public class ManageSubscription implements ManageSubscriptionLocal {

    @Override
    public void saveSubscription(long userid, String subs, boolean type) {
        if(type) { // district quando true
            // guardar na base de dados a subcrição do distrito
            
        } else {
            
        }
    }

    @Override
    public void removeSubscription(long userid, String subs, boolean type) {
        if(type) {// district quando true
            // guardar na base de dados a subcrição do distrito
            
        } else {
            
        }
    }
    
}
