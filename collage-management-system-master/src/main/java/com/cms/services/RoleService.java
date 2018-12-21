package com.cms.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.entity.Role;
import com.cms.repository.RoleRepository;

@Service
public class RoleService {

	@Autowired RoleRepository roleRepository;
	
	public Role addUserRole(Role role) {
		return roleRepository.saveAndFlush(role);
	}


}
