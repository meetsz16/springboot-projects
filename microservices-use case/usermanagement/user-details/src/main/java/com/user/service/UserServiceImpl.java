package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	List<User> userList = List.of(
			new User(1L, "Meet", "456"),
			new User(2L, "Raju", "123"),
			new User(3L, "Rahul", "789")
			);
	
	@Override
	public User getUser(Long userId) {
		// TODO Auto-generated method stub
		return userList.stream().filter(user->user.getUserId().equals(userId)).findAny().orElse(null); 
	}

}
