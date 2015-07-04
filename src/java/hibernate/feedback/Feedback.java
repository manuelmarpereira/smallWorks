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
package hibernate.feedback;

public class Feedback {
	public Feedback() {
	}
	
	private int id;
	
	private hibernate.classification.Classification Classification;
	
	private String coment;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setComent(String value) {
		this.coment = value;
	}
	
	public String getComent() {
		return coment;
	}
	
	public void setClassification(hibernate.classification.Classification value) {
		this.Classification = value;
	}
	
	public hibernate.classification.Classification getClassification() {
		return Classification;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
