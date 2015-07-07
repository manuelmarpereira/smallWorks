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

public class MakeWorkCriteria extends AbstractORMCriteria {
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
	public final DateExpression finishDate;
	public final IntegerExpression EvaluationId;
	public final AssociationExpression Evaluation;
	
	public MakeWorkCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		CreatorId = new IntegerExpression("Creator.id", this);
		Creator = new AssociationExpression("Creator", this);
		subTaskId = new IntegerExpression("subTask.id", this);
		subTask = new AssociationExpression("subTask", this);
		WorkerId = new IntegerExpression("Worker.id", this);
		Worker = new AssociationExpression("Worker", this);
		LocalizationId = new IntegerExpression("Localization.id", this);
		Localization = new AssociationExpression("Localization", this);
		title = new StringExpression("title", this);
		description = new StringExpression("description", this);
		price = new DoubleExpression("price", this);
		negotiable = new BooleanExpression("negotiable", this);
		coordLat = new StringExpression("coordLat", this);
		coordLong = new StringExpression("coordLong", this);
		startDate = new DateExpression("startDate", this);
		finishDate = new DateExpression("finishDate", this);
		EvaluationId = new IntegerExpression("Evaluation.id", this);
		Evaluation = new AssociationExpression("Evaluation", this);
	}
	
	public MakeWorkCriteria(PersistentSession session) {
		this(session.createCriteria(MakeWork.class));
	}
	
	public MakeWorkCriteria() throws PersistentException {
		this(tp_aa.TPAAPersistentManager.instance().getSession());
	}
	
	public FeedbackCriteria createEvaluationCriteria() {
		return new FeedbackCriteria(createCriteria("Evaluation"));
	}
	
	public UserCriteria createCreatorCriteria() {
		return new UserCriteria(createCriteria("Creator"));
	}
	
	public SubTaskCriteria createSubTaskCriteria() {
		return new SubTaskCriteria(createCriteria("subTask"));
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

