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
package user;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class CreatorDAO {
	public static Creator loadCreatorByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return loadCreatorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Creator getCreatorByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return getCreatorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Creator loadCreatorByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return loadCreatorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Creator getCreatorByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return getCreatorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Creator loadCreatorByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Creator) session.load(Creator.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Creator getCreatorByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Creator) session.get(Creator.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Creator loadCreatorByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Creator) session.load(Creator.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Creator getCreatorByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Creator) session.get(Creator.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCreator(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return queryCreator(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCreator(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return queryCreator(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Creator[] listCreatorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return listCreatorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Creator[] listCreatorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return listCreatorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCreator(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Creator as Creator");
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
	
	public static List queryCreator(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Creator as Creator");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Creator", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Creator[] listCreatorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCreator(session, condition, orderBy);
			return (Creator[]) list.toArray(new Creator[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Creator[] listCreatorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCreator(session, condition, orderBy, lockMode);
			return (Creator[]) list.toArray(new Creator[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Creator loadCreatorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return loadCreatorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Creator loadCreatorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return loadCreatorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Creator loadCreatorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Creator[] creators = listCreatorByQuery(session, condition, orderBy);
		if (creators != null && creators.length > 0)
			return creators[0];
		else
			return null;
	}
	
	public static Creator loadCreatorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Creator[] creators = listCreatorByQuery(session, condition, orderBy, lockMode);
		if (creators != null && creators.length > 0)
			return creators[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCreatorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return iterateCreatorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCreatorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = globalconf.TPAAPersistentManager.instance().getSession();
			return iterateCreatorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCreatorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Creator as Creator");
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
	
	public static java.util.Iterator iterateCreatorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Creator as Creator");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Creator", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Creator createCreator() {
		return new Creator();
	}
	
	public static boolean save(Creator creator) throws PersistentException {
		try {
			globalconf.TPAAPersistentManager.instance().saveObject(creator);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Creator creator) throws PersistentException {
		try {
			globalconf.TPAAPersistentManager.instance().deleteObject(creator);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Creator creator) throws PersistentException {
		try {
			globalconf.TPAAPersistentManager.instance().getSession().refresh(creator);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Creator creator) throws PersistentException {
		try {
			globalconf.TPAAPersistentManager.instance().getSession().evict(creator);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Creator loadCreatorByCriteria(CreatorCriteria creatorCriteria) {
		Creator[] creators = listCreatorByCriteria(creatorCriteria);
		if(creators == null || creators.length == 0) {
			return null;
		}
		return creators[0];
	}
	
	public static Creator[] listCreatorByCriteria(CreatorCriteria creatorCriteria) {
		return creatorCriteria.listCreator();
	}
}
