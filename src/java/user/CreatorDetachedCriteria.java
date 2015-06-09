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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CreatorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nick;
	public final StringExpression firstname;
	public final StringExpression lastname;
	public final StringExpression password;
	public final StringExpression email;
	public final StringExpression photo;
	public final LongExpression coordLat;
	public final LongExpression coordLong;
	public final StringExpression type;
	
	public CreatorDetachedCriteria() {
		super(Creator.class, CreatorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		firstname = new StringExpression("firstname", this.getDetachedCriteria());
		lastname = new StringExpression("lastname", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		photo = new StringExpression("photo", this.getDetachedCriteria());
		coordLat = new LongExpression("coordLat", this.getDetachedCriteria());
		coordLong = new LongExpression("coordLong", this.getDetachedCriteria());
		type = new StringExpression("type", this.getDetachedCriteria());
	}
	
	public CreatorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, CreatorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nick = new StringExpression("nick", this.getDetachedCriteria());
		firstname = new StringExpression("firstname", this.getDetachedCriteria());
		lastname = new StringExpression("lastname", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		photo = new StringExpression("photo", this.getDetachedCriteria());
		coordLat = new LongExpression("coordLat", this.getDetachedCriteria());
		coordLong = new LongExpression("coordLong", this.getDetachedCriteria());
		type = new StringExpression("type", this.getDetachedCriteria());
	}
	
	public Creator uniqueCreator(PersistentSession session) {
		return (Creator) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Creator[] listCreator(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Creator[]) list.toArray(new Creator[list.size()]);
	}
}

