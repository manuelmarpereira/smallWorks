/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;


import java.util.ArrayList;
import javax.ejb.Local;
import webService.UserTest;

/**
 *
 * @author PC
 */
@Local
public interface ManageWebServiceLocal {
    public ArrayList<UserTest> getuserWebService(int qtd, String task);
}
