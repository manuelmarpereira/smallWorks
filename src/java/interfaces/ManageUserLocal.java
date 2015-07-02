package interfaces;

import javax.ejb.Local;
import user.User;

@Local
public interface ManageUserLocal {
    public User registUser(User u);
    
    public User login(String nick, String password);
}
