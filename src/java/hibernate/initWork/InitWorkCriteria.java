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
package hibernate.initWork;

import hibernate.district.DistrictCriteria;
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class InitWorkCriteria extends AbstractORMCriteria {
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
	public final LongExpression coordLat;
	public final LongExpression coordLong;
	public final DateExpression startDate;
	public final DateExpression initWork;
	
	public InitWorkCriteria(Criteria criteria) {
		super(criteria);
		id = new IntegerExpression("id", this);
		CreatorId = new IntegerExpression("Creator.id", this);
		Creator = new AssociationExpression("Creator", this);
		TasksId = new IntegerExpression("Tasks.id", this);
		Tasks = new AssociationExpression("Tasks", this);
		WorkerId = new IntegerExpression("Worker.id", this);
		Worker = new AssociationExpression("Worker", this);
		LocalizationId = new IntegerExpression("Localization.id", this);
		Localization = new AssociationExpression("Localization", this);
		title = new StringExpression("title", this);
		description = new StringExpression("description", this);
		price = new DoubleExpression("price", this);
		negotiable = new BooleanExpression("negotiable", this);
		coordLat = new LongExpression("coordLat", this);
		coordLong = new LongExpression("coordLong", this);
		startDate = new DateExpression("startDate", this);
		initWork = new DateExpression("initWork", this);
	}
	
	public InitWorkCriteria(PersistentSession session) {
		this(session.createCriteria(InitWork.class));
	}
	
	public InitWorkCriteria() throws PersistentException {
		this(hibernate.globalconf.TPAAPersistentManager.instance().getSession());
	}
	
	public hibernate.user.UserCriteria createCreatorCriteria() {
		return new hibernate.user.UserCriteria(createCriteria("Creator"));
	}
	
	public hibernate.task.TaskCriteria createTasksCriteria() {
		return new hibernate.task.TaskCriteria(createCriteria("Tasks"));
	}
	
	public hibernate.user.UserCriteria createWorkerCriteria() {
		return new hibernate.user.UserCriteria(createCriteria("Worker"));
	}
	
	public DistrictCriteria createLocalizationCriteria() {
		return new DistrictCriteria(createCriteria("Localization"));
	}
	
	public InitWork uniqueInitWork() {
		return (InitWork) super.uniqueResult();
	}
	
	public InitWork[] listInitWork() {
		java.util.List list = super.list();
		return (InitWork[]) list.toArray(new InitWork[list.size()]);
	}
}

