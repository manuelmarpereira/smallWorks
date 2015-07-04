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

import hibernate.district.DistrictCriteria;
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class subscriptionCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final IntegerExpression userId;
	public final AssociationExpression user;
	public final IntegerExpression subsTaskId;
	public final AssociationExpression subsTask;
	public final IntegerExpression subsDistrictId;
	public final AssociationExpression subsDistrict;
	
	public subscriptionCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		userId = new IntegerExpression("user.id", this);
		user = new AssociationExpression("user", this);
		subsTaskId = new IntegerExpression("subsTask.id", this);
		subsTask = new AssociationExpression("subsTask", this);
		subsDistrictId = new IntegerExpression("subsDistrict.id", this);
		subsDistrict = new AssociationExpression("subsDistrict", this);
	}
	
	public subscriptionCriteria(PersistentSession session) {
		this(session.createCriteria(subscription.class));
	}
	
	public subscriptionCriteria() throws PersistentException {
		this(hibernate.globalconf.TPAAPersistentManager.instance().getSession());
	}
	
	public hibernate.user.UserCriteria createUserCriteria() {
		return new hibernate.user.UserCriteria(createCriteria("user"));
	}
	
	public hibernate.task.TaskCriteria createSubsTaskCriteria() {
		return new hibernate.task.TaskCriteria(createCriteria("subsTask"));
	}
	
	public DistrictCriteria createSubsDistrictCriteria() {
		return new DistrictCriteria(createCriteria("subsDistrict"));
	}
	
	public subscription uniqueSubscription() {
		return (subscription) super.uniqueResult();
	}
	
	public subscription[] listSubscription() {
		java.util.List list = super.list();
		return (subscription[]) list.toArray(new subscription[list.size()]);
	}
}

