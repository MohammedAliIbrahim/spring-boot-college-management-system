package com.cms.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the roles database table.
 * 
 */
@Entity
@Table(name="roles")
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ROLES_ROLEID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ROLES_ROLEID_GENERATOR")
	@Column(name="role_id", unique=true, nullable=false)
	private int roleId;

	@Column(name="role_name", length=50)
	private String roleName;

	//bi-directional many-to-many association to User
	@ManyToMany
	@JoinTable(
		name="user_roles"
		, joinColumns={
			@JoinColumn(name="role_id", nullable=false)
			}
		, inverseJoinColumns={
			@JoinColumn(name="user_id", nullable=false)
			}
		)
	private Set<User> users;

	public Role() {
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<User> getUsers() {
		return this.users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

}