package com.example.demo.repository.impl;

import java.util.Arrays;

import org.springframework.stereotype.Repository;

import com.example.demo.model.UserDetail;
import com.example.demo.repository.api.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Override
	public UserDetail findByUserName(String userName) {
		UserDetail userDetail = null;
		if (userName.equals("user")) {
			userDetail = new UserDetail("user", "user123", Arrays.asList("USER"));
		} else if (userName.equals("admin")) {
			userDetail = new UserDetail("admin", "admin123", Arrays.asList("USER", "ADMIN"));
		}

		return userDetail;
	}

}
