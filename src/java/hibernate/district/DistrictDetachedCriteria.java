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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class DistrictDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final CollectionExpression user;
	
	public DistrictDetachedCriteria() {
		super(hibernate.district.District.class, hibernate.district.DistrictCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		user = new CollectionExpression("ORM_User", this.getDetachedCriteria());
	}
	
	public DistrictDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, hibernate.district.DistrictCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
		user = new CollectionExpression("ORM_User", this.getDetachedCriteria());
	}
	
	public hibernate.user.UserDetachedCriteria createUserCriteria() {
		return new hibernate.user.UserDetachedCriteria(createCriteria("ORM_User"));
	}
	
	public District uniqueDistrict(PersistentSession session) {
		return (District) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public District[] listDistrict(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (District[]) list.toArray(new District[list.size()]);
	}
}

