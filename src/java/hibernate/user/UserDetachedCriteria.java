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
package hibernate.user;

import hibernate.district.DistrictDetachedCriteria;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UserDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression districtId;
	public final AssociationExpression district;
	public final StringExpression nick;
	public final StringExpression firstname;
	public final StringExpression lastname;
	public final StringExpression password;
	public final StringExpression email;
	public final StringExpression photo;
	public final StringExpression coordLat;
	public final StringExpression coordLong;
	public final CollectionExpression subscriptions;
	
	public UserDetachedCriteria() {
		super(hibernate.user.User.class, hibernate.user.UserCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		districtId = new IntegerExpression("district.ID", this.getDetachedCriteria());
		district = new AssociationExpression("district", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		firstname = new StringExpression("firstname", this.getDetachedCriteria());
		lastname = new StringExpression("lastname", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		photo = new StringExpression("photo", this.getDetachedCriteria());
		coordLat = new StringExpression("coordLat", this.getDetachedCriteria());
		coordLong = new StringExpression("coordLong", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_Subscriptions", this.getDetachedCriteria());
	}
	
	public UserDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, hibernate.user.UserCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		districtId = new IntegerExpression("district.ID", this.getDetachedCriteria());
		district = new AssociationExpression("district", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		firstname = new StringExpression("firstname", this.getDetachedCriteria());
		lastname = new StringExpression("lastname", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		photo = new StringExpression("photo", this.getDetachedCriteria());
		coordLat = new StringExpression("coordLat", this.getDetachedCriteria());
		coordLong = new StringExpression("coordLong", this.getDetachedCriteria());
		subscriptions = new CollectionExpression("ORM_Subscriptions", this.getDetachedCriteria());
	}
	
	public DistrictDetachedCriteria createDistrictCriteria() {
		return new DistrictDetachedCriteria(createCriteria("district"));
	}
	
	public hibernate.subscription.subscriptionDetachedCriteria createSubscriptionsCriteria() {
		return new hibernate.subscription.subscriptionDetachedCriteria(createCriteria("ORM_Subscriptions"));
	}
	
	public User uniqueUser(PersistentSession session) {
		return (User) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public User[] listUser(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (User[]) list.toArray(new User[list.size()]);
	}
}

