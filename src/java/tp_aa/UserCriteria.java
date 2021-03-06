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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class UserCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
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
	
	public UserCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		districtId = new IntegerExpression("district.id", this);
		district = new AssociationExpression("district", this);
		nick = new StringExpression("nick", this);
		firstname = new StringExpression("firstname", this);
		lastname = new StringExpression("lastname", this);
		password = new StringExpression("password", this);
		email = new StringExpression("email", this);
		photo = new StringExpression("photo", this);
		coordLat = new StringExpression("coordLat", this);
		coordLong = new StringExpression("coordLong", this);
		subscriptions = new CollectionExpression("ORM_Subscriptions", this);
	}
	
	public UserCriteria(PersistentSession session) {
		this(session.createCriteria(User.class));
	}
	
	public UserCriteria() throws PersistentException {
		this(tp_aa.TPAAPersistentManager.instance().getSession());
	}
	
	public DistrictCriteria createDistrictCriteria() {
		return new DistrictCriteria(createCriteria("district"));
	}
	
	public tp_aa.subscriptionCriteria createSubscriptionsCriteria() {
		return new tp_aa.subscriptionCriteria(createCriteria("ORM_Subscriptions"));
	}
	
	public User uniqueUser() {
		return (User) super.uniqueResult();
	}
	
	public User[] listUser() {
		java.util.List list = super.list();
		return (User[]) list.toArray(new User[list.size()]);
	}
}

