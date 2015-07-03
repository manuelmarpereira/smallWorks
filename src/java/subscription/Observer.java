package subscription;

//import javax.ejb.EJB;

import hibernate.work.Work;
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
    
    public void sendNotifications(Work w) {
        
        for (Map.Entry<Long, String> entrySet : subsCat.entrySet()) {
            Long key = entrySet.getKey();
            String value = entrySet.getValue();
            
            // enviar a todos os utilizadores que subscreveram esta categoria
            if(w.getLocalization().getName().equals(value)) {
                // facebookAPI... enviar notificação
                // key é o id do utilizador
            }
//            if(w.getTasks()) {
//                
//            }
        }
    }
    
}
