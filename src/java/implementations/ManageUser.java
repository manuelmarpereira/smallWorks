package implementations;

import tp_aa.District;
import interfaces.ManageUserLocal;
import tp_aa.TPAAPersistentManager;
import tp_aa.User;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;

@Stateless
@Local(ManageUserLocal.class)
public class ManageUser implements ManageUserLocal {
    
    @Override
    public User registUser(User u, String distrito) {
        //grava distrito

        // User u  = vou gravar na base de dados se possivel 
        if (!UserExist(u)) {

            u.setORM_District(guardaDistrito(distrito));

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

    @Override
    public District guardaDistrito(String distrito) {
        //verifica se distrito existe
        District dist = verificaDistrito(distrito);
        if (dist == null) {
            //insere districto
            dist = new District();
            dist.setName(distrito);
            PersistentSession entityManager = null;
            try {
                entityManager = TPAAPersistentManager.instance().getSession();
                entityManager.beginTransaction();
                entityManager.save(dist);
                entityManager.getTransaction().commit();
                entityManager.close();
            } catch (PersistentException ex) {
                //tratar excepção se correr mal a meia da transação
                ex.printStackTrace();
            }
            dist = verificaDistrito(distrito);
        }
        return dist;
    }

    private District verificaDistrito(String distrito) {
        PersistentSession entityManager = null;
        List<District> listUser = null;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query login = entityManager.createQuery("from District where name LIKE :name");
            login.setParameter("name", distrito);

            listUser = (List<District>) login.list();
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (PersistentException ex) {
            //tratar excepção se correr mal a meia da transação
            ex.printStackTrace();
        }
        if (listUser.isEmpty()) {
            return null;
        }
        return listUser.get(0);
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
            u.setId(listUser.get(0).getId());
            u.setNick(listUser.get(0).getNick());
            u.setPhoto(listUser.get(0).getPhoto());
            return u;
        }

        return null;
    }

    @Override
    public User getUser(int id) {
        PersistentSession entityManager = null;
        List<User> listUser = null;
        
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query login = entityManager.createQuery("from User where id=:id");
            login.setParameter("id", id);

            listUser = (List<User>) login.list();
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (PersistentException ex) {
            //tratar excepção se correr mal a meia da transação
            ex.printStackTrace();
        }

        if (listUser.isEmpty()) {
            return null;
        }
        return listUser.get(0);
    }

    @Override
    public boolean updateUserflName(int idUser, String fn, String ln) {
        PersistentSession entityManager = null;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query updat = entityManager.createQuery("update User set firstname=:afn,lastname=:aln where id=:id");
            updat.setParameter("afn", fn);
            updat.setParameter("aln", ln);
            updat.setParameter("id", idUser);
            
            int rows = updat.executeUpdate();
            entityManager.getTransaction().commit();
            entityManager.close();
            
            if(rows > 0) {
                return true;
            }
            
        } catch (PersistentException ex) {
            ex.printStackTrace();
        }
        
        return false;
    }

    @Override
    public boolean updateUserPass(int idUser, String pass) {
        PersistentSession entityManager = null;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query updat = entityManager.createQuery("update User set password=:p where id=:id");
            updat.setParameter("p", pass);
            updat.setParameter("id", idUser);
            
            int rows = updat.executeUpdate();
            entityManager.getTransaction().commit();
            entityManager.close();
            
            if(rows > 0) {
                return true;
            }   
        } catch (PersistentException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateUserEmail(int idUser, String email) { // pode haver duas contas com o mesmo email????noa devia criar coluna unica na bd

        PersistentSession entityManager = null;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query updat = entityManager.createQuery("update User set email=:e where id=:id");
            updat.setParameter("e", email);
            updat.setParameter("id", idUser);
            
            int rows = updat.executeUpdate();
            entityManager.getTransaction().commit();
            entityManager.close();
            
            if(rows > 0) {
                return true;
            }   
        } catch (PersistentException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateUserDistrict(int idUser, String dist, String lat, String log) {
        
        District district = guardaDistrito(dist);
        
        PersistentSession entityManager = null;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query updat = entityManager.createQuery("update User set district=:d, coordLat=:la, coordLong=:lo where id=:id");
            
            updat.setParameter("id", idUser);
            updat.setParameter("d", district);
            updat.setParameter("la", lat);
            updat.setParameter("lo", log);
            
            int rows = updat.executeUpdate();
            entityManager.getTransaction().commit();
            entityManager.close();
            
            if(rows > 0) {
                return true;
            }   
        } catch (PersistentException ex) {
            ex.printStackTrace();
        }
        return false;
        
    }

    @Override
    public boolean updateUserPhoto(int idUser, String path) {
        PersistentSession entityManager = null;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query updat = entityManager.createQuery("update User set photo=:ph where id=:id");
            
            updat.setParameter("id", idUser);
            updat.setParameter("ph", path);
            
            int rows = updat.executeUpdate();
            entityManager.getTransaction().commit();
            entityManager.close();
            
            if(rows > 0) {
                return true;
            }   
        } catch (PersistentException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
