/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

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
public class VerifyUser extends HttpServlet{
    
    @EJB
    private ManageUserLocal mu;
    
     protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        resp.setContentType("application/json;charset=UTF-8");
        
        boolean rp = mu.dadosUserExist(req.getParameter("email"),req.getParameter("nick"));
         resp.getWriter().print(" {\"resp\" : \""+rp+"\"} ");
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
