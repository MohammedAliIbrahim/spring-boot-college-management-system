package com.cms.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the answers database table.
 * 
 */
@Embeddable
public class AnswerPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="question_id", insertable=false, updatable=false, unique=true, nullable=false)
	private int questionId;

	@Column(name="answers_id", unique=true, nullable=false)
	private int answersId;

	public AnswerPK() {
	}
	public int getQuestionId() {
		return this.questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public int getAnswersId() {
		return this.answersId;
	}
	public void setAnswersId(int answersId) {
		this.answersId = answersId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AnswerPK)) {
			return false;
		}
		AnswerPK castOther = (AnswerPK)other;
		return 
			(this.questionId == castOther.questionId)
			&& (this.answersId == castOther.answersId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.questionId;
		hash = hash * prime + this.answersId;
		
		return hash;
	}
}