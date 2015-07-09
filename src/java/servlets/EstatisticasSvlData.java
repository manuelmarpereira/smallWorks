/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import auxiliar.Estatisticas;
import interfaces.ManageUserLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
public class EstatisticasSvlData extends HttpServlet {

    @EJB
    private ManageUserLocal mu;
    
    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=UTF-8");
        Estatisticas est = mu.estatisticas(Integer.parseInt(req.getParameter("id")));
        resp.getWriter().print(buildJson(est));
    }

    private String buildJson(Estatisticas est) {
        return "{\"iduser\": \""+est.getIduser()+"\","+
                "\"offersworker\": \""+ est.getTotalOffersWorker()+"\","+
                "\"winoffersworker\": \""+ est.getWintotalOffersWorker()+"\","+
                "\"offerscreator\": \""+ est.getTotalOffersCreator()+"\","+
                "\"winofferscreator\": \""+ est.getWintotalOffersCreator()+"\","+
                "\"diference\": \""+est.getDiference()+"\""+
               "}";
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
