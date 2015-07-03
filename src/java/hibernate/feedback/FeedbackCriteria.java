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
package hibernate.feedback;

import hibernate.classification.ClassificationCriteria;
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class FeedbackCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression ClassificationId;
	public final AssociationExpression Classification;
	public final StringExpression coment;
	
	public FeedbackCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		ClassificationId = new IntegerExpression("Classification.ID", this);
		Classification = new AssociationExpression("Classification", this);
		coment = new StringExpression("coment", this);
	}
	
	public FeedbackCriteria(PersistentSession session) {
		this(session.createCriteria(Feedback.class));
	}
	
	public FeedbackCriteria() throws PersistentException {
		this(hibernate.globalconf.TPAAPersistentManager.instance().getSession());
	}
	
	public ClassificationCriteria createClassificationCriteria() {
		return new ClassificationCriteria(createCriteria("Classification"));
	}
	
	public Feedback uniqueFeedback() {
		return (Feedback) super.uniqueResult();
	}
	
	public Feedback[] listFeedback() {
		java.util.List list = super.list();
		return (Feedback[]) list.toArray(new Feedback[list.size()]);
	}
}

