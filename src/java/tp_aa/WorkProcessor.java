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
public class WorkProcessor {
	private int ID;
	
	private String title;
	
	private String description;
	
	private double price;
	
	private boolean negotiable;
	
	private String state;
	
	private java.util.Date startDate;
	
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
	
	public void setState(String value) {
		this.state = value;
	}
	
	public String getState() {
		return state == null ? "" : state;
	}
	
	public void setStartDate(java.util.Date value) {
		this.startDate = value;
	}
	
	public java.util.Date getStartDate() {
		return startDate;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int Localization_districtID;
	
	public void setLocalization_districtID(int value) {
		this.Localization_districtID = value;
	}
	
	public int getLocalization_districtID() {
		return Localization_districtID;
	}
	
	private int Worker_userID;
	
	public void setWorker_userID(int value) {
		this.Worker_userID = value;
	}
	
	public int getWorker_userID() {
		return Worker_userID;
	}
	
	private int Tasks_taskID;
	
	public void setTasks_taskID(int value) {
		this.Tasks_taskID = value;
	}
	
	public int getTasks_taskID() {
		return Tasks_taskID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				tp_aa.Work _work = tp_aa.WorkDAO.loadWorkByORMID(getID());
				if (_work!= null) {
					copyFromBean(_work);
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
				tp_aa.Work _work = tp_aa.WorkDAO.createWork();
				copyToBean(_work);
				if (tp_aa.WorkDAO.save(_work)) {
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
				tp_aa.Work _work= tp_aa.WorkDAO.loadWorkByORMID(getID());
				if (_work != null) {
					copyToBean(_work);
					if (tp_aa.WorkDAO.save(_work)) {
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
				tp_aa.Work _work = tp_aa.WorkDAO.loadWorkByORMID(getID());
				if (_work != null && tp_aa.WorkDAO.delete(_work)) {
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
	
	private void copyFromBean(tp_aa.Work _work) {
		setTitle(_work.getTitle());
		setDescription(_work.getDescription());
		setPrice(_work.getPrice());
		setNegotiable(_work.getNegotiable());
		setState(_work.getState());
		setStartDate(_work.getStartDate());
		setID(_work.getORMID());
		
		{
			tp_aa.District _district = _work.getLocalization();
			if (_district != null) {
				setLocalization_districtID(_district.getORMID());
			}
		}
		
		
		{
			user.User _user = _work.getWorker();
			if (_user != null) {
				setWorker_userID(_user.getORMID());
			}
		}
		
		
		{
			tp_aa.Task _task = _work.getTasks();
			if (_task != null) {
				setTasks_taskID(_task.getORMID());
			}
		}
		
	}
	
	private void copyToBean(tp_aa.Work _work) {
		_work.setTitle(getTitle());
		_work.setDescription(getDescription());
		_work.setPrice(getPrice());
		_work.setNegotiable(getNegotiable());
		_work.setState(getState());
		_work.setStartDate(getStartDate());
		try  {
			tp_aa.District _localization = tp_aa.DistrictDAO.loadDistrictByORMID(getLocalization_districtID());
			_work.setLocalization(_localization);
		}
		catch (PersistentException e) {
		}
		
		try  {
			user.User _worker = user.UserDAO.loadUserByORMID(getWorker_userID());
			_work.setWorker(_worker);
		}
		catch (PersistentException e) {
		}
		
		try  {
			tp_aa.Task _tasks = tp_aa.TaskDAO.loadTaskByORMID(getTasks_taskID());
			_work.setTasks(_tasks);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

