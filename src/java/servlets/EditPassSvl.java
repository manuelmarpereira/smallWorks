package servlets;

import interfaces.ManageUserLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditPassSvl extends HttpServlet {
    
    @EJB
    private ManageUserLocal mu;
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("application/json;charset=UTF-8");
        
        String ids = req.getParameter("id"),
                p = req.getParameter("pass");
        
        if(ids != null && Utils.Utils.validateStrings(p) ) {
            Integer id = Utils.Utils.validateInts(ids);
            boolean response = false;
            if(id != null) {
                response = mu.updateUserPass(id,p);
                System.out.println("Edição da password: " + response);
            }
            resp.getWriter().print("{\"resp\": \""+ response +"\"}");
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }
    
}
