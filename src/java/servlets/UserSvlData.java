package servlets;


import interfaces.ManageMakeWorkLocal;

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
    @EJB
    private ManageMakeWorkLocal mf;
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("application/json;charset=UTF-8");
        
        String ids = req.getParameter("id");
        if(ids != null) {
            Integer id = Utils.Utils.validateInts(ids);
            User u = null;

            double feedback = 0;
            if(id != null) {
                u = mu.getUser(id);
                feedback = mf.getFeedback(id);
            }
            System.out.println("feedback calculated: " + feedback);
            resp.getWriter().print(buildJson(u,feedback));
        }
    }
    
    private String buildJson(User u, double fb) { //, double fb

        return "{\"id\": \""+ u.getId()+"\","+
                "\"idDistrict\": \""+ u.getDistrict().getId()+"\","+
                "\"nameDistrict\": \""+ u.getDistrict().getName()+"\","+
                "\"nick\": \""+ u.getNick()+"\","+
                "\"firstname\": \""+ u.getFirstname()+"\","+
                "\"lastname\": \""+ u.getLastname()+"\","+
                "\"email\": \""+ u.getEmail()+"\","+
                "\"photo\": \""+ u.getPhoto()+"\","+
                "\"feedback\": \""+ fb+"\","+
                "\"coordLat\": \""+ u.getCoordLat()+"\","+
                "\"coordLong\": \""+ u.getCoordLong()+"\""+
               "}";
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }
    
}
