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

public class WorkDAO {
	public static Work loadWorkByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return loadWorkByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Work getWorkByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return getWorkByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Work loadWorkByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return loadWorkByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Work getWorkByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return getWorkByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Work loadWorkByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Work) session.load(tp_aa.Work.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Work getWorkByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (Work) session.get(tp_aa.Work.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Work loadWorkByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Work) session.load(tp_aa.Work.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Work getWorkByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Work) session.get(tp_aa.Work.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryWork(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return queryWork(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryWork(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return queryWork(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Work[] listWorkByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return listWorkByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Work[] listWorkByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return listWorkByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryWork(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.Work as Work");
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
	
	public static List queryWork(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.Work as Work");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Work", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Work[] listWorkByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryWork(session, condition, orderBy);
			return (Work[]) list.toArray(new Work[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Work[] listWorkByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryWork(session, condition, orderBy, lockMode);
			return (Work[]) list.toArray(new Work[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Work loadWorkByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return loadWorkByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Work loadWorkByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return loadWorkByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Work loadWorkByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Work[] works = listWorkByQuery(session, condition, orderBy);
		if (works != null && works.length > 0)
			return works[0];
		else
			return null;
	}
	
	public static Work loadWorkByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Work[] works = listWorkByQuery(session, condition, orderBy, lockMode);
		if (works != null && works.length > 0)
			return works[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateWorkByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return iterateWorkByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateWorkByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return iterateWorkByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateWorkByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.Work as Work");
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
	
	public static java.util.Iterator iterateWorkByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.Work as Work");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Work", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Work createWork() {
		return new tp_aa.Work();
	}
	
	public static boolean save(tp_aa.Work work) throws PersistentException {
		try {
			tp_aa.TPAAPersistentManager.instance().saveObject(work);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(tp_aa.Work work) throws PersistentException {
		try {
			tp_aa.TPAAPersistentManager.instance().deleteObject(work);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(tp_aa.Work work) throws PersistentException {
		try {
			tp_aa.TPAAPersistentManager.instance().getSession().refresh(work);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(tp_aa.Work work) throws PersistentException {
		try {
			tp_aa.TPAAPersistentManager.instance().getSession().evict(work);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Work loadWorkByCriteria(WorkCriteria workCriteria) {
		Work[] works = listWorkByCriteria(workCriteria);
		if(works == null || works.length == 0) {
			return null;
		}
		return works[0];
	}
	
	public static Work[] listWorkByCriteria(WorkCriteria workCriteria) {
		return workCriteria.listWork();
	}
}
