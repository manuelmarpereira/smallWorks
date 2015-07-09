/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.ejb.Local;

@Local
public interface ManageFeedbackLocal {

    public void AddFeedback(int feedback, int idoffer, String comentario);
}
