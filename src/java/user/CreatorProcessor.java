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
package user;

import org.orm.PersistentException;
public class CreatorProcessor {
	private int ID;
	
	private String nick;
	
	private String firstname;
	
	private String lastname;
	
	private String password;
	
	private String email;
	
	private String photo;
	
	private long coordLat;
	
	private long coordLong;
	
	private String type;
	
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
	
	public void setType(String value) {
		this.type = value;
	}
	
	public String getType() {
		return type == null ? "" : type;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				Creator _creator = CreatorDAO.loadCreatorByORMID(getID());
				if (_creator!= null) {
					copyFromBean(_creator);
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
				Creator _creator = CreatorDAO.createCreator();
				copyToBean(_creator);
				if (CreatorDAO.save(_creator)) {
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
				Creator _creator= CreatorDAO.loadCreatorByORMID(getID());
				if (_creator != null) {
					copyToBean(_creator);
					if (CreatorDAO.save(_creator)) {
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
				Creator _creator = CreatorDAO.loadCreatorByORMID(getID());
				if (_creator != null && CreatorDAO.delete(_creator)) {
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
	
	private void copyFromBean(Creator _creator) {
		setNick(_creator.getNick());
		setFirstname(_creator.getFirstname());
		setLastname(_creator.getLastname());
		setPassword(_creator.getPassword());
		setEmail(_creator.getEmail());
		setPhoto(_creator.getPhoto());
		setCoordLat(_creator.getCoordLat());
		setCoordLong(_creator.getCoordLong());
		setType(_creator.getType());
		setID(_creator.getORMID());
	}
	
	private void copyToBean(Creator _creator) {
		_creator.setNick(getNick());
		_creator.setFirstname(getFirstname());
		_creator.setLastname(getLastname());
		_creator.setPassword(getPassword());
		_creator.setEmail(getEmail());
		_creator.setPhoto(getPhoto());
		_creator.setCoordLat(getCoordLat());
		_creator.setCoordLong(getCoordLong());
		_creator.setType(getType());
	}
	
}

