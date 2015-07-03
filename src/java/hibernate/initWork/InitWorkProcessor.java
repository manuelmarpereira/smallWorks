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
package hibernate.initWork;

import org.orm.PersistentException;
public class InitWorkProcessor {
	private int ID;
	
	private String title;
	
	private String description;
	
	private double price;
	
	private boolean negotiable;
	
	private java.util.Date startDate;
	
	private long coordLat;
	
	private long coordLong;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return title == null ? "" : title;
	}
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description == null ? "" : description;
	}
	
	public void setPrice(double value) {
		this.price = value;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setNegotiable(boolean value) {
		this.negotiable = value;
	}
	
	public boolean getNegotiable() {
		return negotiable;
	}
	
	public void setStartDate(java.util.Date value) {
		this.startDate = value;
	}
	
	public java.util.Date getStartDate() {
		return startDate;
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
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int Creator_userID;
	
	public void setCreator_userID(int value) {
		this.Creator_userID = value;
	}
	
	public int getCreator_userID() {
		return Creator_userID;
	}
	
	private int Tasks_taskID;
	
	public void setTasks_taskID(int value) {
		this.Tasks_taskID = value;
	}
	
	public int getTasks_taskID() {
		return Tasks_taskID;
	}
	
	private int Worker_userID;
	
	public void setWorker_userID(int value) {
		this.Worker_userID = value;
	}
	
	public int getWorker_userID() {
		return Worker_userID;
	}
	
	private int Localization_districtID;
	
	public void setLocalization_districtID(int value) {
		this.Localization_districtID = value;
	}
	
	public int getLocalization_districtID() {
		return Localization_districtID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				hibernate.initWork.InitWork _initWork = hibernate.initWork.InitWorkDAO.loadInitWorkByORMID(getID());
				if (_initWork!= null) {
					copyFromBean(_initWork);
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
				hibernate.initWork.InitWork _initWork = hibernate.initWork.InitWorkDAO.createInitWork();
				copyToBean(_initWork);
				if (InitWorkDAO.save(_initWork)) {
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
				hibernate.initWork.InitWork _initWork= hibernate.initWork.InitWorkDAO.loadInitWorkByORMID(getID());
				if (_initWork != null) {
					copyToBean(_initWork);
					if (InitWorkDAO.save(_initWork)) {
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
				hibernate.initWork.InitWork _initWork = hibernate.initWork.InitWorkDAO.loadInitWorkByORMID(getID());
				if (_initWork != null && InitWorkDAO.delete(_initWork)) {
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
	
	private void copyFromBean(hibernate.initWork.InitWork _initWork) {
		setTitle(_initWork.getTitle());
		setDescription(_initWork.getDescription());
		setPrice(_initWork.getPrice());
		setNegotiable(_initWork.getNegotiable());
		setStartDate(_initWork.getStartDate());
		setCoordLat(_initWork.getCoordLat());
		setCoordLong(_initWork.getCoordLong());
		setID(_initWork.getORMID());
		
		{
			hibernate.user.User _user = _initWork.getCreator();
			if (_user != null) {
				setCreator_userID(_user.getORMID());
			}
		}
		
		
		{
			hibernate.task.Task _task = _initWork.getTasks();
			if (_task != null) {
				setTasks_taskID(_task.getORMID());
			}
		}
		
		
		{
			hibernate.user.User _user = _initWork.getWorker();
			if (_user != null) {
				setWorker_userID(_user.getORMID());
			}
		}
		
		
		{
			hibernate.district.District _district = _initWork.getLocalization();
			if (_district != null) {
				setLocalization_districtID(_district.getORMID());
			}
		}
		
	}
	
	private void copyToBean(hibernate.initWork.InitWork _initWork) {
		_initWork.setTitle(getTitle());
		_initWork.setDescription(getDescription());
		_initWork.setPrice(getPrice());
		_initWork.setNegotiable(getNegotiable());
		_initWork.setStartDate(getStartDate());
		_initWork.setCoordLat(getCoordLat());
		_initWork.setCoordLong(getCoordLong());
		try  {
			hibernate.user.User _creator = hibernate.user.UserDAO.loadUserByORMID(getCreator_userID());
			_initWork.setCreator(_creator);
		}
		catch (PersistentException e) {
		}
		
		try  {
			hibernate.task.Task _tasks = hibernate.task.TaskDAO.loadTaskByORMID(getTasks_taskID());
			_initWork.setTasks(_tasks);
		}
		catch (PersistentException e) {
		}
		
		try  {
			hibernate.user.User _worker = hibernate.user.UserDAO.loadUserByORMID(getWorker_userID());
			_initWork.setWorker(_worker);
		}
		catch (PersistentException e) {
		}
		
		try  {
			hibernate.district.District _localization = hibernate.district.DistrictDAO.loadDistrictByORMID(getLocalization_districtID());
			_initWork.setLocalization(_localization);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

