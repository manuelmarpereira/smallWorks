package servlets;

import interfaces.ManageTaskLocal;
import interfaces.ManageUserLocal;
import interfaces.ManageWorkLocal;
import tp_aa.Work;
import java.io.IOException;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NewOffer extends HttpServlet{
    
    @EJB
    private ManageUserLocal mu;
    @EJB
    private ManageTaskLocal mt;
    @EJB
   private  ManageWorkLocal mo;
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String t = req.getParameter("tittle"),
               d = req.getParameter("description"),
               dist = req.getParameter("distrito"),
               n = req.getParameter("negociavel"),
               clan = req.getParameter("latitude"),
               clon = req.getParameter("longitude");
        
        Double r = validateDouble(req.getParameter("reward"));
        
        Integer id = validateInts(req.getParameter("id")),
            idTask = validateInts(req.getParameter("idtask"));
        
        RequestDispatcher reqDispatcher;
        if( id != null && idTask != null && r != null && validateStrings(t) && validateStrings(d) && 
                validateStrings(n) && validateStrings(dist) && validateStrings(clan) && validateStrings(clon) ) {
            
            Work w = new Work();
            w.setCreator(mu.getUser(id));
            w.setWorker(null);// ainda nao possui worker
            w.setTitle(t);
            w.setDescription(d);
            w.setPrice(r);
            w.setNegotiable(Boolean.parseBoolean(n));
            w.setTasks(mt.getTask(idTask)); // get task selected by user
            w.setLocalization(mu.guardaDistrito(dist));
            
            w.setCoordLat(clan);
            w.setCoordLong(clon);
            w.setStartDate(new java.sql.Date(new Date().getTime())); // timestamp
            
            mo.registWork(w);
            reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/user/listOffers.jsp");
        } else {
            reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/user/newOffer.jsp");
        }
        reqDispatcher.forward(req, resp);
    }
    
    
    
    private Double validateDouble(String v) {
        try {
            Double i = Double.parseDouble(v);
            if(i >= 0) {
                return i;
            }
        } catch(NumberFormatException n) {}
        return null;
    }
    
    private Integer validateInts(String v) {
        try {
            int i = Integer.parseInt(v);
            if(i > 0) {
                return i;
            }
        } catch(NumberFormatException n) {}
        return null;
    }
    
    private boolean validateStrings(String s) {
        return s != null && !s.trim().equals("");
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.processRequest(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req,resp);
    }
}
