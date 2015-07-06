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

public class SubTaskCriteria extends AbstractORMCriteria {
	public final IntegerExpression id;
	public final StringExpression name;
	
	public SubTaskCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		name = new StringExpression("name", this);
	}
	
	public SubTaskCriteria(PersistentSession session) {
		this(session.createCriteria(SubTask.class));
	}
	
	public SubTaskCriteria() throws PersistentException {
		this(tp_aa.TPAAPersistentManager.instance().getSession());
	}
	
	public SubTask uniqueSubTask() {
		return (SubTask) super.uniqueResult();
	}
	
	public SubTask[] listSubTask() {
		java.util.List list = super.list();
		return (SubTask[]) list.toArray(new SubTask[list.size()]);
	}
}

