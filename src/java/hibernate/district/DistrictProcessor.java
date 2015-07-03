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
package hibernate.district;

import org.orm.PersistentException;
public class DistrictProcessor {
	private int ID;
	
	private String name;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name == null ? "" : name;
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
				hibernate.district.District _district = hibernate.district.DistrictDAO.loadDistrictByORMID(getID());
				if (_district!= null) {
					copyFromBean(_district);
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
				hibernate.district.District _district = hibernate.district.DistrictDAO.createDistrict();
				copyToBean(_district);
				if (DistrictDAO.save(_district)) {
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
				hibernate.district.District _district= hibernate.district.DistrictDAO.loadDistrictByORMID(getID());
				if (_district != null) {
					copyToBean(_district);
					if (DistrictDAO.save(_district)) {
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
				hibernate.district.District _district = hibernate.district.DistrictDAO.loadDistrictByORMID(getID());
				if (_district != null && DistrictDAO.deleteAndDissociate(_district)) {
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
	
	private void copyFromBean(hibernate.district.District _district) {
		setName(_district.getName());
		setID(_district.getORMID());
	}
	
	private void copyToBean(hibernate.district.District _district) {
		_district.setName(getName());
	}
	
}

