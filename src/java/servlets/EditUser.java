package servlets;

import interfaces.ManageUserLocal;
import java.io.IOException;
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
//            req.setAttribute("useredit", u);
        }
        
        System.out.println("depois json");
        resp.getWriter().print(buildJson(u));
        System.out.println("depois print");
//        resp.getWriter().flush();
//        resp.getWriter().close();
//        reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/user/editUser.jsp");
//        reqDispatcher.forward(req, resp);
    }
    
    private String buildJson(User u) {
        return "{\"id\": \""+ u.getId()+"\","+
                "\"idDistrict\": \""+ u.getDistrict().getId()+"\","+
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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }
    
}
