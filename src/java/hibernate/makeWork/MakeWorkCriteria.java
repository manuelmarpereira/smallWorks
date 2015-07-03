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
package hibernate.makeWork;

import hibernate.feedback.FeedbackCriteria;
import hibernate.district.DistrictCriteria;
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;
import hibernate.user.UserCriteria;
import hibernate.task.TaskCriteria;

public class MakeWorkCriteria extends AbstractORMCriteria {
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
	public final DateExpression finishDate;
	public final IntegerExpression EvaluationId;
	public final AssociationExpression Evaluation;
	
	public MakeWorkCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		CreatorId = new IntegerExpression("Creator.ID", this);
		Creator = new AssociationExpression("Creator", this);
		TasksId = new IntegerExpression("Tasks.ID", this);
		Tasks = new AssociationExpression("Tasks", this);
		WorkerId = new IntegerExpression("Worker.ID", this);
		Worker = new AssociationExpression("Worker", this);
		LocalizationId = new IntegerExpression("Localization.ID", this);
		Localization = new AssociationExpression("Localization", this);
		title = new StringExpression("title", this);
		description = new StringExpression("description", this);
		price = new DoubleExpression("price", this);
		negotiable = new BooleanExpression("negotiable", this);
		startDate = new DateExpression("startDate", this);
		finishDate = new DateExpression("finishDate", this);
		EvaluationId = new IntegerExpression("Evaluation.ID", this);
		Evaluation = new AssociationExpression("Evaluation", this);
	}
	
	public MakeWorkCriteria(PersistentSession session) {
		this(session.createCriteria(MakeWork.class));
	}
	
	public MakeWorkCriteria() throws PersistentException {
		this(hibernate.globalconf.TPAAPersistentManager.instance().getSession());
	}
	
	public FeedbackCriteria createEvaluationCriteria() {
		return new FeedbackCriteria(createCriteria("Evaluation"));
	}
	
	public UserCriteria createCreatorCriteria() {
		return new UserCriteria(createCriteria("Creator"));
	}
	
	public TaskCriteria createTasksCriteria() {
		return new TaskCriteria(createCriteria("Tasks"));
	}
	
	public UserCriteria createWorkerCriteria() {
		return new UserCriteria(createCriteria("Worker"));
	}
	
	public DistrictCriteria createLocalizationCriteria() {
		return new DistrictCriteria(createCriteria("Localization"));
	}
	
	public MakeWork uniqueMakeWork() {
		return (MakeWork) super.uniqueResult();
	}
	
	public MakeWork[] listMakeWork() {
		java.util.List list = super.list();
		return (MakeWork[]) list.toArray(new MakeWork[list.size()]);
	}
}

