/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import implementations.ManageFeedback;
import interfaces.ManageFeedbackLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
public class Feedback extends HttpServlet {

    @EJB
    private ManageFeedbackLocal mf;

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        mf.AddFeedback(Integer.parseInt(req.getParameter("feedback")), Integer.parseInt(req.getParameter("idOffer")), req.getParameter("description"));
        RequestDispatcher reqDispatcher = null;
        req.setAttribute("page", "myOffers");
        reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/user/myOffers.jsp");
        reqDispatcher.forward(req, resp);
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
