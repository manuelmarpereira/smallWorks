/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import javax.ejb.Local;
import tp_aa.InitWork;

/**
 *
 * @author PC
 */
@Local
public interface ManageInitWorkLocal {
    public List<InitWork> getInitWorkUser(int iduser);
    
}
