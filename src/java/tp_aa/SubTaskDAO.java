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

public class SubTaskDAO {
	public static SubTask loadSubTaskByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return loadSubTaskByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubTask getSubTaskByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return getSubTaskByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubTask loadSubTaskByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return loadSubTaskByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubTask getSubTaskByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return getSubTaskByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubTask loadSubTaskByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (SubTask) session.load(tp_aa.SubTask.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubTask getSubTaskByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (SubTask) session.get(tp_aa.SubTask.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubTask loadSubTaskByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (SubTask) session.load(tp_aa.SubTask.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubTask getSubTaskByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (SubTask) session.get(tp_aa.SubTask.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubTask(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return querySubTask(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubTask(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return querySubTask(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubTask[] listSubTaskByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return listSubTaskByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubTask[] listSubTaskByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return listSubTaskByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubTask(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.SubTask as SubTask");
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
	
	public static List querySubTask(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.SubTask as SubTask");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SubTask", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubTask[] listSubTaskByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySubTask(session, condition, orderBy);
			return (SubTask[]) list.toArray(new SubTask[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubTask[] listSubTaskByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySubTask(session, condition, orderBy, lockMode);
			return (SubTask[]) list.toArray(new SubTask[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubTask loadSubTaskByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return loadSubTaskByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubTask loadSubTaskByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return loadSubTaskByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubTask loadSubTaskByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		SubTask[] subTasks = listSubTaskByQuery(session, condition, orderBy);
		if (subTasks != null && subTasks.length > 0)
			return subTasks[0];
		else
			return null;
	}
	
	public static SubTask loadSubTaskByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		SubTask[] subTasks = listSubTaskByQuery(session, condition, orderBy, lockMode);
		if (subTasks != null && subTasks.length > 0)
			return subTasks[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSubTaskByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return iterateSubTaskByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSubTaskByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return iterateSubTaskByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSubTaskByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.SubTask as SubTask");
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
	
	public static java.util.Iterator iterateSubTaskByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.SubTask as SubTask");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("SubTask", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubTask createSubTask() {
		return new tp_aa.SubTask();
	}
	
	public static boolean save(tp_aa.SubTask subTask) throws PersistentException {
		try {
			tp_aa.TPAAPersistentManager.instance().saveObject(subTask);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(tp_aa.SubTask subTask) throws PersistentException {
		try {
			tp_aa.TPAAPersistentManager.instance().deleteObject(subTask);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(tp_aa.SubTask subTask) throws PersistentException {
		try {
			tp_aa.TPAAPersistentManager.instance().getSession().refresh(subTask);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(tp_aa.SubTask subTask) throws PersistentException {
		try {
			tp_aa.TPAAPersistentManager.instance().getSession().evict(subTask);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static SubTask loadSubTaskByCriteria(SubTaskCriteria subTaskCriteria) {
		SubTask[] subTasks = listSubTaskByCriteria(subTaskCriteria);
		if(subTasks == null || subTasks.length == 0) {
			return null;
		}
		return subTasks[0];
	}
	
	public static SubTask[] listSubTaskByCriteria(SubTaskCriteria subTaskCriteria) {
		return subTaskCriteria.listSubTask();
	}
}
