package interfaces;

import auxiliar.Estatisticas;
import java.util.List;
import tp_aa.User;
import javax.ejb.Local;
import tp_aa.District;

@Local
public interface ManageUserLocal {
    public User registUser(User u, String distrito);
    
    public User login(String nick, String password);
    
    public Estatisticas estatisticas(int iduser);
    
    public District guardaDistrito(String distrito);
    
    public User getUser(int id);
    
    public boolean updateUserflName(int idUser, String fn, String ln);
    
    public boolean updateUserPass(int idUser, String pass);
    
    public boolean updateUserEmail(int idUser, String email);
    
    public boolean updateUserDistrict(int idUser, String dist, String lat, String log);
    
    public boolean updateUserPhoto(int idUser, String path);
    
    public boolean startedToInit(int idworker,int offer); 
}
