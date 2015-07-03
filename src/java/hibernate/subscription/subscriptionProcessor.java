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
package hibernate.subscription;

import org.orm.PersistentException;
public class subscriptionProcessor {
	private int ID;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int subsDistrict_districtID;
	
	public void setSubsDistrict_districtID(int value) {
		this.subsDistrict_districtID = value;
	}
	
	public int getSubsDistrict_districtID() {
		return subsDistrict_districtID;
	}
	
	private int subsTask_taskID;
	
	public void setSubsTask_taskID(int value) {
		this.subsTask_taskID = value;
	}
	
	public int getSubsTask_taskID() {
		return subsTask_taskID;
	}
	
	private int user_userID;
	
	public void setUser_userID(int value) {
		this.user_userID = value;
	}
	
	public int getUser_userID() {
		return user_userID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				hibernate.subscription.subscription _subscription = hibernate.subscription.subscriptionDAO.loadSubscriptionByORMID(getID());
				if (_subscription!= null) {
					copyFromBean(_subscription);
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
				hibernate.subscription.subscription _subscription = hibernate.subscription.subscriptionDAO.createSubscription();
				copyToBean(_subscription);
				if (subscriptionDAO.save(_subscription)) {
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
				hibernate.subscription.subscription _subscription= hibernate.subscription.subscriptionDAO.loadSubscriptionByORMID(getID());
				if (_subscription != null) {
					copyToBean(_subscription);
					if (subscriptionDAO.save(_subscription)) {
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
				hibernate.subscription.subscription _subscription = hibernate.subscription.subscriptionDAO.loadSubscriptionByORMID(getID());
				if (_subscription != null && subscriptionDAO.deleteAndDissociate(_subscription)) {
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
	
	private void copyFromBean(hibernate.subscription.subscription _subscription) {
		setID(_subscription.getORMID());
		
		{
			hibernate.district.District _district = _subscription.getSubsDistrict();
			if (_district != null) {
				setSubsDistrict_districtID(_district.getORMID());
			}
		}
		
		
		{
			hibernate.task.Task _task = _subscription.getSubsTask();
			if (_task != null) {
				setSubsTask_taskID(_task.getORMID());
			}
		}
		
		
		{
			hibernate.user.User _user = _subscription.getUser();
			if (_user != null) {
				setUser_userID(_user.getORMID());
			}
		}
		
	}
	
	private void copyToBean(hibernate.subscription.subscription _subscription) {
		try  {
			hibernate.district.District _subsDistrict = hibernate.district.DistrictDAO.loadDistrictByORMID(getSubsDistrict_districtID());
			_subscription.setSubsDistrict(_subsDistrict);
		}
		catch (PersistentException e) {
		}
		
		try  {
			hibernate.task.Task _subsTask = hibernate.task.TaskDAO.loadTaskByORMID(getSubsTask_taskID());
			_subscription.setSubsTask(_subsTask);
		}
		catch (PersistentException e) {
		}
		
		try  {
			hibernate.user.User _user = hibernate.user.UserDAO.loadUserByORMID(getUser_userID());
			_subscription.setUser(_user);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

