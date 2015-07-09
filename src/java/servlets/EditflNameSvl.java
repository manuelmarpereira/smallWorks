package servlets;

import interfaces.ManageUserLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditflNameSvl extends HttpServlet {
    
    @EJB
    private ManageUserLocal mu;
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("application/json;charset=UTF-8");
        
        String ids = req.getParameter("id"),
                fn = req.getParameter("firstname"),
                ln = req.getParameter("lastname");
        
        if(ids != null && Utils.Utils.validateStrings(fn) && Utils.Utils.validateStrings(ln)) {
            Integer id = Utils.Utils.validateInts(ids);
            boolean response = false;
            if(id != null) {
                response = mu.updateUserflName(id,fn,ln);
            }
            System.out.println("Edição de first and last name: " + response);
            resp.getWriter().print("{\"resp\": \""+ response +"\"}");
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }
}
