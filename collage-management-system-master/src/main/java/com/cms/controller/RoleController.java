package com.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cms.entity.Role;
import com.cms.services.RoleService;

@Controller
public class RoleController {

    @Autowired RoleService roleService;	
	
    //add user role
	public Role addUserRole(Role role) {
		return roleService.addUserRole(role);
	}
}
