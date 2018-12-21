package com.cms.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the student_exams database table.
 * 
 */
@Embeddable
public class StudentExamPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="student_id", insertable=false, updatable=false, unique=true, nullable=false)
	private int studentId;

	@Column(name="exam_id", insertable=false, updatable=false, unique=true, nullable=false)
	private int examId;

	public StudentExamPK() {
	}
	public int getStudentId() {
		return this.studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getExamId() {
		return this.examId;
	}
	public void setExamId(int examId) {
		this.examId = examId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof StudentExamPK)) {
			return false;
		}
		StudentExamPK castOther = (StudentExamPK)other;
		return 
			(this.studentId == castOther.studentId)
			&& (this.examId == castOther.examId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.studentId;
		hash = hash * prime + this.examId;
		
		return hash;
	}
}