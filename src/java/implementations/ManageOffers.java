package implementations;

import interfaces.ManageOffersLocal;
import java.util.ArrayList;
import hibernate.work.Work;

public class ManageOffers implements ManageOffersLocal {
    
    
    @Override
    public ArrayList<Work> getWorks(int userId, int min, int max, boolean active) {
        ArrayList<Work> a = null;
        
        
        return a;
    }

    @Override
    public ArrayList<Work> getAllWorks() {
        ArrayList<Work> a = null;
        
        
        return a;
    }
    
}
