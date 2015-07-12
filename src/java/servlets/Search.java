package servlets;

import interfaces.ManageWorkLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdk.nashorn.internal.runtime.regexp.joni.EncodingHelper;

/**
 *
 * @author PC
 */
public class Search extends HttpServlet {

    @EJB
    ManageWorkLocal mw;

    @Override
    public void destroy() {
        super.destroy();
        this.mw = null;
    }

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int user = 0;
        if (req.getParameter("iduser") == null || req.getParameter("iduser").equals("")) {
            user = 0;
        } else {
            user = Integer.parseInt(req.getParameter("iduser"));
        }
        ArrayList work = null;
        String order = req.getParameter("order");

        if (req.getParameter("order") != null) {
            work = mw.getWorks(user, 0, 100, true, req.getParameter("location"), req.getParameter("task"), Integer.parseInt(order), req.getParameter("amount_low"), req.getParameter("amount_high"));
        } else {
            work = mw.getWorks(user, 0, 100, true, "%%", "%%", 1, "0", "500");
        }
        RequestDispatcher reqDispatcher;
        req.setAttribute("works", work);
        req.setAttribute("district", req.getParameter("location"));
        req.setAttribute("task", req.getParameter("task"));
        req.setAttribute("order", req.getParameter("order"));

        reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/offer/search.jsp");
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

    @Override
    public String getServletInfo() {
        return "Servlet show works";
    }

}
