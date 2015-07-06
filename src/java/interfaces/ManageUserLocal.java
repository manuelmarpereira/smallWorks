package interfaces;

import tp_aa.User;
import javax.ejb.Local;
import tp_aa.District;

@Local
public interface ManageUserLocal {
    public User registUser(User u, String distrito);
    
    public User login(String nick, String password);
    
    public District guardaDistrito(String distrito);
    
    public User getUser(int id);
}
