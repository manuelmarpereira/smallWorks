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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class FeedbackDAO {
	public static Feedback loadFeedbackByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return loadFeedbackByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Feedback getFeedbackByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return getFeedbackByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Feedback loadFeedbackByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return loadFeedbackByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Feedback getFeedbackByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return getFeedbackByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Feedback loadFeedbackByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Feedback) session.load(tp_aa.Feedback.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Feedback getFeedbackByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Feedback) session.get(tp_aa.Feedback.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Feedback loadFeedbackByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Feedback) session.load(tp_aa.Feedback.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Feedback getFeedbackByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Feedback) session.get(tp_aa.Feedback.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFeedback(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return queryFeedback(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFeedback(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return queryFeedback(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Feedback[] listFeedbackByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return listFeedbackByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Feedback[] listFeedbackByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return listFeedbackByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFeedback(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.Feedback as Feedback");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFeedback(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.Feedback as Feedback");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Feedback", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Feedback[] listFeedbackByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFeedback(session, condition, orderBy);
			return (Feedback[]) list.toArray(new Feedback[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Feedback[] listFeedbackByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFeedback(session, condition, orderBy, lockMode);
			return (Feedback[]) list.toArray(new Feedback[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Feedback loadFeedbackByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return loadFeedbackByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Feedback loadFeedbackByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return loadFeedbackByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Feedback loadFeedbackByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Feedback[] feedbacks = listFeedbackByQuery(session, condition, orderBy);
		if (feedbacks != null && feedbacks.length > 0)
			return feedbacks[0];
		else
			return null;
	}
	
	public static Feedback loadFeedbackByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Feedback[] feedbacks = listFeedbackByQuery(session, condition, orderBy, lockMode);
		if (feedbacks != null && feedbacks.length > 0)
			return feedbacks[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFeedbackByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return iterateFeedbackByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFeedbackByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return iterateFeedbackByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFeedbackByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.Feedback as Feedback");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFeedbackByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.Feedback as Feedback");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Feedback", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Feedback createFeedback() {
		return new tp_aa.Feedback();
	}
	
	public static boolean save(tp_aa.Feedback feedback) throws PersistentException {
		try {
			tp_aa.TPAAPersistentManager.instance().saveObject(feedback);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(tp_aa.Feedback feedback) throws PersistentException {
		try {
			tp_aa.TPAAPersistentManager.instance().deleteObject(feedback);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(tp_aa.Feedback feedback) throws PersistentException {
		try {
			tp_aa.TPAAPersistentManager.instance().getSession().refresh(feedback);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(tp_aa.Feedback feedback) throws PersistentException {
		try {
			tp_aa.TPAAPersistentManager.instance().getSession().evict(feedback);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Feedback loadFeedbackByCriteria(FeedbackCriteria feedbackCriteria) {
		Feedback[] feedbacks = listFeedbackByCriteria(feedbackCriteria);
		if(feedbacks == null || feedbacks.length == 0) {
			return null;
		}
		return feedbacks[0];
	}
	
	public static Feedback[] listFeedbackByCriteria(FeedbackCriteria feedbackCriteria) {
		return feedbackCriteria.listFeedback();
	}
}
