package com.result.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.result.entity.User;
import com.result.repository.UserRepository;
import com.result.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;


	@Override
	public User saveUser(User user)  {
        return userRepository.save(user);
    }

}
