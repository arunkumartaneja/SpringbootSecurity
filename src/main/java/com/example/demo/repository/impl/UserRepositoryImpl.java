package com.example.demo.repository.impl;

import org.springframework.stereotype.Repository;

import com.example.demo.model.UserDetail;
import com.example.demo.repository.api.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Override
	public UserDetail findByUserName(String userName) {
		return new UserDetail("user", "user");
	}

}
