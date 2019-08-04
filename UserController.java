package com.hcl.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.product.dto.UserDTO;
import com.hcl.product.service.UserService;

@RestController
public class UserController {
	
	@Autowired UserService userService;
	

	@PostMapping("/userRegistration")
	public String userRegistration(@RequestBody UserDTO userDTO) {
		
		return userService.saveUser(userDTO);

	}
	
	@PostMapping("/userLogin")
	public String userLogin(@RequestParam("userName") String userName , @RequestParam("password") String password) {

		return userService.loginUser(userName, password);
}
	
}
