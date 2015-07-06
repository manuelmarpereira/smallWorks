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

public class RegisterUser extends HttpServlet {

    @EJB
    private ManageUserLocal mu;

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User u = null;

        resp.setContentType("text/html;charset=UTF-8");
        String n = req.getParameter("nick"),
                p = req.getParameter("password"),
                fn = req.getParameter("firstname"),
                ln = req.getParameter("lastname"),
                em = req.getParameter("email"),
                //ph = req.getParameter("photo"),
                cla = req.getParameter("latitude"),
                clo = req.getParameter("longitude"),
                dis = req.getParameter("distrito");

        if (validateData(n) && checkPasswords(p, req.getParameter("confPass")) && validateData(fn)
                && validateData(ln) && validateData(em) && validateData(cla) && validateData(clo)) {
            u = new User();
            u.setNick(n);
            u.setFirstname(fn);
            u.setPassword(p);
            u.setLastname(ln);
            //u.setPhoto(); AINDA NAO ESTA FEITO
            u.setEmail(em);
            u.setCoordLat(cla);
            u.setCoordLong(clo);
            // we can add to database
            u = mu.registUser(u,dis);
          
        }

        this.makeDecision(u, req, resp);
    }

    private boolean validateData(String s) {
        return s != null && !s.trim().equals("");
    }

    private boolean checkPasswords(String pass, String cpass) {
        if (validateData(pass) && validateData(cpass)) {
            if (pass.equals(cpass)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void destroy() {
        super.destroy();
        this.mu = null;
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
        return "Servlet info";
    }

    private void makeDecision(User u, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher reqDispatcher;

        if (u != (null)) {
            User n = new User();
            n.setId(u.getId());
            n.setNick(u.getNick());
            req.setAttribute("user", n);
            reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/index.jsp");
        } else {
            reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/user/registerUser.jsp");
        }
        reqDispatcher.forward(req, resp);
    }
}
