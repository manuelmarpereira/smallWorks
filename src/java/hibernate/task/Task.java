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
package hibernate.task;

import hibernate.globalconf.ORMConstants;

public class Task {
	public Task() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TASK_SUBTAKS) {
			return ORM_subtaks;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id;
	
	private String name;
	
	private java.util.Set ORM_subtaks = new java.util.HashSet();
	
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
	
	private void setORM_Subtaks(java.util.Set value) {
		this.ORM_subtaks = value;
	}
	
	private java.util.Set getORM_Subtaks() {
		return ORM_subtaks;
	}
	
	public final hibernate.subTask.SubTaskSetCollection subtaks = new hibernate.subTask.SubTaskSetCollection(this, _ormAdapter, ORMConstants.KEY_TASK_SUBTAKS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
