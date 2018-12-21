package com.cms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the notifications database table.
 * 
 */
@Entity
@Table(name="notifications")
@NamedQuery(name="Notification.findAll", query="SELECT n FROM Notification n")
public class Notification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="NOTIFICATIONS_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="NOTIFICATIONS_ID_GENERATOR")
	@Column(unique=true, nullable=false)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="expire_date")
	private Date expireDate;

	@Column(name="is_viewed")
	private byte isViewed;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="notification_date")
	private Date notificationDate;

	@Column(name="notification_description", length=255)
	private String notificationDescription;

	@Column(name="notification_from", length=255)
	private String notificationFrom;

	@Column(name="notification_to", length=255)
	private String notificationTo;

	//bi-directional many-to-one association to Student
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;

	public Notification() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getExpireDate() {
		return this.expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public byte getIsViewed() {
		return this.isViewed;
	}

	public void setIsViewed(byte isViewed) {
		this.isViewed = isViewed;
	}

	public Date getNotificationDate() {
		return this.notificationDate;
	}

	public void setNotificationDate(Date notificationDate) {
		this.notificationDate = notificationDate;
	}

	public String getNotificationDescription() {
		return this.notificationDescription;
	}

	public void setNotificationDescription(String notificationDescription) {
		this.notificationDescription = notificationDescription;
	}

	public String getNotificationFrom() {
		return this.notificationFrom;
	}

	public void setNotificationFrom(String notificationFrom) {
		this.notificationFrom = notificationFrom;
	}

	public String getNotificationTo() {
		return this.notificationTo;
	}

	public void setNotificationTo(String notificationTo) {
		this.notificationTo = notificationTo;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}