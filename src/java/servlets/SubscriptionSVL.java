/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import implementations.ManageSubscription;
import interfaces.ManageSubscriptionLocal;
import java.io.IOException;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
public class SubscriptionSVL extends HttpServlet {

    @EJB
    private ManageSubscriptionLocal msl;

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json;charset=UTF-8");
        String iduser = req.getParameter("id");
        String subtask = req.getParameter("subtask");
        String idloc = req.getParameter("idloc");
        Integer idusr = Integer.parseInt(iduser);
        Integer idsubtask = 0;
        Integer idlocalization = 0;

        if (subtask==null || subtask.equals("")) {
            idsubtask = 0;
        } else {
            idsubtask = Integer.parseInt(subtask);
        }
        if (idloc==null || idloc.equals("")) {
            idlocalization = 0;
        } else {
            idlocalization = Integer.parseInt(idloc);
        }
        
        msl.saveSubscriptions(idusr, idsubtask, idlocalization);
        resp.getWriter().print(buildJson());
    }

    private String buildJson() {
        return "{\"resp\": \"true\"  }";
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }

}
