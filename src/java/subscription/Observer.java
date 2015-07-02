package subscription;

//import javax.ejb.EJB;

import interfaces.ManageSubscriptionLocal;
import java.util.HashMap;
import java.util.Map;


public class Observer {
    //@EJB
    private ManageSubscriptionLocal ms = null;
    public static Map<Long, String> subsDis = new HashMap<>();
    public static Map<Long, String> subsCat = new HashMap<>();
    
    
    public void subDistrict(long userid, String district) {
        // add to database and add to map
        // check database with maangeSubscription        
        subsDis.put(userid, district);
    }
    
    public void subCategory(long userid, String category) {
        // check database with maangeSubscription
        subsCat.put(userid, category);
    }
    
    public void sendNotifications(boolean district) {
        if(district){
            //send to all users that are in subsDis
            // use facebookAPI no send notification
        } else {
            //send to all users that are in subsCat
            // use facebookAPI no send notification
        }
    }
    
}
