package servlets;

import interfaces.ManageUserLocal;
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
public class RegisteUser extends HttpServlet {
    
    @EJB
    private ManageUserLocal mu;
    private int control = 0, n;

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String nick, pass, fn, ln, email;
        User u = new User();
        this.n = 0;

        resp.setContentType("text/html;charset=UTF-8");
        
        //nick = req.getParameter("nick");
        this.checkNick(req.getParameter("nick"), u, req);
        //pass = req.getParameter("pass");
        this.checkPasswords(req.getParameter("password"), u, req);
        //fn = req.getParameter("fn");
        this.checkFirstName(req.getParameter("fn"), u, req);
        //ln = req.getParameter("ln");
        this.checkLastName(req.getParameter("ln"), u, req);
        //email = req.getParameter("email");
        this.checkemail(req.getParameter("email"), u, req);

        this.makeDecision(u, req, resp);
        
    }

    @Override
    public void destroy() {
        super.destroy();
        this.control = 0;
        this.mu = null;
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
    
    private void checkNick(String nick, User u, HttpServletRequest req) {
        if(nick != null && !nick.trim().equals("")) {
            u.setNick(nick);
            this.n++;
        } else {
            u.setNick("");
            this.checkFirstTime("nick", "fill nick field", req);
        }
    }
    
    private void checkPasswords(String pass, User u, HttpServletRequest req) {
        if(pass != null && !pass.trim().equals("")) {
            u.setPassword(pass);
            String tmpa2 = req.getParameter("confPass");
            if(tmpa2 != null && !tmpa2.trim().equals("")) {
                if(u.getPassword().equals(tmpa2)) {
                    this.n++;
                } else {
                    this.checkFirstTime("conf", "Passwords don't match", req);
                }
            } else {
                this.checkFirstTime("pconf", "fill password confirm field", req);
            }
        } else {
            u.setPassword("");
            this.checkFirstTime("pass","fill password field", req);
        }
    }
    
    private void checkFirstName(String fn, User u, HttpServletRequest req) {
        if( fn != null && !fn.trim().equals("")) {
            u.setFirstname(fn);
            this.n++;
        } else {
            u.setFirstname("");
            this.checkFirstTime("fn", "fill first name field", req);
        }
    }
    
    private void checkLastName(String ln, User u, HttpServletRequest req) {
        if( ln != null && !ln.trim().equals("")) {
            u.setLastname(ln);
            this.n++;
        } else {
            u.setLastname("");
            this.checkFirstTime("ln", "fill last name field", req);
        }
    }
    
    private void checkemail(String email, User u, HttpServletRequest req) {
        if( email != null && !email.trim().equals("")) {
            u.setEmail(email);
            this.n++;
        } else {
            u.setEmail("");
            this.checkFirstTime("em", "fill email field", req);
        }
    }
    
    private void makeDecision(User u, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher reqDispatcher ;
        if(this.n == 5) {
            

            u=mu.registUser(u);
            if(u!=(null)){
            reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/login/Login.jsp");
            req.setAttribute("user", u);
            }else{
            reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/login/RegisteUser.jsp");
            }
     
        } else {// handler errors 
            control++;
            reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/login/RegisteUser.jsp");
            
        }
        
        reqDispatcher.forward(req, resp);
        
    }
    
    private void checkFirstTime(String name, String msg, HttpServletRequest req) {
      
            
    }
}
