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
package hibernate.makeWork;

public class MakeWork extends hibernate.work.Work {
	public MakeWork() {
	}
	
	private java.util.Date finishDate;
	
	private hibernate.feedback.Feedback Evaluation;
	
	public void setFinishDate(java.util.Date value) {
		this.finishDate = value;
	}
	
	public java.util.Date getFinishDate() {
		return finishDate;
	}
	
	public void setEvaluation(hibernate.feedback.Feedback value) {
		this.Evaluation = value;
	}
	
	public hibernate.feedback.Feedback getEvaluation() {
		return Evaluation;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
