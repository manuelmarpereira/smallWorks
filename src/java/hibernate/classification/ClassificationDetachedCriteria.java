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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ClassificationDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression value;
	
	public ClassificationDetachedCriteria() {
		super(hibernate.classification.Classification.class, hibernate.classification.ClassificationCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		value = new IntegerExpression("value", this.getDetachedCriteria());
	}
	
	public ClassificationDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, hibernate.classification.ClassificationCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		value = new IntegerExpression("value", this.getDetachedCriteria());
	}
	
	public Classification uniqueClassification(PersistentSession session) {
		return (Classification) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Classification[] listClassification(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Classification[]) list.toArray(new Classification[list.size()]);
	}
}

