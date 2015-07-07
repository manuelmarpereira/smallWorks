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
public class MakeWorkProcessor {
	private int id;
	
	private String title;
	
	private String description;
	
	private double price;
	
	private boolean negotiable;
	
	private String coordLat;
	
	private String coordLong;
	
	private java.util.Date startDate;
	
	private java.util.Date finishDate;
	
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
	
	private int Creator_userid;
	
	public void setCreator_userid(int value) {
		this.Creator_userid = value;
	}
	
	public int getCreator_userid() {
		return Creator_userid;
	}
	
	private int subTask_subTaskid;
	
	public void setSubTask_subTaskid(int value) {
		this.subTask_subTaskid = value;
	}
	
	public int getSubTask_subTaskid() {
		return subTask_subTaskid;
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
	
	private int Evaluation_feedbackid;
	
	public void setEvaluation_feedbackid(int value) {
		this.Evaluation_feedbackid = value;
	}
	
	public int getEvaluation_feedbackid() {
		return Evaluation_feedbackid;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				tp_aa.MakeWork _makeWork = tp_aa.MakeWorkDAO.loadMakeWorkByORMID(getId());
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
				tp_aa.MakeWork _makeWork = tp_aa.MakeWorkDAO.createMakeWork();
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
				tp_aa.MakeWork _makeWork= tp_aa.MakeWorkDAO.loadMakeWorkByORMID(getId());
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
				tp_aa.MakeWork _makeWork = tp_aa.MakeWorkDAO.loadMakeWorkByORMID(getId());
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
	
	private void copyFromBean(tp_aa.MakeWork _makeWork) {
		setTitle(_makeWork.getTitle());
		setDescription(_makeWork.getDescription());
		setPrice(_makeWork.getPrice());
		setNegotiable(_makeWork.getNegotiable());
		setCoordLat(_makeWork.getCoordLat());
		setCoordLong(_makeWork.getCoordLong());
		setStartDate(_makeWork.getStartDate());
		setFinishDate(_makeWork.getFinishDate());
		setId(_makeWork.getORMID());
		
		{
			tp_aa.User _user = _makeWork.getCreator();
			if (_user != null) {
				setCreator_userid(_user.getORMID());
			}
		}
		
		
		{
			tp_aa.SubTask _subTask = _makeWork.getSubTask();
			if (_subTask != null) {
				setSubTask_subTaskid(_subTask.getORMID());
			}
		}
		
		
		{
			tp_aa.User _user = _makeWork.getWorker();
			if (_user != null) {
				setWorker_userid(_user.getORMID());
			}
		}
		
		
		{
			tp_aa.District _district = _makeWork.getLocalization();
			if (_district != null) {
				setLocalization_districtid(_district.getORMID());
			}
		}
		
		
		{
			tp_aa.Feedback _feedback = _makeWork.getEvaluation();
			if (_feedback != null) {
				setEvaluation_feedbackid(_feedback.getORMID());
			}
		}
		
	}
	
	private void copyToBean(tp_aa.MakeWork _makeWork) {
		_makeWork.setTitle(getTitle());
		_makeWork.setDescription(getDescription());
		_makeWork.setPrice(getPrice());
		_makeWork.setNegotiable(getNegotiable());
		_makeWork.setCoordLat(getCoordLat());
		_makeWork.setCoordLong(getCoordLong());
		_makeWork.setStartDate(getStartDate());
		_makeWork.setFinishDate(getFinishDate());
		try  {
			tp_aa.User _creator = tp_aa.UserDAO.loadUserByORMID(getCreator_userid());
			_makeWork.setCreator(_creator);
		}
		catch (PersistentException e) {
		}
		
		try  {
			tp_aa.SubTask _subTask = tp_aa.SubTaskDAO.loadSubTaskByORMID(getSubTask_subTaskid());
			_makeWork.setSubTask(_subTask);
		}
		catch (PersistentException e) {
		}
		
		try  {
			tp_aa.User _worker = tp_aa.UserDAO.loadUserByORMID(getWorker_userid());
			_makeWork.setWorker(_worker);
		}
		catch (PersistentException e) {
		}
		
		try  {
			tp_aa.District _localization = tp_aa.DistrictDAO.loadDistrictByORMID(getLocalization_districtid());
			_makeWork.setLocalization(_localization);
		}
		catch (PersistentException e) {
		}
		
		try  {
			tp_aa.Feedback _evaluation = tp_aa.FeedbackDAO.loadFeedbackByORMID(getEvaluation_feedbackid());
			_makeWork.setEvaluation(_evaluation);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

