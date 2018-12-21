package com.cms.entity;

import javax.persistence.SqlResultSetMapping;

@SqlResultSetMapping(name="mm")
public class AggregateResults {

	private final int notimes;

	private final String studentname;
	    public AggregateResults(int notimes, String studentname) {
	        this.notimes = notimes;
	        this.studentname = studentname;
	    }

	    public int getNotimes() {
	        return notimes;
	    }

	    public String getStudentname() {
	        return studentname;
	    }
}
