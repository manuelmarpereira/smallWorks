/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import com.sendgrid.SendGrid;
import com.sendgrid.SendGridException;

import interfaces.ManageUserLocal;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
public class FacoJa extends HttpServlet {

    @EJB
    private ManageUserLocal mf;

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json;charset=UTF-8");
        String idoffer=req.getParameter("idoffer");
        String idworker=req.getParameter("idworker");
        boolean value = mf.startedToInit(Integer.parseInt(idworker),Integer.parseInt(idoffer));
        String title = req.getParameter("titoff");
        
        String emailreceive = req.getParameter("emailr");
        String namereceive= req.getParameter("namer");
        String emailsend =req.getParameter("personemailsend");
        String namesend =req.getParameter("namesend");
        SendGrid sendgrid = new SendGrid("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");
        SendGrid.Email email = new SendGrid.Email();
        email.addTo(emailreceive);
        email.addToName(namereceive);
        email.setFrom(emailsend);
        email.setSubject(namesend+" want to make your offer now");
        email.setHtml(html( emailreceive, namereceive,  title, emailsend, namesend));
          try {
            sendgrid.send(email);
        } catch (SendGridException ex) {
            Logger.getLogger(EmailContact.class.getName()).log(Level.SEVERE, null, ex);
        }
          resp.getWriter().print("{\"resp\":\"true\"}");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }
    
    private String html(String emailreceive,String namereceive, String title, String emailsend, String namesend) {
        Calendar now = Calendar.getInstance();
       String template =
                "<html>"+
                    "<center><img src=\"https://dl.dropboxusercontent.com/u/110418380/logo_name.png\"/></center>"+
                    "<table width=\"600\" style=\"padding:0 0 10px 10px\"><tbody><tr><td>\n\n\n" +
                    "<h1 style=\"font-size:14px\">An User wants to make your offer now</h1><br>\n" +
                    "Hello <a href=\"mailto:"+emailreceive+"\" target=\"_blank\">"+emailreceive+"</a>.<br>\n" +
                    "The next potential worker inform on <b>"+now.get(Calendar.DAY_OF_MONTH)+"."+(now.get(Calendar.MONTH)+1)+"."+now.get(Calendar.YEAR)+
                    " at "+now.get(Calendar.HOUR_OF_DAY)+":"+now.get(Calendar.MINUTE)+" Hours</b> that want to make your offer now<br>\n <br>\n" +
                    "<table><tbody><tr><td style=\"background:#1dace1; color:white\" width=\"140\">" +
                    "Work: </td><td> "+title+"" +
                    "</td></tr></tbody></table><br>\n" +
                    "<table><tbody><tr><td style=\"background:#1dace1; color:white\"  width=\"90\">"+
                    "Name:"+
                    "</td><td><b>"+namesend+"</b></td></tr><tr><td style=\"background:#1dace1; color:white\">"+
                   
                    "E-mail:" +
                    "</td><td><b><a href=\"mailto:"+emailsend+"\" target=\"_blank\">"+emailsend+"</a></b></td></tr>"+
                   
                    "" +
                    "</tbody></table><br>" +
                    
                    "<center><img src=\"http://www.connectedhotel.net/wp-content/uploads/2013/03/Do-it-now1.jpg\"/></center>"+                
                    "<br> <br>" +
                    
                    "Best regards, the " +
                    "<b><span class=\"il\">smallWorks</span> Team</b><br><br><br>" +
                    "<h1 style=\"font-size:14px\">Share Litle Works in <span class=\"il\">smallWorks</span>!</h1>"+
                    "<a style=\"color:#1dace1\" href=\"https://www.facebook.com/mysmallworks\" target=\"_blank\" >Follow us on Facebook</a><br>" +
                    "</td></tr></tbody></table>"+
                    "<center><img src=\"https://dl.dropboxusercontent.com/u/110418380/logo_pic.png\"/></center>"+
              
              "<html>";
        return template;
    }

}
