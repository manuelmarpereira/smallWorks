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
package hibernate.district;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class DistrictCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression name;
	public final CollectionExpression user;
	
	public DistrictCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		name = new StringExpression("name", this);
		user = new CollectionExpression("ORM_User", this);
	}
	
	public DistrictCriteria(PersistentSession session) {
		this(session.createCriteria(District.class));
	}
	
	public DistrictCriteria() throws PersistentException {
		this(hibernate.globalconf.TPAAPersistentManager.instance().getSession());
	}
	
	public hibernate.user.UserCriteria createUserCriteria() {
		return new hibernate.user.UserCriteria(createCriteria("ORM_User"));
	}
	
	public District uniqueDistrict() {
		return (District) super.uniqueResult();
	}
	
	public District[] listDistrict() {
		java.util.List list = super.list();
		return (District[]) list.toArray(new District[list.size()]);
	}
}

