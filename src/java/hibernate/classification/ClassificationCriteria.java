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
package hibernate.classification;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ClassificationCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression value;
	
	public ClassificationCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		value = new IntegerExpression("value", this);
	}
	
	public ClassificationCriteria(PersistentSession session) {
		this(session.createCriteria(Classification.class));
	}
	
	public ClassificationCriteria() throws PersistentException {
		this(hibernate.globalconf.TPAAPersistentManager.instance().getSession());
	}
	
	public Classification uniqueClassification() {
		return (Classification) super.uniqueResult();
	}
	
	public Classification[] listClassification() {
		java.util.List list = super.list();
		return (Classification[]) list.toArray(new Classification[list.size()]);
	}
}

