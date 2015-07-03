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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class subscriptionDAO {
	public static subscription loadSubscriptionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return loadSubscriptionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static subscription getSubscriptionByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return getSubscriptionByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static subscription loadSubscriptionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return loadSubscriptionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static subscription getSubscriptionByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return getSubscriptionByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static subscription loadSubscriptionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (subscription) session.load(hibernate.subscription.subscription.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static subscription getSubscriptionByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (subscription) session.get(hibernate.subscription.subscription.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static subscription loadSubscriptionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (subscription) session.load(hibernate.subscription.subscription.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static subscription getSubscriptionByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (subscription) session.get(hibernate.subscription.subscription.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubscription(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return querySubscription(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubscription(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return querySubscription(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static subscription[] listSubscriptionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return listSubscriptionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static subscription[] listSubscriptionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return listSubscriptionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List querySubscription(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From subscription as subscription");
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
	
	public static List querySubscription(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From subscription as subscription");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("subscription", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static subscription[] listSubscriptionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = querySubscription(session, condition, orderBy);
			return (subscription[]) list.toArray(new subscription[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static subscription[] listSubscriptionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = querySubscription(session, condition, orderBy, lockMode);
			return (subscription[]) list.toArray(new subscription[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static subscription loadSubscriptionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return loadSubscriptionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static subscription loadSubscriptionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return loadSubscriptionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static subscription loadSubscriptionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		subscription[] subscriptions = listSubscriptionByQuery(session, condition, orderBy);
		if (subscriptions != null && subscriptions.length > 0)
			return subscriptions[0];
		else
			return null;
	}
	
	public static subscription loadSubscriptionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		subscription[] subscriptions = listSubscriptionByQuery(session, condition, orderBy, lockMode);
		if (subscriptions != null && subscriptions.length > 0)
			return subscriptions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateSubscriptionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return iterateSubscriptionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSubscriptionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = hibernate.globalconf.TPAAPersistentManager.instance().getSession();
			return iterateSubscriptionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateSubscriptionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From subscription as subscription");
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
	
	public static java.util.Iterator iterateSubscriptionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From subscription as subscription");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("subscription", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static subscription createSubscription() {
		return new hibernate.subscription.subscription();
	}
	
	public static boolean save(hibernate.subscription.subscription lsubscription) throws PersistentException {
		try {
			hibernate.globalconf.TPAAPersistentManager.instance().saveObject(lsubscription);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(hibernate.subscription.subscription lsubscription) throws PersistentException {
		try {
			hibernate.globalconf.TPAAPersistentManager.instance().deleteObject(lsubscription);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(hibernate.subscription.subscription lsubscription)throws PersistentException {
		try {
			if (lsubscription.getUser() != null) {
				lsubscription.getUser().subscriptions.remove(lsubscription);
			}
			
			return delete(lsubscription);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(hibernate.subscription.subscription lsubscription, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (lsubscription.getUser() != null) {
				lsubscription.getUser().subscriptions.remove(lsubscription);
			}
			
			try {
				session.delete(lsubscription);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(hibernate.subscription.subscription lsubscription) throws PersistentException {
		try {
			hibernate.globalconf.TPAAPersistentManager.instance().getSession().refresh(lsubscription);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(hibernate.subscription.subscription lsubscription) throws PersistentException {
		try {
			hibernate.globalconf.TPAAPersistentManager.instance().getSession().evict(lsubscription);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static subscription loadSubscriptionByCriteria(subscriptionCriteria subscriptionCriteria) {
		subscription[] subscriptions = listSubscriptionByCriteria(subscriptionCriteria);
		if(subscriptions == null || subscriptions.length == 0) {
			return null;
		}
		return subscriptions[0];
	}
	
	public static subscription[] listSubscriptionByCriteria(subscriptionCriteria subscriptionCriteria) {
		return subscriptionCriteria.listSubscription();
	}
}
