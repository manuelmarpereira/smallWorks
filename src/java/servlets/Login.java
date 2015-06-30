package servlets;

import user.ManageUserLocal;
import user.User;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Utilizador
 */

public class Login extends HttpServlet {
    
    @EJB
    private ManageUserLocal mu;
    private int control = 0;
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("text/html;charset=UTF-8");

        String ni = this.checkNick(req.getParameter("nick"), req);
        String p = this.checkPasswords(req.getParameter("password"), req);

        
        RequestDispatcher reqDispatcher = null;
        if(ni != null && p != null) {
            User u = mu.login(ni, p);
            this.makeDecision(u, req, resp, reqDispatcher);
        } else {
            this.control++;
            reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/login/Login.jsp");
            reqDispatcher.forward(req, resp);
        }
    }
    
    private String checkNick(String nick, HttpServletRequest req) {
        if(nick != null && !nick.trim().equals("")) {
            return nick;
        } else {
            this.checkFirstTime("nick", "fill nick field", req);
            return null;
        }
    }
    
    private String checkPasswords(String pass, HttpServletRequest req) {
        if(pass != null && !pass.trim().equals("")) {
            return pass;
        } else {
            this.checkFirstTime("pass","fill password field", req);
            return null;
        }
    }
    
    private void makeDecision(User u, HttpServletRequest req, HttpServletResponse resp, RequestDispatcher reqDispatcher) throws ServletException, IOException {

        if(u != null) {
            req.setAttribute("user", u);
            reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/index.jsp");
        } else { // handler errors
            this.control++;
            req.setAttribute("err", "Worng credential combination");
            reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/login/Login.jsp");
        }
        reqDispatcher.forward(req, resp);
    }
    
    private void checkFirstTime(String name, String msg, HttpServletRequest req) {
        if(this.control > 0)
            req.setAttribute(name, msg);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.processRequest(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req,resp);
    }

    @Override
    public String getServletInfo() {
        return "Servlet info";
    }
}
