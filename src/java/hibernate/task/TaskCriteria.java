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
package hibernate.task;

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TaskCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression name;
	public final CollectionExpression Subtaks;
	
	public TaskCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		name = new StringExpression("name", this);
		Subtaks = new CollectionExpression("ORM_Subtaks", this);
	}
	
	public TaskCriteria(PersistentSession session) {
		this(session.createCriteria(Task.class));
	}
	
	public TaskCriteria() throws PersistentException {
		this(hibernate.globalconf.TPAAPersistentManager.instance().getSession());
	}
	
	public hibernate.subTask.SubTaskCriteria createSubtaksCriteria() {
		return new hibernate.subTask.SubTaskCriteria(createCriteria("ORM_Subtaks"));
	}
	
	public Task uniqueTask() {
		return (Task) super.uniqueResult();
	}
	
	public Task[] listTask() {
		java.util.List list = super.list();
		return (Task[]) list.toArray(new Task[list.size()]);
	}
}

