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

import java.util.Observable;

public class Work extends Observable {
	public Work() {
	}
	
	private int id;
	
	private tp_aa.User Creator;
	
	private tp_aa.SubTask subTask;
	
	private tp_aa.User Worker;
	
	private tp_aa.District Localization;
	
	private String title;
	
	private String description;
	
	private double price;
	
	private boolean negotiable;
	
	private String coordLat;
	
	private String coordLong;
	
	private java.util.Date startDate;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
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
	
	public void setCoordLat(String value) {
		this.coordLat = value;
	}
	
	public String getCoordLat() {
		return coordLat;
	}
	
	public void setCoordLong(String value) {
		this.coordLong = value;
	}
	
	public String getCoordLong() {
		return coordLong;
	}
	
	public void setStartDate(java.util.Date value) {
		this.startDate = value;
	}
	
	public java.util.Date getStartDate() {
		return startDate;
	}
	
	public void setCreator(tp_aa.User value) {
		this.Creator = value;
	}
	
	public tp_aa.User getCreator() {
		return Creator;
	}
	
	public void setSubTask(tp_aa.SubTask value) {
		this.subTask = value;
	}
	
	public tp_aa.SubTask getSubTask() {
		return subTask;
	}
	
	public void setWorker(tp_aa.User value) {
		this.Worker = value;
	}
	
	public tp_aa.User getWorker() {
		return Worker;
	}
	
	public void setLocalization(tp_aa.District value) {
		this.Localization = value;
	}
	
	public tp_aa.District getLocalization() {
		return Localization;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
