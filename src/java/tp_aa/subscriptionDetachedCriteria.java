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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class subscriptionDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression userId;
	public final AssociationExpression user;
	public final IntegerExpression subsTaskId;
	public final AssociationExpression subsTask;
	public final IntegerExpression subsDistrictId;
	public final AssociationExpression subsDistrict;
	
	public subscriptionDetachedCriteria() {
		super(tp_aa.subscription.class, tp_aa.subscriptionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		userId = new IntegerExpression("user.id", this.getDetachedCriteria());
		user = new AssociationExpression("user", this.getDetachedCriteria());
		subsTaskId = new IntegerExpression("subsTask.id", this.getDetachedCriteria());
		subsTask = new AssociationExpression("subsTask", this.getDetachedCriteria());
		subsDistrictId = new IntegerExpression("subsDistrict.id", this.getDetachedCriteria());
		subsDistrict = new AssociationExpression("subsDistrict", this.getDetachedCriteria());
	}
	
	public subscriptionDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tp_aa.subscriptionCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		userId = new IntegerExpression("user.id", this.getDetachedCriteria());
		user = new AssociationExpression("user", this.getDetachedCriteria());
		subsTaskId = new IntegerExpression("subsTask.id", this.getDetachedCriteria());
		subsTask = new AssociationExpression("subsTask", this.getDetachedCriteria());
		subsDistrictId = new IntegerExpression("subsDistrict.id", this.getDetachedCriteria());
		subsDistrict = new AssociationExpression("subsDistrict", this.getDetachedCriteria());
	}
	
	public UserDetachedCriteria createUserCriteria() {
		return new UserDetachedCriteria(createCriteria("user"));
	}
	
	public SubTaskDetachedCriteria createSubsTaskCriteria() {
		return new SubTaskDetachedCriteria(createCriteria("subsTask"));
	}
	
	public DistrictDetachedCriteria createSubsDistrictCriteria() {
		return new DistrictDetachedCriteria(createCriteria("subsDistrict"));
	}
	
	public subscription uniqueSubscription(PersistentSession session) {
		return (subscription) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public subscription[] listSubscription(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (subscription[]) list.toArray(new subscription[list.size()]);
	}
}

