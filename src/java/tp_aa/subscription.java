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

public class subscription {
	public subscription() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == tp_aa.ORMConstants.KEY_SUBSCRIPTION_SUBSDISTRICT) {
			this.subsDistrict = (tp_aa.District) owner;
		}
		
		else if (key == tp_aa.ORMConstants.KEY_SUBSCRIPTION_SUBSTASK) {
			this.subsTask = (tp_aa.SubTask) owner;
		}
		
		else if (key == tp_aa.ORMConstants.KEY_SUBSCRIPTION_USER) {
			this.user = (tp_aa.User) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private tp_aa.User user;
	
	private tp_aa.SubTask subsTask;
	
	private tp_aa.District subsDistrict;
	
	private void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setSubsDistrict(tp_aa.District value) {
		this.subsDistrict = value;
	}
	
	public tp_aa.District getSubsDistrict() {
		return subsDistrict;
	}
	
	public void setSubsTask(tp_aa.SubTask value) {
		this.subsTask = value;
	}
	
	public tp_aa.SubTask getSubsTask() {
		return subsTask;
	}
	
	public void setUser(tp_aa.User value) {
		if (user != null) {
			user.subscriptions.remove(this);
		}
		if (value != null) {
			value.subscriptions.add(this);
		}
	}
	
	public tp_aa.User getUser() {
		return user;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_User(tp_aa.User value) {
		this.user = value;
	}
	
	private tp_aa.User getORM_User() {
		return user;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
