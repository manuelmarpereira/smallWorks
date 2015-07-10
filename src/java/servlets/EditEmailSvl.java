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
        boolean response = false;
        if(Utils.Utils.validateStrings(ids) && Utils.Utils.validateStrings(e)) {
            try {
                Integer id = Utils.Utils.validateInts(ids);
                
                response = mu.updateUserEmail(id,e);
                System.out.println("Edição do email: " + response);
            }catch(NumberFormatException n){ }
        }
        resp.getWriter().print("{\"resp\":\""+response+"\"}");
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }
}
