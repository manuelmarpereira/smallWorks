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

import user.User;

public class Work {
	public Work() {
	}
	
	private int ID;
	
	private tp_aa.District Localization;
	
	private tp_aa.Task Tasks;
	
	private User Worker;
	
	private String title;
	
	private String description;
	
	private double price;
	
	private boolean negotiable;
	
	private String state;
	
	private java.util.Date startDate;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setPrice(double value) {
		this.price = value;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setNegotiable(boolean value) {
		this.negotiable = value;
	}
	
	public boolean getNegotiable() {
		return negotiable;
	}
	
	public void setState(String value) {
		this.state = value;
	}
	
	public String getState() {
		return state;
	}
	
	public void setStartDate(java.util.Date value) {
		this.startDate = value;
	}
	
	public java.util.Date getStartDate() {
		return startDate;
	}
	
	public void setLocalization(tp_aa.District value) {
		this.Localization = value;
	}
	
	public tp_aa.District getLocalization() {
		return Localization;
	}
	
	public void setWorker(User value) {
		this.Worker = value;
	}
	
	public User getWorker() {
		return Worker;
	}
	
	public void setTasks(tp_aa.Task value) {
		this.Tasks = value;
	}
	
	public tp_aa.Task getTasks() {
		return Tasks;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
