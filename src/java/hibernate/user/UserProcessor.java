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

import org.orm.PersistentException;
public class UserProcessor {
	private int ID;
	
	private String nick;
	
	private String firstname;
	
	private String lastname;
	
	private String password;
	
	private String email;
	
	private String photo;
	
	private String coordLat;
	
	private String coordLong;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setNick(String value) {
		this.nick = value;
	}
	
	public String getNick() {
		return nick == null ? "" : nick;
	}
	
	public void setFirstname(String value) {
		this.firstname = value;
	}
	
	public String getFirstname() {
		return firstname == null ? "" : firstname;
	}
	
	public void setLastname(String value) {
		this.lastname = value;
	}
	
	public String getLastname() {
		return lastname == null ? "" : lastname;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password == null ? "" : password;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email == null ? "" : email;
	}
	
	public void setPhoto(String value) {
		this.photo = value;
	}
	
	public String getPhoto() {
		return photo == null ? "" : photo;
	}
	
	public void setCoordLat(String value) {
		this.coordLat = value;
	}
	
	public String getCoordLat() {
		return coordLat == null ? "" : coordLat;
	}
	
	public void setCoordLong(String value) {
		this.coordLong = value;
	}
	
	public String getCoordLong() {
		return coordLong == null ? "" : coordLong;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int district_districtID;
	
	public void setDistrict_districtID(int value) {
		this.district_districtID = value;
	}
	
	public int getDistrict_districtID() {
		return district_districtID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				hibernate.user.User _user = hibernate.user.UserDAO.loadUserByORMID(getID());
				if (_user!= null) {
					copyFromBean(_user);
					result = "Search success";
				}
				else {
					result = "Search failed";
				}
			}
			catch (PersistentException e) {
				result = "Search error: " + e.toString();
			}
		}
		else if(action.equals("insert"))  {
			try {
				hibernate.user.User _user = hibernate.user.UserDAO.createUser();
				copyToBean(_user);
				if (UserDAO.save(_user)) {
					result = "Insert success";
				}
				else {
					result = "Insert failed";
				}
			}
			catch (Exception e) {
				result = "Insert error: " + e.toString();
			}
		}
		else if (action.equals("update")) {
			try {
				hibernate.user.User _user= hibernate.user.UserDAO.loadUserByORMID(getID());
				if (_user != null) {
					copyToBean(_user);
					if (UserDAO.save(_user)) {
						result = "Update success";
					}
					 else {
						result = "Update failed";
					}
				}
				 else  {
					result = "Update failed";
				}
				
			}
			catch (PersistentException e) {
				result = "Update error: " + e.toString();
			}
		}
		else if (action.equals("delete")) {
			try {
				hibernate.user.User _user = hibernate.user.UserDAO.loadUserByORMID(getID());
				if (_user != null && UserDAO.deleteAndDissociate(_user)) {
					result = "Delete success";
				}
				else {
					result = "Delete failed";
				}
			}
			catch (PersistentException e)  {
				result = "Delete error: " + e.toString();
			}
		}
		else if (action.equals("")) {
			result = "";
		}
		action = "";
		return result;
	}
	
	private void copyFromBean(hibernate.user.User _user) {
		setNick(_user.getNick());
		setFirstname(_user.getFirstname());
		setLastname(_user.getLastname());
		setPassword(_user.getPassword());
		setEmail(_user.getEmail());
		setPhoto(_user.getPhoto());
		setCoordLat(_user.getCoordLat());
		setCoordLong(_user.getCoordLong());
		setID(_user.getORMID());
		
		{
			hibernate.district.District _district = _user.getDistrict();
			if (_district != null) {
				setDistrict_districtID(_district.getORMID());
			}
		}
		
	}
	
	private void copyToBean(hibernate.user.User _user) {
		_user.setNick(getNick());
		_user.setFirstname(getFirstname());
		_user.setLastname(getLastname());
		_user.setPassword(getPassword());
		_user.setEmail(getEmail());
		_user.setPhoto(getPhoto());
		_user.setCoordLat(getCoordLat());
		_user.setCoordLong(getCoordLong());
		try  {
			hibernate.district.District _district = hibernate.district.DistrictDAO.loadDistrictByORMID(getDistrict_districtID());
			_user.setDistrict(_district);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

