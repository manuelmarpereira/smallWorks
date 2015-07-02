package interfaces;

import java.util.ArrayList;
import javax.ejb.Local;
import hibernate.work.Work;

@Local
public interface ManageOffersLocal {
    
    /**
     * 
     * @param userId
     * @param min 
     * @param max
     * @param active true to get active works false to get finalized works
     * @return 
     */
    public ArrayList<Work> getWorks(int userId, int min, int max, boolean active);
    
    public ArrayList<Work> getAllWorks();
}
