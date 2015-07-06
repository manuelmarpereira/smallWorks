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

public class MakeWorkDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id;
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
	public final StringExpression coordLat;
	public final StringExpression coordLong;
	public final DateExpression startDate;
	public final DateExpression finishDate;
	public final IntegerExpression EvaluationId;
	public final AssociationExpression Evaluation;
	
	public MakeWorkDetachedCriteria() {
		super(tp_aa.MakeWork.class, tp_aa.MakeWorkCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		CreatorId = new IntegerExpression("Creator.id", this.getDetachedCriteria());
		Creator = new AssociationExpression("Creator", this.getDetachedCriteria());
		TasksId = new IntegerExpression("Tasks.id", this.getDetachedCriteria());
		Tasks = new AssociationExpression("Tasks", this.getDetachedCriteria());
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
		finishDate = new DateExpression("finishDate", this.getDetachedCriteria());
		EvaluationId = new IntegerExpression("Evaluation.id", this.getDetachedCriteria());
		Evaluation = new AssociationExpression("Evaluation", this.getDetachedCriteria());
	}
	
	public MakeWorkDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, tp_aa.MakeWorkCriteria.class);
		id = new IntegerExpression("id", this.getDetachedCriteria());
		CreatorId = new IntegerExpression("Creator.id", this.getDetachedCriteria());
		Creator = new AssociationExpression("Creator", this.getDetachedCriteria());
		TasksId = new IntegerExpression("Tasks.id", this.getDetachedCriteria());
		Tasks = new AssociationExpression("Tasks", this.getDetachedCriteria());
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
		finishDate = new DateExpression("finishDate", this.getDetachedCriteria());
		EvaluationId = new IntegerExpression("Evaluation.id", this.getDetachedCriteria());
		Evaluation = new AssociationExpression("Evaluation", this.getDetachedCriteria());
	}
	
	public FeedbackDetachedCriteria createEvaluationCriteria() {
		return new FeedbackDetachedCriteria(createCriteria("Evaluation"));
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
	
	public MakeWork uniqueMakeWork(PersistentSession session) {
		return (MakeWork) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public MakeWork[] listMakeWork(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (MakeWork[]) list.toArray(new MakeWork[list.size()]);
	}
}

