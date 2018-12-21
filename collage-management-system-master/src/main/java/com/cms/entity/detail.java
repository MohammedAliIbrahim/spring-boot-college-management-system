package com.cms.entity;

public class detail {
	
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getNtimes() {
		return ntimes;
	}
	public void setNtimes(int ntimes) {
		this.ntimes = ntimes;
	}
	private int percentage ;
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	private String sname ;
	private int ntimes ;
	public void setData(String name, int n ,int percentage ) {
		
		this.sname = name;
		this.ntimes = n;
		this.percentage = percentage;
	}

}