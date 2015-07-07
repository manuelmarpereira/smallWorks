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
public class SubTaskProcessor {
	private int id;
	
	private String name;
	
	private String action="";
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
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
	
	private int task_taskid;
	
	public void setTask_taskid(int value) {
		this.task_taskid = value;
	}
	
	public int getTask_taskid() {
		return task_taskid;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				tp_aa.SubTask _subTask = tp_aa.SubTaskDAO.loadSubTaskByORMID(getId());
				if (_subTask!= null) {
					copyFromBean(_subTask);
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
				tp_aa.SubTask _subTask = tp_aa.SubTaskDAO.createSubTask();
				copyToBean(_subTask);
				if (SubTaskDAO.save(_subTask)) {
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
				tp_aa.SubTask _subTask= tp_aa.SubTaskDAO.loadSubTaskByORMID(getId());
				if (_subTask != null) {
					copyToBean(_subTask);
					if (SubTaskDAO.save(_subTask)) {
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
				tp_aa.SubTask _subTask = tp_aa.SubTaskDAO.loadSubTaskByORMID(getId());
				if (_subTask != null && SubTaskDAO.delete(_subTask)) {
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
	
	private void copyFromBean(tp_aa.SubTask _subTask) {
		setName(_subTask.getName());
		setId(_subTask.getORMID());
		
		{
			tp_aa.Task _task = _subTask.getTask();
			if (_task != null) {
				setTask_taskid(_task.getORMID());
			}
		}
		
	}
	
	private void copyToBean(tp_aa.SubTask _subTask) {
		_subTask.setName(getName());
		try  {
			tp_aa.Task _task = tp_aa.TaskDAO.loadTaskByORMID(getTask_taskid());
			_subTask.setTask(_task);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

