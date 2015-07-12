package implementations;

import auxiliar.Estatisticas;
import tp_aa.District;
import interfaces.ManageUserLocal;
import java.util.ArrayList;
import java.util.Date;
import tp_aa.TPAAPersistentManager;
import tp_aa.User;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import tp_aa.InitWork;
import tp_aa.MakeWork;
import tp_aa.Work;

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
            if (listUser.get(0).getPhoto() != null && listUser.get(0).getPhoto().isEmpty()) {
                u.setPhoto(null);
            } else {
                u.setPhoto(listUser.get(0).getPhoto());
            }
            u.setEmail(listUser.get(0).getEmail());
            u.setFirstname(listUser.get(0).getFirstname());
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
        if (listUser.get(0).getPhoto() != null && listUser.get(0).getPhoto().isEmpty()) {
            listUser.get(0).setPhoto(null);
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

            if (rows > 0) {
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

            if (rows > 0) {
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

            if (rows > 0) {
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

            if (rows > 0) {
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

            if (rows > 0) {
                return true;
            }
        } catch (PersistentException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public Estatisticas estatisticas(int iduser) {
        Estatisticas est = new Estatisticas();
        est.setIduser(iduser);
        List<Double> l = count(iduser);
        est.setTotalOffersWorker(l.get(0).intValue());
        est.setWintotalOffersWorker(ManageWork.round(l.get(1), 2));
        est.setTotalOffersCreator(l.get(2).intValue());
        est.setWintotalOffersCreator(ManageWork.round(l.get(3), 2));
        est.setDiference(ManageWork.round(l.get(1), 2) - ManageWork.round(l.get(3), 2));
        return est;
    }

    private static List<Double> count(int iduser) {
        List<Double> l = new ArrayList<Double>();
        PersistentSession entityManager = null;
        List<MakeWork> list = null;

        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query q = entityManager.createQuery("from MakeWork where Worker.id=:id or Creator=:id");
            q.setParameter("id", iduser);
            list = (List<MakeWork>) q.list();
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (PersistentException ex) {
            //tratar excepção se correr mal a meia da transação
            ex.printStackTrace();
        }

        if (list.isEmpty()) {
            /**
             * first positon total offer second position win the offer worker
             */
            l.add((double) 0);
            l.add((double) 0);
            /**
             * 2 e 3 position creator
             */
            l.add((double) 0);
            l.add((double) 0);
        } else {
            l = sumList(list, iduser);
        }

        return l;
    }

    private static List<Double> sumList(List<MakeWork> work, int user) {
        double sumCreator = 0;
        double countCreator = 0;
        List<Double> l = new ArrayList<Double>();
        double sumWorker = 0;
        double countWorker = 0;
        for (MakeWork m : work) {
            if (m.getWorker() != null) {
                if (m.getWorker().getId() == user) {
                    sumWorker += m.getPrice();
                    countWorker++;
                }
            } else if (m.getCreator().getId() == user) {
                sumCreator += m.getPrice();
                countCreator++;
            }
        }
        l.add(countWorker);
        l.add(sumWorker);
        l.add(countCreator);
        l.add(sumCreator);
        return l;
    }

    @Override
    public boolean startedToInit(int idworker, int offer) {

        PersistentSession entityManager = null;
        List<Work> list = null;

        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query q = entityManager.createQuery("from Work where id=:id");
            q.setParameter("id", offer);
            list = (List<Work>) q.list();
            entityManager.getTransaction().commit();
            entityManager.close();
        } catch (PersistentException ex) {
            //tratar excepção se correr mal a meia da transação
            ex.printStackTrace();
        }
        deleteWork(list.get(0));
        InitWork iw = new InitWork();
        iw.setId(offer);
        iw.setCoordLat(list.get(0).getCoordLat());
        iw.setCoordLong(list.get(0).getCoordLong());
        iw.setCreator(list.get(0).getCreator());
        iw.setDescription(list.get(0).getDescription());
        iw.setLocalization(list.get(0).getLocalization());
        iw.setNegotiable(list.get(0).getNegotiable());
        iw.setPrice(list.get(0).getPrice());
        iw.setStartDate(list.get(0).getStartDate());
        iw.setSubTask(list.get(0).getSubTask());
        iw.setTitle(list.get(0).getTitle());
        User u = new User();
        u.setId(idworker);
        iw.setWorker(u);
        iw.setInitWork(new java.sql.Date(new Date().getTime()));
        saveInitWork(iw);
        return true;
    }

    private static void saveInitWork(InitWork iw) {
        PersistentSession entityManager = null;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            entityManager.save(iw);
            entityManager.getTransaction().commit();
            entityManager.close();

        } catch (PersistentException ex) {
            //tratar excepção se correr mal a meia da transação
            ex.printStackTrace();
        }
    }

    private static void deleteWork(Work iw) {
        PersistentSession entityManager = null;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            entityManager.delete(iw);
            entityManager.getTransaction().commit();
            entityManager.close();

        } catch (PersistentException ex) {
            //tratar excepção se correr mal a meia da transação
            ex.printStackTrace();
        }
    }

    @Override
    public boolean dadosUserExist(String email, String nick) {
        PersistentSession entityManager = null;
        List<User> listUser = null;
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query login = null;
            if (email.equals("") || email.equals("null")) {
                login = entityManager.createQuery("from User where nick=:nick");
                login.setParameter("nick", nick);
            } else {
                login = entityManager.createQuery("from User where email=:email");
                login.setParameter("email", email);
            }
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

}
