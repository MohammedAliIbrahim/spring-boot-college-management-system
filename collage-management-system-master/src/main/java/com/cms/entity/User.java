package com.cms.entity;

import java.io.Serializable;
import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the users database table.
 * 
 */
@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
@Table(name="users")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USERS_ID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USERS_ID_GENERATOR")
	@Column(unique=true, nullable=false , name="id")
	private int id;

	
	@Column(length=255,name="address")
	private String address;

	@Column(length=255,name="age")
	private int age;

	@Column(length=255 , name = "email")
	private String email;

	@Column(length=255,name = "first_name")
	private String firstname;

	@Column(length=255 , name="gender")
	private String gender;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="join_date")
	private Date joinDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_login_date")
	private Date lastLoginDate;

	@Column(name="last_login_ip", length=255)
	private String lastLoginIp;

	@Column(length=255 , name ="last_name")
	private String lastname;

	@Column(length=255 , name="mobile_number")
	private String mobile;

	@Column(length=255 , name ="password" )
	private String password;

	@Column(length=255  , name = "phone")
	private String phone;

	@Column(length=255 ,name="status")
	private String status;

	@Column(name="user_name", length=255)
	private String userName;

	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department department;
	
	//bi-directional many-to-one association to Instructor
	@OneToMany(mappedBy="user")
	private Set<Instructor> instructors;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	//bi-directional many-to-one association to Student
	@OneToMany(mappedBy="user")
	private Set<Student> students;

	//bi-directional many-to-many association to Role
	@ManyToMany(mappedBy="users")
	private Set<Role> roles;
	
	

	public User() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getJoinDate() {
		return this.joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Date getLastLoginDate() {
		return this.lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getLastLoginIp() {
		return this.lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

	public Set<Instructor> getInstructors() {
		return this.instructors;
	}

	public void setInstructors(Set<Instructor> instructors) {
		this.instructors = instructors;
	}

	public Instructor addInstructor(Instructor instructor) {
		getInstructors().add(instructor);
		instructor.setUser(this);

		return instructor;
	}

	public Instructor removeInstructor(Instructor instructor) {
		getInstructors().remove(instructor);
		instructor.setUser(null);

		return instructor;
	}

	public Set<Student> getStudents() {
		return this.students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	public Student addStudent(Student student) {
		getStudents().add(student);
		student.setUser(this);

		return student;
	}

	public Student removeStudent(Student student) {
		getStudents().remove(student);
		student.setUser(null);

		return student;
	}

	public Set<Role> getRoles() {
		return this.roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

}