package com.result.service;

import com.result.entity.User;

public interface UserService {

	public User saveUser(User user);
	public User validateUser(String email, String password);


}
