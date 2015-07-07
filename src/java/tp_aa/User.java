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
import java.util.Observer;

public class User implements Observer {
	public User() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == tp_aa.ORMConstants.KEY_USER_SUBSCRIPTIONS) {
			return ORM_subscriptions;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == tp_aa.ORMConstants.KEY_USER_DISTRICT) {
			this.district = (tp_aa.District) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id;
	
	private tp_aa.District district;
	
	private String nick;
	
	private String firstname;
	
	private String lastname;
	
	private String password;
	
	private String email;
	
	private String photo;
	
	private String coordLat;
	
	private String coordLong;
	
	private java.util.Set ORM_subscriptions = new java.util.HashSet();
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public int getORMID() {
		return getId();
	}
	
	public void setNick(String value) {
		this.nick = value;
	}
	
	public String getNick() {
		return nick;
	}
	
	public void setFirstname(String value) {
		this.firstname = value;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setLastname(String value) {
		this.lastname = value;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPhoto(String value) {
		this.photo = value;
	}
	
	public String getPhoto() {
		return photo;
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
	
	private void setORM_Subscriptions(java.util.Set value) {
		this.ORM_subscriptions = value;
	}
	
	private java.util.Set getORM_Subscriptions() {
		return ORM_subscriptions;
	}
	
	public final tp_aa.subscriptionSetCollection subscriptions = new tp_aa.subscriptionSetCollection(this, _ormAdapter, tp_aa.ORMConstants.KEY_USER_SUBSCRIPTIONS, tp_aa.ORMConstants.KEY_SUBSCRIPTION_USER, tp_aa.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setDistrict(tp_aa.District value) {
		if (district != null) {
			district.user.remove(this);
		}
		if (value != null) {
			value.user.add(this);
		}
	}
	
	public tp_aa.District getDistrict() {
		return district;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_District(tp_aa.District value) {
		this.district = value;
	}
	
	private tp_aa.District getORM_District() {
		return district;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}

    @Override
    public void update(Observable o, Object arg) {
        /**
         * é para fazer
         */
    }
	
}
