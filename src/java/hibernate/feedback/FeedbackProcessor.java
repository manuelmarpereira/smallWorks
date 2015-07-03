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
package hibernate.feedback;

import org.orm.PersistentException;
public class FeedbackProcessor {
	private int ID;
	
	private String coment;
	
	private String action="";
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
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
	
	private int Classification_classificationID;
	
	public void setClassification_classificationID(int value) {
		this.Classification_classificationID = value;
	}
	
	public int getClassification_classificationID() {
		return Classification_classificationID;
	}
	
	public String process() {
		String result = "Unexcepted result";
		if (action.equals("search")) {
			try {
				hibernate.feedback.Feedback _feedback = hibernate.feedback.FeedbackDAO.loadFeedbackByORMID(getID());
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
				hibernate.feedback.Feedback _feedback = hibernate.feedback.FeedbackDAO.createFeedback();
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
				hibernate.feedback.Feedback _feedback= hibernate.feedback.FeedbackDAO.loadFeedbackByORMID(getID());
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
				hibernate.feedback.Feedback _feedback = hibernate.feedback.FeedbackDAO.loadFeedbackByORMID(getID());
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
	
	private void copyFromBean(hibernate.feedback.Feedback _feedback) {
		setComent(_feedback.getComent());
		setID(_feedback.getORMID());
		
		{
			hibernate.classification.Classification _classification = _feedback.getClassification();
			if (_classification != null) {
				setClassification_classificationID(_classification.getORMID());
			}
		}
		
	}
	
	private void copyToBean(hibernate.feedback.Feedback _feedback) {
		_feedback.setComent(getComent());
		try  {
			hibernate.classification.Classification _classification = hibernate.classification.ClassificationDAO.loadClassificationByORMID(getClassification_classificationID());
			_feedback.setClassification(_classification);
		}
		catch (PersistentException e) {
		}
		
	}
	
}

