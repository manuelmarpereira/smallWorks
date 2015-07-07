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

public class SubTask {
	public SubTask() {
	}
	
	private int id;
	
	private tp_aa.Task task;
	
	private String name;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setTask(tp_aa.Task value) {
		this.task = value;
	}
	
	public tp_aa.Task getTask() {
		return task;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
