package servlets;

import interfaces.ManageUserLocal;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

public class EditUserPhotoSvl extends HttpServlet {

    @EJB
    private ManageUserLocal mu;
    private String loctssave = ("assets"+File.separator+"img" + File.separator + "users" + File.separator);
    private String fname;

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("application/json;charset=UTF-8");

        String ids = req.getParameter("id");
        RequestDispatcher reqDispatcher;
        System.out.println("chegou: " + ids);
        if (ids != null) {
            Integer id = Utils.Utils.validateInts(ids);
            boolean response = false;
            String filePath = "";
            if (id != null) {
                System.out.println("Edição da photo id: " + id);
                filePath = this.saveImg(id, req);
                if (filePath != null) {
                    response = mu.updateUserPhoto(id, fname);
                    System.out.println("Edição da photo: " + fname);
                }
            }
            String tmp = getServletContext().getRealPath("/").concat(loctssave).concat(fname);
            System.out.println("tmp: " + tmp);
            File f = new File(tmp);
//            System.out.println("Name final: " + f.getName());
            while (!f.exists()) {
            }
//            resp.sendRedirect("/smallWorks/user/show.jsp");
            resp.getWriter().print("{\"resp\": \"/user/show.jsp\"}");
            
//            reqDispatcher = getServletConfig().getServletContext().getRequestDispatcher("/user/show.jsp");
//            reqDispatcher.forward(req, resp);
        }
    }

    private File checkImages(String pathImgs, int id) {
        File folder = new File(pathImgs);
        File[] listOfFiles = folder.listFiles();
        if(listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isFile() && file.getName().contains("_" + id + "_")) {
                    return file;
                }
            }
        }
        return null;
    }

    private String saveImg(int ids, HttpServletRequest req) {
        InputStream fileContent = null;
        OutputStream out = null;
        try {
            Part filePart = req.getPart("imagefile");
            fileContent = filePart.getInputStream();

            String sl = getServletContext().getRealPath("/");

            if (sl != null) {
                String local = sl.replace(File.separator + "build", "");
                System.out.println("local name: " + local);
                String flocal = local.concat(loctssave);///smallWorks/web/assets/img/users/
                System.out.println("final local name: " + flocal);
                // verificar se ja existe uma foto deste id
                File exist = this.checkImages(flocal, ids);// _1_124152524.png | null
                
                fname = flocal.concat("_" + ids + "_" + new Date().getTime() + ".png");
                System.out.println("final name: " + fname);
                File imgFile = new File(fname);
                fname = imgFile.getName();
                if (!imgFile.exists()) {
                    imgFile.createNewFile();
                }
                if(exist == null) { //create
                    exist = imgFile;
                } else { // rename 
                    exist.renameTo(imgFile);
                }
                    
                out = new FileOutputStream(exist);
                int read = 0;
                final byte[] bytes = new byte[fileContent.available()];

                while ((read = fileContent.read(bytes)) != -1) {
                    out.write(bytes, 0, read);
                }
                
                return exist.getPath();
            }

        } catch (IOException | ServletException i) {
            System.out.println("save img exception");
            i.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException i) {
                }
            }
            if (fileContent != null) {
                try {
                    fileContent.close();
                } catch (IOException o) {
                }
            }
        }
        return null;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.processRequest(req, resp);
    }

}
