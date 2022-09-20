package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.User;
import com.user.proxy.UserProxy;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserProxy userProxy;
	
	@GetMapping("/{userId}")
	public User getUSer(@PathVariable("userId") Long userId) {
		
		User user = userService.getUser(userId);

		user.setContacts(userProxy.getContacts(userId));
		return user;
	}

}
