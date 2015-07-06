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

public class ClassificationDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression value;
	
	public ClassificationDetachedCriteria() {
		super(tp_aa.Classification.class, tp_aa.ClassificationCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		value = new IntegerExpression("value", this.getDetachedCriteria());
	}
	
	public ClassificationDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tp_aa.ClassificationCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
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

