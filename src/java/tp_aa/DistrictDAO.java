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

public class DistrictDAO {
	public static District loadDistrictByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return loadDistrictByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District getDistrictByORMID(int id) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return getDistrictByORMID(session, id);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District loadDistrictByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return loadDistrictByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District getDistrictByORMID(int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return getDistrictByORMID(session, id, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District loadDistrictByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (District) session.load(tp_aa.District.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District getDistrictByORMID(PersistentSession session, int id) throws PersistentException {
		try {
			return (District) session.get(tp_aa.District.class, new Integer(id));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District loadDistrictByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (District) session.load(tp_aa.District.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District getDistrictByORMID(PersistentSession session, int id, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (District) session.get(tp_aa.District.class, new Integer(id), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDistrict(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return queryDistrict(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDistrict(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return queryDistrict(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District[] listDistrictByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return listDistrictByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District[] listDistrictByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return listDistrictByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryDistrict(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.District as District");
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
	
	public static List queryDistrict(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.District as District");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("District", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District[] listDistrictByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryDistrict(session, condition, orderBy);
			return (District[]) list.toArray(new District[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District[] listDistrictByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryDistrict(session, condition, orderBy, lockMode);
			return (District[]) list.toArray(new District[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District loadDistrictByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return loadDistrictByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District loadDistrictByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return loadDistrictByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District loadDistrictByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		District[] districts = listDistrictByQuery(session, condition, orderBy);
		if (districts != null && districts.length > 0)
			return districts[0];
		else
			return null;
	}
	
	public static District loadDistrictByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		District[] districts = listDistrictByQuery(session, condition, orderBy, lockMode);
		if (districts != null && districts.length > 0)
			return districts[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDistrictByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return iterateDistrictByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDistrictByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = tp_aa.TPAAPersistentManager.instance().getSession();
			return iterateDistrictByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDistrictByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.District as District");
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
	
	public static java.util.Iterator iterateDistrictByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From tp_aa.District as District");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("District", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District createDistrict() {
		return new tp_aa.District();
	}
	
	public static boolean save(tp_aa.District district) throws PersistentException {
		try {
			tp_aa.TPAAPersistentManager.instance().saveObject(district);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(tp_aa.District district) throws PersistentException {
		try {
			tp_aa.TPAAPersistentManager.instance().deleteObject(district);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(tp_aa.District district)throws PersistentException {
		try {
			tp_aa.User[] lUsers = district.user.toArray();
			for(int i = 0; i < lUsers.length; i++) {
				lUsers[i].setDistrict(null);
			}
			return delete(district);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(tp_aa.District district, org.orm.PersistentSession session)throws PersistentException {
		try {
			tp_aa.User[] lUsers = district.user.toArray();
			for(int i = 0; i < lUsers.length; i++) {
				lUsers[i].setDistrict(null);
			}
			try {
				session.delete(district);
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
	
	public static boolean refresh(tp_aa.District district) throws PersistentException {
		try {
			tp_aa.TPAAPersistentManager.instance().getSession().refresh(district);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(tp_aa.District district) throws PersistentException {
		try {
			tp_aa.TPAAPersistentManager.instance().getSession().evict(district);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static District loadDistrictByCriteria(DistrictCriteria districtCriteria) {
		District[] districts = listDistrictByCriteria(districtCriteria);
		if(districts == null || districts.length == 0) {
			return null;
		}
		return districts[0];
	}
	
	public static District[] listDistrictByCriteria(DistrictCriteria districtCriteria) {
		return districtCriteria.listDistrict();
	}
}
