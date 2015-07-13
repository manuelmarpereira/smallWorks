/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementations;

import interfaces.ManageFeedbackLocal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Local;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import tp_aa.Classification;
import tp_aa.Feedback;
import tp_aa.InitWork;
import tp_aa.MakeWork;

import tp_aa.TPAAPersistentManager;
import tp_aa.Work;


/**
 *
 * @author PC
 */
@Stateless
@Local(ManageFeedbackLocal.class)
public class ManageFeedback implements ManageFeedbackLocal{

    @Override
    public void AddFeedback(int feedback, int idoffer, String comentario) {
        
        PersistentSession entityManager = null;
        Feedback fb= new Feedback();
        try {
         entityManager = TPAAPersistentManager.instance().getSession();
         entityManager.beginTransaction();
         Classification c=new Classification();
         c.setId(feedback);
         
         fb.setClassification(c);
         fb.setComent(comentario);
         entityManager.save(fb);
         entityManager.getTransaction().commit();
         entityManager.close();
         } catch (PersistentException ex) {
            ex.printStackTrace();
        }
        Changeoffer(idoffer,fb);
    }
    
    private static void Changeoffer(int idoffer, Feedback fb){
         PersistentSession entityManager = null;
         
        List<Work> list = new ArrayList<>();
        try {
            entityManager = TPAAPersistentManager.instance().getSession();
            entityManager.beginTransaction();
            Query q = entityManager.createQuery("from Work where id=:id");
            q.setParameter("id", idoffer);
            
            list = (List<Work>) q.list();
            entityManager.getTransaction().commit();
           
        } catch (PersistentException ex) {
            ex.printStackTrace();
        }
        deleteWork(list.get(0));
        saveMakeWork(list,idoffer,fb);
    }
    
    private static void deleteWork(Work m){
         PersistentSession entityManager = null;
    try {
         entityManager = TPAAPersistentManager.instance().getSession();
         entityManager.beginTransaction();        
         entityManager.delete(m);
         entityManager.getTransaction().commit();
         entityManager.close();
         } catch (PersistentException ex) {
            ex.printStackTrace();
        }
    }
    
    private static void saveMakeWork(List<Work> list, int idoffer, Feedback fb){
    PersistentSession entityManager = null;
                MakeWork mw=new MakeWork();
        mw.setId(idoffer);
        mw.setCoordLat(list.get(0).getCoordLat());
        mw.setCoordLong(list.get(0).getCoordLong());
        mw.setCreator(list.get(0).getCreator());
        mw.setDescription(list.get(0).getDescription());
        mw.setLocalization(list.get(0).getLocalization());
        mw.setNegotiable(list.get(0).getNegotiable());
        mw.setPrice(list.get(0).getPrice());
        mw.setStartDate(list.get(0).getStartDate());
        mw.setSubTask(list.get(0).getSubTask());
        mw.setTitle(list.get(0).getTitle());
        mw.setWorker(list.get(0).getWorker());
        mw.setEvaluation(fb);
        mw.setFinishDate(new java.sql.Date(new Date().getTime()));
        
        try {
         entityManager = TPAAPersistentManager.instance().getSession();
         entityManager.beginTransaction();        
         entityManager.save(mw);
         entityManager.getTransaction().commit();
         entityManager.close();
         } catch (PersistentException ex) {
            ex.printStackTrace();
        }
        
    }
    
    
}
