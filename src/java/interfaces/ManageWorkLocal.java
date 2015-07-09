package interfaces;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
import tp_aa.InitWork;
import tp_aa.MakeWork;
import tp_aa.Work;

@Local
public interface ManageWorkLocal {
    
    /**
     * 
     * @param userId
     * @param min 
     * @param max
     * @param active true to get active works false to get finalized works
     * @param district
     * @param tasks
     * @return 
     */
    public ArrayList<Work> getWorks(int userId, int min, int max, boolean active, String district, String tasks, int order, String amount_low, String amount_high);
    public ArrayList<Work> getSelectWorks(String district, String task);
    
    public ArrayList<Work> getAllWorks();
    
     public List<Work> getWorksbyuserCreator(List<InitWork> init, List<MakeWork> make,int iduser);
    public void registWork(Work o);
}
