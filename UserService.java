package com.hcl.product.service;

import org.springframework.stereotype.Service;

import com.hcl.product.dto.UserDTO;
@Service
public interface UserService {

	public String saveUser(UserDTO userDTO);
	public String loginUser(String userName, String password);
	
}
