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

public class WorkDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
	public final IntegerExpression CreatorId;
	public final AssociationExpression Creator;
	public final IntegerExpression subTaskId;
	public final AssociationExpression subTask;
	public final IntegerExpression WorkerId;
	public final AssociationExpression Worker;
	public final IntegerExpression LocalizationId;
	public final AssociationExpression Localization;
	public final StringExpression title;
	public final StringExpression description;
	public final DoubleExpression price;
	public final BooleanExpression negotiable;
	public final StringExpression coordLat;
	public final StringExpression coordLong;
	public final DateExpression startDate;
	
	public WorkDetachedCriteria() {
		super(tp_aa.Work.class, tp_aa.WorkCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		CreatorId = new IntegerExpression("Creator.id", this.getDetachedCriteria());
		Creator = new AssociationExpression("Creator", this.getDetachedCriteria());
		subTaskId = new IntegerExpression("subTask.id", this.getDetachedCriteria());
		subTask = new AssociationExpression("subTask", this.getDetachedCriteria());
		WorkerId = new IntegerExpression("Worker.id", this.getDetachedCriteria());
		Worker = new AssociationExpression("Worker", this.getDetachedCriteria());
		LocalizationId = new IntegerExpression("Localization.id", this.getDetachedCriteria());
		Localization = new AssociationExpression("Localization", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		price = new DoubleExpression("price", this.getDetachedCriteria());
		negotiable = new BooleanExpression("negotiable", this.getDetachedCriteria());
		coordLat = new StringExpression("coordLat", this.getDetachedCriteria());
		coordLong = new StringExpression("coordLong", this.getDetachedCriteria());
		startDate = new DateExpression("startDate", this.getDetachedCriteria());
	}
	
	public WorkDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tp_aa.WorkCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		CreatorId = new IntegerExpression("Creator.id", this.getDetachedCriteria());
		Creator = new AssociationExpression("Creator", this.getDetachedCriteria());
		subTaskId = new IntegerExpression("subTask.id", this.getDetachedCriteria());
		subTask = new AssociationExpression("subTask", this.getDetachedCriteria());
		WorkerId = new IntegerExpression("Worker.id", this.getDetachedCriteria());
		Worker = new AssociationExpression("Worker", this.getDetachedCriteria());
		LocalizationId = new IntegerExpression("Localization.id", this.getDetachedCriteria());
		Localization = new AssociationExpression("Localization", this.getDetachedCriteria());
		title = new StringExpression("title", this.getDetachedCriteria());
		description = new StringExpression("description", this.getDetachedCriteria());
		price = new DoubleExpression("price", this.getDetachedCriteria());
		negotiable = new BooleanExpression("negotiable", this.getDetachedCriteria());
		coordLat = new StringExpression("coordLat", this.getDetachedCriteria());
		coordLong = new StringExpression("coordLong", this.getDetachedCriteria());
		startDate = new DateExpression("startDate", this.getDetachedCriteria());
	}
	
	public UserDetachedCriteria createCreatorCriteria() {
		return new UserDetachedCriteria(createCriteria("Creator"));
	}
	
	public SubTaskDetachedCriteria createSubTaskCriteria() {
		return new SubTaskDetachedCriteria(createCriteria("subTask"));
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

