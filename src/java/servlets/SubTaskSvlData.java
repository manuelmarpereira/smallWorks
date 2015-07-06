package servlets;

import interfaces.ManageSubTaskLocal;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tp_aa.SubTask;

public class SubTaskSvlData extends HttpServlet {
    
    @EJB
    private ManageSubTaskLocal mt;
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("application/json;charset=UTF-8");
        
        String ids = req.getParameter("id");
        if(ids != null) {
            Integer id = validateInts(ids);
            List<SubTask> u = null;
            if(id != null) {
                u = mt.getSubTasks(id);
                if( u!= null) {
                    String json = "[";
                    for (int i=0; i<u.size(); i++) {
                        if(i != u.size()-1) {
                            json = json + buildJson(u.get(i))+ ",";
                        } else {
                            json = json + buildJson(u.get(i));
                        }
                    }
                    json = json + "]";
                    resp.getWriter().print(json);
                }
            }
        }
    }
    
    private String buildJson(SubTask u) {
        return "{\"id\": \""+ u.getId()+"\","+
                "\"name\": \""+ u.getName()+"\""+
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
