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
package hibernate.work;

import hibernate.district.DistrictDetachedCriteria;
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;
import hibernate.user.UserDetachedCriteria;
import hibernate.task.TaskDetachedCriteria;

public class WorkDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression CreatorId;
	public final AssociationExpression Creator;
	public final IntegerExpression TasksId;
	public final AssociationExpression Tasks;
	public final IntegerExpression WorkerId;
	public final AssociationExpression Worker;
	public final IntegerExpression LocalizationId;
	public final AssociationExpression Localization;
	public final StringExpression title;
	public final StringExpression description;
	public final DoubleExpression price;
	public final BooleanExpression negotiable;
	public final DateExpression startDate;
	
	public WorkDetachedCriteria() {
		super(hibernate.work.Work.class, hibernate.work.WorkCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		CreatorId = new IntegerExpression("Creator.ID", this.getDetachedCriteria());
		Creator = new AssociationExpression("Creator", this.getDetachedCriteria());
		TasksId = new IntegerExpression("Tasks.ID", this.getDetachedCriteria());
		Tasks = new AssociationExpression("Tasks", this.getDetachedCriteria());
		WorkerId = new IntegerExpression("Worker.ID", this.getDetachedCriteria());
		Worker = new AssociationExpression("Worker", this.getDetachedCriteria());
		LocalizationId = new IntegerExpression("Localization.ID", this.getDetachedCriteria());
		Localization = new AssociationExpression("Localization", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		price = new DoubleExpression("price", this.getDetachedCriteria());
		negotiable = new BooleanExpression("negotiable", this.getDetachedCriteria());
		startDate = new DateExpression("startDate", this.getDetachedCriteria());
	}
	
	public WorkDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, hibernate.work.WorkCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		CreatorId = new IntegerExpression("Creator.ID", this.getDetachedCriteria());
		Creator = new AssociationExpression("Creator", this.getDetachedCriteria());
		TasksId = new IntegerExpression("Tasks.ID", this.getDetachedCriteria());
		Tasks = new AssociationExpression("Tasks", this.getDetachedCriteria());
		WorkerId = new IntegerExpression("Worker.ID", this.getDetachedCriteria());
		Worker = new AssociationExpression("Worker", this.getDetachedCriteria());
		LocalizationId = new IntegerExpression("Localization.ID", this.getDetachedCriteria());
		Localization = new AssociationExpression("Localization", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		price = new DoubleExpression("price", this.getDetachedCriteria());
		negotiable = new BooleanExpression("negotiable", this.getDetachedCriteria());
		startDate = new DateExpression("startDate", this.getDetachedCriteria());
	}
	
	public UserDetachedCriteria createCreatorCriteria() {
		return new UserDetachedCriteria(createCriteria("Creator"));
	}
	
	public TaskDetachedCriteria createTasksCriteria() {
		return new TaskDetachedCriteria(createCriteria("Tasks"));
	}
	
	public UserDetachedCriteria createWorkerCriteria() {
		return new UserDetachedCriteria(createCriteria("Worker"));
	}
	
	public DistrictDetachedCriteria createLocalizationCriteria() {
		return new DistrictDetachedCriteria(createCriteria("Localization"));
	}
	
	public Work uniqueWork(PersistentSession session) {
		return (Work) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Work[] listWork(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Work[]) list.toArray(new Work[list.size()]);
	}
}

