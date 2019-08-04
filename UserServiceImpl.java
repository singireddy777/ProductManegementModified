package com.hcl.product.service;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hcl.product.dto.UserDTO;
import com.hcl.product.entity.User;
import com.hcl.product.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepo;
	public String saveUser(UserDTO userDTO) {
		
		User user = new User();
		//BeanUtils.copyProperties(userDTO, user);
		user.setUserId(userDTO.getUserId());
		user.setUserName(userDTO.getUserName());
		user.setPassword(userDTO.getPassword());
		user.setEmail(userDTO.getEmail());
		user.setAddress(userDTO.getAddress());
		
		if(userRepo.save(user)!=null) {
			
		return "user added successfully....";
	}else {
		
		return "something went wrong";
	}}
	@Override
	public String loginUser(String userName, String password) {
		
		User user = userRepo.findByUserName(userName);
		
		if(user!=null) {
			
		         if(user.getUserName().equalsIgnoreCase(userName)&&user.getPassword().equalsIgnoreCase(password)) {
		
		    return "Login Successfully....";
		        }
		else { 
		       return "something went wrong please try again....";
		}
		
		}
		return "user doen't exist";
}
	}
