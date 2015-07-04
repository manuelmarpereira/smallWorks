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
package hibernate.work;

import hibernate.user.User;
import hibernate.task.Task;
import java.util.Observable;

public class Work extends Observable {
	public Work() {
	}
	
	private int id;
	
	private hibernate.user.User Creator;
	
	private hibernate.task.Task Tasks;
	
	private hibernate.user.User Worker;
	
	private hibernate.district.District Localization;
	
	private String title;
	
	private String description;
	
	private double price;
	
	private boolean negotiable;
	
	private long coordLat;
	
	private long coordLong;
	
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
	
	public void setCoordLat(long value) {
		this.coordLat = value;
	}
	
	public long getCoordLat() {
		return coordLat;
	}
	
	public void setCoordLong(long value) {
		this.coordLong = value;
	}
	
	public long getCoordLong() {
		return coordLong;
	}
	
	public void setStartDate(java.util.Date value) {
		this.startDate = value;
	}
	
	public java.util.Date getStartDate() {
		return startDate;
	}
	
	public void setCreator(User value) {
		this.Creator = value;
	}
	
	public User getCreator() {
		return Creator;
	}
	
	public void setTasks(Task value) {
		this.Tasks = value;
	}
	
	public Task getTasks() {
		return Tasks;
	}
	
	public void setWorker(User value) {
		this.Worker = value;
	}
	
	public User getWorker() {
		return Worker;
	}
	
	public void setLocalization(hibernate.district.District value) {
		this.Localization = value;
	}
	
	public hibernate.district.District getLocalization() {
		return Localization;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
