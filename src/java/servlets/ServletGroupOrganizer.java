/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
public class ServletGroupOrganizer extends HttpServlet {

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=UTF-8");
        String username = req.getParameter("usernameEvent");
        String password = req.getParameter("passwordEvent");
        String title = req.getParameter("titleEvent");
        String description = req.getParameter("descriptionEvent");

        String date = req.getParameter("dateEvent");
        int duration = Integer.parseInt(req.getParameter("durationEvent"));

        try {
            URL url = new URL("http://192.168.100.159/GroupOrganizer-web/WebServices/SmallWorksWebServices");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept", "application/json");
            conn.setDoOutput(true);

            String input = "{\"username\":\"" + username + "\",\"password\":\"" + password + "\",\"title\":\"" + title + "\",\"description\":\"" + description + "\",\"date\":\"" + date + "\",\"duration\":" + duration + "}";
            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();

            if (conn.getResponseCode() == HttpURLConnection.HTTP_CREATED) {
                resp.getWriter().print("{ \"resp\" : \"Inserted Successfully \" }");
            } else if (conn.getResponseCode() == 400) {
                resp.getWriter().print("{ \"resp\" : \"URL request error\" }");
            } else if (conn.getResponseCode() == 401) {
                resp.getWriter().print("{ \"resp\" : \"Authentication error\" }");
            }

            conn.disconnect();
        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

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
