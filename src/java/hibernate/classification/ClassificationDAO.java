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
package hibernate.classification;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ClassificationDAO {
	public static Classification loadClassificationByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return loadClassificationByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Classification getClassificationByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return getClassificationByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Classification loadClassificationByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return loadClassificationByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Classification getClassificationByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return getClassificationByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Classification loadClassificationByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Classification) session.load(hibernate.classification.Classification.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Classification getClassificationByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Classification) session.get(hibernate.classification.Classification.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Classification loadClassificationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Classification) session.load(hibernate.classification.Classification.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Classification getClassificationByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Classification) session.get(hibernate.classification.Classification.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClassification(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return queryClassification(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClassification(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return queryClassification(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Classification[] listClassificationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return listClassificationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Classification[] listClassificationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return listClassificationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryClassification(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Classification as Classification");
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
	
	public static List queryClassification(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Classification as Classification");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Classification", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Classification[] listClassificationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryClassification(session, condition, orderBy);
			return (Classification[]) list.toArray(new Classification[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Classification[] listClassificationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryClassification(session, condition, orderBy, lockMode);
			return (Classification[]) list.toArray(new Classification[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Classification loadClassificationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return loadClassificationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Classification loadClassificationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return loadClassificationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Classification loadClassificationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Classification[] classifications = listClassificationByQuery(session, condition, orderBy);
		if (classifications != null && classifications.length > 0)
			return classifications[0];
		else
			return null;
	}
	
	public static Classification loadClassificationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Classification[] classifications = listClassificationByQuery(session, condition, orderBy, lockMode);
		if (classifications != null && classifications.length > 0)
			return classifications[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateClassificationByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return iterateClassificationByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClassificationByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return iterateClassificationByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateClassificationByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Classification as Classification");
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
	
	public static java.util.Iterator iterateClassificationByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Classification as Classification");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Classification", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Classification createClassification() {
		return new hibernate.classification.Classification();
	}
	
	public static boolean save(hibernate.classification.Classification classification) throws PersistentException {
		try {
			hibernate.globalconf.TPAAPersistentManager.instance().saveObject(classification);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(hibernate.classification.Classification classification) throws PersistentException {
		try {
			hibernate.globalconf.TPAAPersistentManager.instance().deleteObject(classification);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(hibernate.classification.Classification classification) throws PersistentException {
		try {
			hibernate.globalconf.TPAAPersistentManager.instance().getSession().refresh(classification);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(hibernate.classification.Classification classification) throws PersistentException {
		try {
			hibernate.globalconf.TPAAPersistentManager.instance().getSession().evict(classification);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Classification loadClassificationByCriteria(ClassificationCriteria classificationCriteria) {
		Classification[] classifications = listClassificationByCriteria(classificationCriteria);
		if(classifications == null || classifications.length == 0) {
			return null;
		}
		return classifications[0];
	}
	
	public static Classification[] listClassificationByCriteria(ClassificationCriteria classificationCriteria) {
		return classificationCriteria.listClassification();
	}
}
