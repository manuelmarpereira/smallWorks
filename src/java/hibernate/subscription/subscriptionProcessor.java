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
	private int id;
	
	private String action="";
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int subsDistrict_districtid;
	
	public void setSubsDistrict_districtid(int value) {
		this.subsDistrict_districtid = value;
	}
	
	public int getSubsDistrict_districtid() {
		return subsDistrict_districtid;
	}
	
	private int subsTask_taskid;
	
	public void setSubsTask_taskid(int value) {
		this.subsTask_taskid = value;
	}
	
	public int getSubsTask_taskid() {
		return subsTask_taskid;
	}
	
	private int user_userid;
	
	public void setUser_userid(int value) {
		this.user_userid = value;
	}
	
	public int getUser_userid() {
		return user_userid;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				hibernate.subscription.subscription _subscription = hibernate.subscription.subscriptionDAO.loadSubscriptionByORMID(getId());
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
				hibernate.subscription.subscription _subscription= hibernate.subscription.subscriptionDAO.loadSubscriptionByORMID(getId());
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
				hibernate.subscription.subscription _subscription = hibernate.subscription.subscriptionDAO.loadSubscriptionByORMID(getId());
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
		setId(_subscription.getORMID());
		
		{
			hibernate.district.District _district = _subscription.getSubsDistrict();
			if (_district != null) {
				setSubsDistrict_districtid(_district.getORMID());
			}
		}
		
		
		{
			hibernate.task.Task _task = _subscription.getSubsTask();
			if (_task != null) {
				setSubsTask_taskid(_task.getORMID());
			}
		}
		
		
		{
			hibernate.user.User _user = _subscription.getUser();
			if (_user != null) {
				setUser_userid(_user.getORMID());
			}
		}
		
	}
	
	private void copyToBean(hibernate.subscription.subscription _subscription) {
		try  {
			hibernate.district.District _subsDistrict = hibernate.district.DistrictDAO.loadDistrictByORMID(getSubsDistrict_districtid());
			_subscription.setSubsDistrict(_subsDistrict);
		}
		catch (PersistentException e) {
		}
		
		try  {
			hibernate.task.Task _subsTask = hibernate.task.TaskDAO.loadTaskByORMID(getSubsTask_taskid());
			_subscription.setSubsTask(_subsTask);
		}
		catch (PersistentException e) {
		}
		
		try  {
			hibernate.user.User _user = hibernate.user.UserDAO.loadUserByORMID(getUser_userid());
			_subscription.setUser(_user);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

