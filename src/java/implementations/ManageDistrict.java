/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;


import interfaces.ManageDistrictLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import tp_aa.District;
import tp_aa.TPAAPersistentManager;

@Stateless
@Local(ManageDistrictLocal.class)
public class ManageDistrict implements ManageDistrictLocal{

    @Override
    public ArrayList<District> getALL() {
         PersistentSession entityManager = null;
       ArrayList<District> ad=new ArrayList<District>();
       try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query q = entityManager.createQuery("from District");
         
            ad = (ArrayList<District>) q.list();
            entityManager.getTransaction().commit();
           
        } catch (PersistentException ex) {
            ex.printStackTrace();
        }
       return ad;
    }
    
}
