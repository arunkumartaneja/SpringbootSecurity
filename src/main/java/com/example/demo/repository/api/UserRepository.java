package com.example.demo.repository.api;

import com.example.demo.model.UserDetail;

public interface UserRepository {

	UserDetail findByUserName(String userName);

}
