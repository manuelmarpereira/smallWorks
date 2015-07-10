/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import interfaces.ManageInitWorkLocal;
import interfaces.ManageMakeWorkLocal;
import interfaces.ManageWorkLocal;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tp_aa.InitWork;
import tp_aa.MakeWork;
import tp_aa.Work;


/**
 *
 * @author PC
 */
public class MakeWorkSvlData extends HttpServlet {

    
    @EJB
    private ManageMakeWorkLocal mmw;
    
   @EJB
    private ManageInitWorkLocal miw;
   
   @EJB
   private ManageWorkLocal mw;
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("application/json;charset=UTF-8");
        List<MakeWork> makeWork = mmw.getMakedWorksByCreator(Integer.parseInt(req.getParameter("id")));
        
        List<InitWork> initWork = miw.getInitWorkUser(Integer.parseInt(req.getParameter("id")));
        List<Work> work = mw.getWorksbyuserCreator(initWork, makeWork, Integer.parseInt(req.getParameter("id")));
        String json="{\"works\": {";
                json += buildJsonMakeWork(makeWork);
        json += buildJsonInitWork(initWork);
        json += buildJsonWork(work);
        json +="}";
        resp.getWriter().print(json);
    }

    private String buildJsonMakeWork(List<MakeWork> makeWork) {
    String json="";
    json = " \"makework\": [";
        for (MakeWork mw : makeWork){
            json += 
                    "{\"id\": \""+ mw.getId()+"\","+
                    "\"startdate\": \""+ mw.getStartDate()+"\","+
                    "\"tarefa\": \""+ mw.getTitle()+"\","+
                    "\"recompensa\": \""+ mw.getPrice()+"\","+
                    
                   
                    "\"estado\": \"Finished\""+
                   "},";
        }
        if(!json.substring(json.length()-1, json.length()).equals("[")){
         json = json.substring(0, json.length()-1);}
        json += "],";
        
    return json;
    }
    
        private String buildJsonInitWork(List<InitWork> initWork) {
    String json="";
    json = " \"initwork\": [";
        for (InitWork mw : initWork){
            json += 
                    "{\"id\": \""+ mw.getId()+"\","+
                    "\"startdate\": \""+ mw.getStartDate()+"\","+
                    "\"tarefa\": \""+ mw.getTitle()+"\","+
                    "\"recompensa\": \""+ mw.getPrice()+"\","+
                    
                   
                    "\"estado\": \"Awaited finalization\""+
                   "},";
        }
        if(!json.substring(json.length()-1, json.length()).equals("[")){
         json = json.substring(0, json.length()-1);}
        json += "],";
    return json;
    }
        
         private String buildJsonWork(List<Work> work) {
    String json="";
    json = " \"work\": [";
        for (Work mw : work){
            json += 
                    "{\"id\": \""+ mw.getId()+"\","+
                    "\"startdate\": \""+ mw.getStartDate()+"\","+
                    "\"tarefa\": \""+ mw.getTitle()+"\","+
                    "\"recompensa\": \""+ mw.getPrice()+"\","+
                    
                   
                    "\"estado\": \"Started\""+
                   "},";
        }
        if(!json.substring(json.length()-1, json.length()).equals("[")){
         json = json.substring(0, json.length()-1);}
        json += "]}";
    return json;
    }
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }
}
