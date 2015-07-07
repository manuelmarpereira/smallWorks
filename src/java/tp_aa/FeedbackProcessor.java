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
public class FeedbackProcessor {
	private int id;
	
	private String coment;
	
	private String action="";
	
	public void setId(int value) {
		this.id = value;
	}
	
	public int getId() {
		return id;
	}
	
	public void setComent(String value) {
		this.coment = value;
	}
	
	public String getComent() {
		return coment == null ? "" : coment;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private int Classification_classificationid;
	
	public void setClassification_classificationid(int value) {
		this.Classification_classificationid = value;
	}
	
	public int getClassification_classificationid() {
		return Classification_classificationid;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				tp_aa.Feedback _feedback = tp_aa.FeedbackDAO.loadFeedbackByORMID(getId());
				if (_feedback!= null) {
					copyFromBean(_feedback);
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
				tp_aa.Feedback _feedback = tp_aa.FeedbackDAO.createFeedback();
				copyToBean(_feedback);
				if (FeedbackDAO.save(_feedback)) {
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
				tp_aa.Feedback _feedback= tp_aa.FeedbackDAO.loadFeedbackByORMID(getId());
				if (_feedback != null) {
					copyToBean(_feedback);
					if (FeedbackDAO.save(_feedback)) {
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
				tp_aa.Feedback _feedback = tp_aa.FeedbackDAO.loadFeedbackByORMID(getId());
				if (_feedback != null && FeedbackDAO.delete(_feedback)) {
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
	
	private void copyFromBean(tp_aa.Feedback _feedback) {
		setComent(_feedback.getComent());
		setId(_feedback.getORMID());
		
		{
			tp_aa.Classification _classification = _feedback.getClassification();
			if (_classification != null) {
				setClassification_classificationid(_classification.getORMID());
			}
		}
		
	}
	
	private void copyToBean(tp_aa.Feedback _feedback) {
		_feedback.setComent(getComent());
		try  {
			tp_aa.Classification _classification = tp_aa.ClassificationDAO.loadClassificationByORMID(getClassification_classificationid());
			_feedback.setClassification(_classification);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

