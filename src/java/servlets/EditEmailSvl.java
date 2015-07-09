package servlets;

import interfaces.ManageUserLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditEmailSvl extends HttpServlet {
    @EJB
    private ManageUserLocal mu;
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("application/json;charset=UTF-8");
        
        String ids = req.getParameter("id"),
                e = req.getParameter("email");
        System.out.println("Edição do id: " + ids);
        System.out.println("Edição do email: " + e);
//        RequestDispatcher reqDispatcher = null;
        if(ids != null && Utils.Utils.validateStrings(e)) {
            Integer id = Utils.Utils.validateInts(ids);
            boolean response = false;
            if(id != null) {
                response = mu.updateUserEmail(id,e);
                System.out.println("Edição do email: " + response);
            }
            resp.getWriter().print("{\"resp\":\""+response+"\"}");
//            reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/user/show.jsp");
//            reqDispatcher.forward(req, resp);
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }
}
