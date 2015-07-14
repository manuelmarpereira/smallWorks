/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import interfaces.ManageDistrictLocal;

import java.io.IOException;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import tp_aa.District;
import tp_aa.SubTask;

/**
 *
 * @author PC
 */
public class DistrictSVL extends HttpServlet {

    @EJB
    private ManageDistrictLocal md;

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json;charset=UTF-8");

        ArrayList<District> ds = md.getALL();

        String json = "[";
        for (int i = 0; i < ds.size(); i++) {
            if (i != ds.size() - 1) {
                json = json + buildJson(ds.get(i)) + ",";
            } else {
                json = json + buildJson(ds.get(i));
            }
        }
        json = json + "]";
        resp.getWriter().print(json);
    }

    private String buildJson(District u) {
        return "{\"id\": \"" + u.getId() + "\","
                + "\"name\": \"" + u.getName() + "\""
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
