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

import org.orm.PersistentException;
public class UserProcessor {
	private int id;
	
	private String nick;
	
	private String firstname;
	
	private String lastname;
	
	private String password;
	
	private String email;
	
	private String photo;
	
	private String coordLat;
	
	private String coordLong;
	
	private String action="";
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
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
	
	private int district_districtid;
	
	public void setDistrict_districtid(int value) {
		this.district_districtid = value;
	}
	
	public int getDistrict_districtid() {
		return district_districtid;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				User _user = UserDAO.loadUserByORMID(getId());
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
				User _user = UserDAO.createUser();
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
				User _user= UserDAO.loadUserByORMID(getId());
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
				User _user = UserDAO.loadUserByORMID(getId());
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
	
	private void copyFromBean(User _user) {
		setNick(_user.getNick());
		setFirstname(_user.getFirstname());
		setLastname(_user.getLastname());
		setPassword(_user.getPassword());
		setEmail(_user.getEmail());
		setPhoto(_user.getPhoto());
		setCoordLat(_user.getCoordLat());
		setCoordLong(_user.getCoordLong());
		setId(_user.getORMID());
		
		{
			District _district = _user.getDistrict();
			if (_district != null) {
				setDistrict_districtid(_district.getORMID());
			}
		}
		
	}
	
	private void copyToBean(User _user) {
		_user.setNick(getNick());
		_user.setFirstname(getFirstname());
		_user.setLastname(getLastname());
		_user.setPassword(getPassword());
		_user.setEmail(getEmail());
		_user.setPhoto(getPhoto());
		_user.setCoordLat(getCoordLat());
		_user.setCoordLong(getCoordLong());
		try  {
			District _district = DistrictDAO.loadDistrictByORMID(getDistrict_districtid());
			_user.setDistrict(_district);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

