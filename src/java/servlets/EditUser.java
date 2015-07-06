package servlets;

import com.google.gson.Gson;
import interfaces.ManageUserLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tp_aa.User;

public class EditUser extends HttpServlet {
    
    @EJB
    private ManageUserLocal mu;
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("application/json;charset=UTF-8");

        Integer id = validateInts(req.getParameter("id"));
        
        User u = null;
        //RequestDispatcher reqDispatcher;
        
        if(id != null) {
            u = mu.getUser(id);
            u.setPassword(null);
//            req.setAttribute("useredit", u);
            
        }
        String ju = new Gson().toJson(u);
        System.out.println("user: " + ju);
        PrintWriter out = resp.getWriter();
//        resp.getWriter().flush();
//        resp.getWriter().print(ju);
        out.write(ju);
        out.flush();
        out.close();
//        resp.getWriter().close();
//        reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/user/editUser.jsp");
//        reqDispatcher.forward(req, resp);
//        resp.getWriter().write(u.get);
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
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }
    
}
