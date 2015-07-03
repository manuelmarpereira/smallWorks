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
package hibernate.makeWork;

import org.orm.PersistentException;
public class MakeWorkProcessor {
	private int ID;
	
	private String title;
	
	private String description;
	
	private double price;
	
	private boolean negotiable;
	
	private java.util.Date startDate;
	
	private java.util.Date finishDate;
	
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
	
	public void setFinishDate(java.util.Date value) {
		this.finishDate = value;
	}
	
	public java.util.Date getFinishDate() {
		return finishDate;
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
	
	private int Evaluation_feedbackID;
	
	public void setEvaluation_feedbackID(int value) {
		this.Evaluation_feedbackID = value;
	}
	
	public int getEvaluation_feedbackID() {
		return Evaluation_feedbackID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				hibernate.makeWork.MakeWork _makeWork = hibernate.makeWork.MakeWorkDAO.loadMakeWorkByORMID(getID());
				if (_makeWork!= null) {
					copyFromBean(_makeWork);
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
				hibernate.makeWork.MakeWork _makeWork = hibernate.makeWork.MakeWorkDAO.createMakeWork();
				copyToBean(_makeWork);
				if (MakeWorkDAO.save(_makeWork)) {
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
				hibernate.makeWork.MakeWork _makeWork= hibernate.makeWork.MakeWorkDAO.loadMakeWorkByORMID(getID());
				if (_makeWork != null) {
					copyToBean(_makeWork);
					if (MakeWorkDAO.save(_makeWork)) {
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
				hibernate.makeWork.MakeWork _makeWork = hibernate.makeWork.MakeWorkDAO.loadMakeWorkByORMID(getID());
				if (_makeWork != null && MakeWorkDAO.delete(_makeWork)) {
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
	
	private void copyFromBean(hibernate.makeWork.MakeWork _makeWork) {
		setTitle(_makeWork.getTitle());
		setDescription(_makeWork.getDescription());
		setPrice(_makeWork.getPrice());
		setNegotiable(_makeWork.getNegotiable());
		setStartDate(_makeWork.getStartDate());
		setFinishDate(_makeWork.getFinishDate());
		setID(_makeWork.getORMID());
		
		{
			hibernate.user.User _user = _makeWork.getCreator();
			if (_user != null) {
				setCreator_userID(_user.getORMID());
			}
		}
		
		
		{
			hibernate.task.Task _task = _makeWork.getTasks();
			if (_task != null) {
				setTasks_taskID(_task.getORMID());
			}
		}
		
		
		{
			hibernate.user.User _user = _makeWork.getWorker();
			if (_user != null) {
				setWorker_userID(_user.getORMID());
			}
		}
		
		
		{
			hibernate.district.District _district = _makeWork.getLocalization();
			if (_district != null) {
				setLocalization_districtID(_district.getORMID());
			}
		}
		
		
		{
			hibernate.feedback.Feedback _feedback = _makeWork.getEvaluation();
			if (_feedback != null) {
				setEvaluation_feedbackID(_feedback.getORMID());
			}
		}
		
	}
	
	private void copyToBean(hibernate.makeWork.MakeWork _makeWork) {
		_makeWork.setTitle(getTitle());
		_makeWork.setDescription(getDescription());
		_makeWork.setPrice(getPrice());
		_makeWork.setNegotiable(getNegotiable());
		_makeWork.setStartDate(getStartDate());
		_makeWork.setFinishDate(getFinishDate());
		try  {
			hibernate.user.User _creator = hibernate.user.UserDAO.loadUserByORMID(getCreator_userID());
			_makeWork.setCreator(_creator);
		}
		catch (PersistentException e) {
		}
		
		try  {
			hibernate.task.Task _tasks = hibernate.task.TaskDAO.loadTaskByORMID(getTasks_taskID());
			_makeWork.setTasks(_tasks);
		}
		catch (PersistentException e) {
		}
		
		try  {
			hibernate.user.User _worker = hibernate.user.UserDAO.loadUserByORMID(getWorker_userID());
			_makeWork.setWorker(_worker);
		}
		catch (PersistentException e) {
		}
		
		try  {
			hibernate.district.District _localization = hibernate.district.DistrictDAO.loadDistrictByORMID(getLocalization_districtID());
			_makeWork.setLocalization(_localization);
		}
		catch (PersistentException e) {
		}
		
		try  {
			hibernate.feedback.Feedback _evaluation = hibernate.feedback.FeedbackDAO.loadFeedbackByORMID(getEvaluation_feedbackID());
			_makeWork.setEvaluation(_evaluation);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

