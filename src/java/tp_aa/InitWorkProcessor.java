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
public class InitWorkProcessor {
	private int id;
	
	private String title;
	
	private String description;
	
	private double price;
	
	private boolean negotiable;
	
	private String coordLat;
	
	private String coordLong;
	
	private java.util.Date startDate;
	
	private java.util.Date initWork;
	
	private String action="";
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
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
	
	public void setStartDate(java.util.Date value) {
		this.startDate = value;
	}
	
	public java.util.Date getStartDate() {
		return startDate;
	}
	
	public void setInitWork(java.util.Date value) {
		this.initWork = value;
	}
	
	public java.util.Date getInitWork() {
		return initWork;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int Creator_userid;
	
	public void setCreator_userid(int value) {
		this.Creator_userid = value;
	}
	
	public int getCreator_userid() {
		return Creator_userid;
	}
	
	private int Tasks_taskid;
	
	public void setTasks_taskid(int value) {
		this.Tasks_taskid = value;
	}
	
	public int getTasks_taskid() {
		return Tasks_taskid;
	}
	
	private int Worker_userid;
	
	public void setWorker_userid(int value) {
		this.Worker_userid = value;
	}
	
	public int getWorker_userid() {
		return Worker_userid;
	}
	
	private int Localization_districtid;
	
	public void setLocalization_districtid(int value) {
		this.Localization_districtid = value;
	}
	
	public int getLocalization_districtid() {
		return Localization_districtid;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				InitWork _initWork = InitWorkDAO.loadInitWorkByORMID(getId());
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
				InitWork _initWork = InitWorkDAO.createInitWork();
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
				InitWork _initWork= InitWorkDAO.loadInitWorkByORMID(getId());
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
				InitWork _initWork = InitWorkDAO.loadInitWorkByORMID(getId());
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
	
	private void copyFromBean(InitWork _initWork) {
		setTitle(_initWork.getTitle());
		setDescription(_initWork.getDescription());
		setPrice(_initWork.getPrice());
		setNegotiable(_initWork.getNegotiable());
		setCoordLat(_initWork.getCoordLat());
		setCoordLong(_initWork.getCoordLong());
		setStartDate(_initWork.getStartDate());
		setInitWork(_initWork.getInitWork());
		setId(_initWork.getORMID());
		
		{
			User _user = _initWork.getCreator();
			if (_user != null) {
				setCreator_userid(_user.getORMID());
			}
		}
		
		
		{
			Task _task = _initWork.getTasks();
			if (_task != null) {
				setTasks_taskid(_task.getORMID());
			}
		}
		
		
		{
			User _user = _initWork.getWorker();
			if (_user != null) {
				setWorker_userid(_user.getORMID());
			}
		}
		
		
		{
			District _district = _initWork.getLocalization();
			if (_district != null) {
				setLocalization_districtid(_district.getORMID());
			}
		}
		
	}
	
	private void copyToBean(InitWork _initWork) {
		_initWork.setTitle(getTitle());
		_initWork.setDescription(getDescription());
		_initWork.setPrice(getPrice());
		_initWork.setNegotiable(getNegotiable());
		_initWork.setCoordLat(getCoordLat());
		_initWork.setCoordLong(getCoordLong());
		_initWork.setStartDate(getStartDate());
		_initWork.setInitWork(getInitWork());
		try  {
			User _creator = UserDAO.loadUserByORMID(getCreator_userid());
			_initWork.setCreator(_creator);
		}
		catch (PersistentException e) {
		}
		
		try  {
			Task _tasks = TaskDAO.loadTaskByORMID(getTasks_taskid());
			_initWork.setTasks(_tasks);
		}
		catch (PersistentException e) {
		}
		
		try  {
			User _worker = UserDAO.loadUserByORMID(getWorker_userid());
			_initWork.setWorker(_worker);
		}
		catch (PersistentException e) {
		}
		
		try  {
			District _localization = DistrictDAO.loadDistrictByORMID(getLocalization_districtid());
			_initWork.setLocalization(_localization);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

