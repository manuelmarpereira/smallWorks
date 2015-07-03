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
package hibernate.user;

public class User {
	public User() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == hibernate.globalconf.ORMConstants.KEY_USER_DISTRICT) {
			this.district = (hibernate.district.District) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int ID;
	
	private hibernate.district.District district =new hibernate.district.District();
	
	private String nick;
	
	private String firstname;
	
	private String lastname;
	
	private String password;
	
	private String email;
	
	private String photo;
	
	private String coordLat;
	
	private String coordLong;
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
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
	
	public void setDistrict(hibernate.district.District value) {
		if (district != null) {
			district.user.remove(this);
		}
		if (value != null) {
                   
               	value.user.add(this);
		}
	}
	
	public hibernate.district.District getDistrict() {
		return district;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_District(hibernate.district.District value) {
		this.district = value;
	}
	
	private hibernate.district.District getORM_District() {
		return district;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}