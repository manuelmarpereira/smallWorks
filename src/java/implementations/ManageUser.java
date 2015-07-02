package implementations;

import interfaces.ManageUserLocal;
import globalconf.TPAAPersistentManager;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import user.User;

@Stateless
public class ManageUser implements ManageUserLocal {

    @EJB
    ManageUserLocal gclEjb;

    @Override
    public User registUser(User u) {
        // User u  = vou gravar na base de dados se possivel 
        if (!UserExist(u)) {
            PersistentSession entityManager = null;
            try {
                entityManager = TPAAPersistentManager.instance().getSession();
                entityManager.beginTransaction();
                entityManager.save(u);
                entityManager.getTransaction().commit();
                entityManager.close();
            } catch (PersistentException ex) {
                //tratar excepção se correr mal a meia da transação
                ex.printStackTrace();
            }
            return u;
        }
        return null;

    }

    private boolean UserExist(User u) {
        PersistentSession entityManager = null;
        List<User> listUser = null;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query login = entityManager.createQuery("from User where nick=:nick or email=:email");
            login.setParameter("nick", u.getNick());
            login.setParameter("email", u.getEmail());
            listUser = (List<User>) login.list();
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (PersistentException ex) {
            //tratar excepção se correr mal a meia da transação
            ex.printStackTrace();
        }
        if (listUser.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override
    public User login(String nick, String password) {

        PersistentSession entityManager = null;
        List<User> listUser = null;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query login = entityManager.createQuery("from User where nick=:nick and password=:password");
            login.setParameter("nick", nick);
            login.setParameter("password", password);
            listUser = (List<User>) login.list();
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (PersistentException ex) {
            //tratar excepção se correr mal a meia da transação
            ex.printStackTrace();
        }

        if (listUser.size() == 1) {
            User u = new User();
            u.setID(listUser.get(0).getID());
            u.setNick(listUser.get(0).getNick());
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
