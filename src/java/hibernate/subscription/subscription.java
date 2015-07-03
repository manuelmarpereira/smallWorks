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
package hibernate.subscription;

public class subscription {
	public subscription() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == hibernate.globalconf.ORMConstants.KEY_SUBSCRIPTION_SUBSDISTRICT) {
			this.subsDistrict = (hibernate.district.District) owner;
		}
		
		else if (key == hibernate.globalconf.ORMConstants.KEY_SUBSCRIPTION_SUBSTASK) {
			this.subsTask = (hibernate.task.Task) owner;
		}
		
		else if (key == hibernate.globalconf.ORMConstants.KEY_SUBSCRIPTION_USER) {
			this.user = (hibernate.user.User) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private hibernate.user.User user;
	
	private hibernate.task.Task subsTask;
	
	private hibernate.district.District subsDistrict;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setSubsDistrict(hibernate.district.District value) {
		this.subsDistrict = value;
	}
	
	public hibernate.district.District getSubsDistrict() {
		return subsDistrict;
	}
	
	public void setSubsTask(hibernate.task.Task value) {
		this.subsTask = value;
	}
	
	public hibernate.task.Task getSubsTask() {
		return subsTask;
	}
	
	public void setUser(hibernate.user.User value) {
		if (user != null) {
			user.subscriptions.remove(this);
		}
		if (value != null) {
			value.subscriptions.add(this);
		}
	}
	
	public hibernate.user.User getUser() {
		return user;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_User(hibernate.user.User value) {
		this.user = value;
	}
	
	private hibernate.user.User getORM_User() {
		return user;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
