package user;

import globalconf.TPAAPersistentManager;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;


@Stateless
public class ManageUser implements ManageUserLocal {
    @EJB
    ManageUserLocal gclEjb;
    @Override
    public User registUser(User u) {
        // User u  = vou gravar na base de dados se possivel 
        if(!UserExist(u)){
          PersistentSession entityManager=null;
            try {
                entityManager = TPAAPersistentManager.instance().getSession();
                entityManager.beginTransaction();
                entityManager.save(u);
                entityManager.getTransaction().commit();
                entityManager.close();
            } catch (PersistentException ex) {
                Logger.getLogger(ManageUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            return u;
        }
        return null;
        
    }
    
    private boolean UserExist(User u){
     PersistentSession entityManager=null;
         List<User> listUser=null;
            try {
                entityManager = TPAAPersistentManager.instance().getSession();
                entityManager.beginTransaction();
                Query login=entityManager.createQuery("from User where nick=:nick or email=:email");
                login.setParameter("nick", u.getNick());
                login.setParameter("email", u.getEmail());
                listUser=(List<User>)login.list();
                entityManager.getTransaction().commit();
                entityManager.close();
            } catch (PersistentException ex) {
                Logger.getLogger(ManageUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (listUser.isEmpty()){
            return false;
            }
            return true;
    }

    @Override
    public User login(String nick, String password) {
        
        // envias para a base de dados  e recebes um User ou em string e depois convertes aqui para user
        //return dbLogin(nick,password);
        // este exemplo é so para andar
 
        
         PersistentSession entityManager=null;
         List<User> listUser=null;
            try {
                entityManager = TPAAPersistentManager.instance().getSession();
                entityManager.beginTransaction();
                Query login=entityManager.createQuery("from User where nick=:nick and password=:password");
                login.setParameter("nick", nick);
                login.setParameter("password", password);
                listUser=(List<User>)login.list();
                entityManager.getTransaction().commit();
                entityManager.close();
            } catch (PersistentException ex) {
                Logger.getLogger(ManageUser.class.getName()).log(Level.SEVERE, null, ex);
            }
          
            if(listUser.size()==1){
                User u=new User();
                u.setFirstname(listUser.get(0).getFirstname());
                u.setLastname(listUser.get(0).getLastname());
            return u;
            }
            
        return null;
    }
}
//@Override
//public boolean login(String nick, String password, User a) {
//    if (a != null ) {
//        if(a.getNick().equals(nick) && a.getPass().equals(password)) {
//            return true;
//        }
//    } else {
//        // envias para a base de dados // dbLogin(nick,pass) : User
//        if(nick.equals("admin") && password.equals("admin")) {
//            System.out.println("entrei no 2");
//            return true;
//        }
//    }
//    return false;
//}