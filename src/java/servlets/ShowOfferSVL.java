/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import interfaces.ManageMakeWorkLocal;
import interfaces.ManageWorkLocal;
import java.io.IOException;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tp_aa.Work;

/**
 *
 * @author PC
 */
public class ShowOfferSVL extends HttpServlet {

    @EJB
    ManageWorkLocal mw;

    @EJB
    private ManageMakeWorkLocal mf;

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=UTF-8");
        Work work = mw.getWork(Integer.parseInt(req.getParameter("id")));
        if (work.getClass().getName().equals("tp_aa.Work")){
        double feedback = 0;
        feedback = mf.getFeedback(Integer.parseInt(req.getParameter("id")));
        resp.getWriter().print(buildJson(work, feedback));
        }else{
            resp.getWriter().print("{ \"work\": \"null\" }");
        }

    }

    private String buildJson(Work est, double feed) {
        return "{\"idwork\": \"" + est.getId() + "\","
                + "\"title\": \"" + est.getTitle() + "\","
                + "\"datastart\": \"" + est.getStartDate() + "\","
                + "\"description\": \"" + est.getDescription() + "\","
                + "\"price\": \"" + est.getPrice() + "\","
                + "\"negociavel\": \"" + est.getNegotiable() + "\","
                + "\"email\": \"" + est.getCreator().getEmail() + "\","
                + "\"district\": \"" + est.getCreator().getDistrict().getName() + "\","
                + "\"photo\": \"" + est.getCreator().getPhoto() + "\","
                + "\"latitude\": \"" + est.getCoordLat() + "\","
                + "\"longitude\": \"" + est.getCoordLong() + "\","
                + "\"feedback\": \"" + feed + "\","
                + "\"lastname\": \"" + est.getCreator().getLastname() + "\","
                + "\"name\": \"" + est.getCreator().getFirstname() + " " + "\""
                + "}";
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
