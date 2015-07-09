package servlets;

import interfaces.ManageUserLocal;
import tp_aa.User;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
    
    @EJB
    private ManageUserLocal mu;
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html;charset=UTF-8");
        
        String ni = (String) req.getParameter("nick") ;
        String p = (String) req.getParameter("password");
        RequestDispatcher reqDispatcher = null;
        
        boolean bn = Utils.Utils.validateStrings(ni);
        boolean bp = Utils.Utils.validateStrings(p);

        if(bn && bp) { // 2 campos preenchidos
            User u = mu.login(ni, p);
            this.makeDecision(u, req, resp, reqDispatcher);
            
        } else  {
            if(bn) { // so o nick preenchido
                req.setAttribute("sn", ni);
            } else if (bp){ // so a pass preenchida
                req.setAttribute("sp", p);
            }
            req.setAttribute("err", "You need fill nick and password");
            reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/login/login.jsp");
            reqDispatcher.forward(req, resp);
        }
    }
    
    private void makeDecision(User u, HttpServletRequest req, HttpServletResponse resp, RequestDispatcher reqDispatcher) throws ServletException, IOException {

        if(u != null) {
            u.setPassword(null);// nao ter a password
             req.setAttribute("page", "login");
            req.setAttribute("user", u);
           
            reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/index.jsp");
        } else { // handler errors
            req.setAttribute("err", "Wrong credential combination");
            reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/login/login.jsp");
        }
        reqDispatcher.forward(req, resp);
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
