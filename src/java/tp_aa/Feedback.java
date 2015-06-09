/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package tp_aa;

public class Feedback {
	public Feedback() {
	}
	
	private int ID;
	
	private tp_aa.Classification Classification;
	
	private String coment;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setComent(String value) {
		this.coment = value;
	}
	
	public String getComent() {
		return coment;
	}
	
	public void setClassification(tp_aa.Classification value) {
		this.Classification = value;
	}
	
	public tp_aa.Classification getClassification() {
		return Classification;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
