package servlets;

import interfaces.ManageUserLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tp_aa.User;

public class UserSvlData extends HttpServlet {
    
    @EJB
    private ManageUserLocal mu;
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("application/json;charset=UTF-8");
        
        String ids = req.getParameter("id");
        if(ids != null) {
            Integer id = validateInts(ids);
            User u = null;
            if(id != null) {
                u = mu.getUser(id);
            }
            resp.getWriter().print(buildJson(u));
        }
    }
    
    private String buildJson(User u) {
        return "{\"id\": \""+ u.getId()+"\","+
                "\"idDistrict\": \""+ u.getDistrict().getId()+"\","+
                "\"nameDistrict\": \""+ u.getDistrict().getName()+"\","+
                "\"nick\": \""+ u.getNick()+"\","+
                "\"firstname\": \""+ u.getFirstname()+"\","+
                "\"lastname\": \""+ u.getLastname()+"\","+
                "\"email\": \""+ u.getEmail()+"\","+
                "\"coordLat\": \""+ u.getCoordLat()+"\","+
                "\"coordLong\": \""+ u.getCoordLong()+"\""+
               "}";
        
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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }
    
}
