package servlets;

import interfaces.ManageUserLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditlocSvl extends HttpServlet {
    
    @EJB
    private ManageUserLocal mu;
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("application/json;charset=UTF-8");
        
        String ids = req.getParameter("id"),
               dist = req.getParameter("distrito"),
               clan = req.getParameter("latitude"),
               clon = req.getParameter("longitude");
        
        System.out.println("id: "+ ids);
        System.out.println("dist: "+ dist);
        System.out.println("clan: "+ clan);
        System.out.println("clon: "+ clon);
        boolean response = false;
        if(Utils.Utils.validateStrings(ids) && Utils.Utils.validateStrings(dist)&& Utils.Utils.validateStrings(clan) && Utils.Utils.validateStrings(clon)) {
            try {
                Integer id = Utils.Utils.validateInts(ids);
                
                response = mu.updateUserDistrict(id, dist, clan, clon);
                System.out.println("Edição do distrito: " + response);
            } catch(NumberFormatException n){ }
        }
        resp.getWriter().print("{\"resp\":\""+response+"\"}");
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }
}
