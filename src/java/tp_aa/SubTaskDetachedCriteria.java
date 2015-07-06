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

public class SubTaskDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final StringExpression name;
	
	public SubTaskDetachedCriteria() {
		super(tp_aa.SubTask.class, tp_aa.SubTaskCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public SubTaskDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tp_aa.SubTaskCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		name = new StringExpression("name", this.getDetachedCriteria());
	}
	
	public SubTask uniqueSubTask(PersistentSession session) {
		return (SubTask) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public SubTask[] listSubTask(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (SubTask[]) list.toArray(new SubTask[list.size()]);
	}
}

