package servlets;

import interfaces.ManageSubTaskLocal;
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
    private ManageSubTaskLocal mt;
    @EJB

    private  ManageWorkLocal mo;

    
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String t = req.getParameter("tittle"),
               d = req.getParameter("description"),
               dist = req.getParameter("distrito"),

               n = req.getParameter("negociable"),

               clan = req.getParameter("latitude"),
               clon = req.getParameter("longitude");
        
        Double r = validateDouble(req.getParameter("reward"));


        Integer id = Utils.Utils.validateInts(req.getParameter("id")),
            idTask = Utils.Utils.validateInts(req.getParameter("idSubtask"));
        
        boolean negociable = false;
        if(Utils.Utils.validateStrings(n)){
            negociable = true;
        }
        if(d == null) {
            d = "";
        }
        
        RequestDispatcher reqDispatcher;
        if( id != null && idTask != null && r != null && Utils.Utils.validateStrings(t) && 
                Utils.Utils.validateStrings(dist) && Utils.Utils.validateStrings(clan) && Utils.Utils.validateStrings(clon) ) {
            System.out.println("inside");

            Work w = new Work();
            w.setCreator(mu.getUser(id));
            w.setWorker(null);// ainda nao possui worker
            w.setTitle(t);
            w.setDescription(d);
            w.setPrice(r);

            w.setNegotiable(negociable);
            w.setSubTask(mt.getSubTask(idTask)); // get subtask selected by user

            w.setLocalization(mu.guardaDistrito(dist));
            
            w.setCoordLat(clan);
            w.setCoordLong(clon);
            w.setStartDate(new java.sql.Date(new Date().getTime())); // timestamp
            
            mo.registWork(w);

            reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/user/myOffers.jsp");
        } else {
            reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/offer/new.jsp");

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
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.processRequest(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req,resp);
    }
}
