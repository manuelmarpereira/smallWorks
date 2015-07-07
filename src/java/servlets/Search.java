
package servlets;



import interfaces.ManageWorkLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
public class Search  extends HttpServlet{
    
    @EJB
    ManageWorkLocal mw;
    
    @Override
    public void destroy() {
        super.destroy();
        this.mw = null;
    }
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  
    ArrayList work = mw.getWorks(1, 0, 100, true,req.getParameter("location"), req.getParameter("task"), Integer.parseInt(req.getParameter("order")),req.getParameter("amount_low"),req.getParameter("amount_high"));
        
    RequestDispatcher reqDispatcher;
    req.setAttribute("works", work);
    req.setAttribute("district", req.getParameter("location"));
    req.setAttribute("task", req.getParameter("task"));
    req.setAttribute("order", req.getParameter("order"));
  
    reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/offer/search.jsp");
    reqDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }

    @Override
    public String getServletInfo() {
        return "Servlet show works";
    }
    
}
