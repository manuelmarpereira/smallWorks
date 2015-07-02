package interfaces;

import hibernate.user.User;
import javax.ejb.Local;

@Local
public interface ManageUserLocal {
    public User registUser(User u);
    
    public User login(String nick, String password);
}
