/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webService;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import interfaces.ManageWebServiceLocal;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;


@Path("user")
public class GetUserService {
    
    @EJB
    private ManageWebServiceLocal mws;

    @GET
    @Path("/getusers")
    @Produces("application/json;charset=utf-8")
    public String getUserData(@QueryParam("qtd") int qtd, @QueryParam("task") String task) { // send user

        ArrayList<UserTest> l = new ArrayList<>();
        Gson g = new Gson();
        if (qtd == 0) {
            return g.toJson(l, new TypeToken<ArrayList<UserTest>>() {
            }.getType());
        }

        l = mws.getuserWebService(qtd, task);

        return g.toJson(l, new TypeToken<ArrayList<UserTest>>() {
        }.getType());

    }
    
}
