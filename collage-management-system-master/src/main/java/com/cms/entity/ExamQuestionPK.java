package com.cms.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the exam_questions database table.
 * 
 */
@Embeddable
public class ExamQuestionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="exam_id", insertable=false, updatable=false, unique=true, nullable=false)
	private int examId;

	@Column(name="question_id", insertable=false, updatable=false, unique=true, nullable=false)
	private int questionId;

	public ExamQuestionPK() {
	}
	public int getExamId() {
		return this.examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}
	public int getQuestionId() {
		return this.questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ExamQuestionPK)) {
			return false;
		}
		ExamQuestionPK castOther = (ExamQuestionPK)other;
		return 
			(this.examId == castOther.examId)
			&& (this.questionId == castOther.questionId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.examId;
		hash = hash * prime + this.questionId;
		
		return hash;
	}
}