package com.mytion.sousacomics.service;

import java.util.List;

import com.mytion.sousacomics.model.entity.User;
import com.mytion.sousacomics.model.request.UserPostRequestBody;
import com.mytion.sousacomics.model.request.UserPutRequestBody;



public interface UserService {
	
	User register(UserPostRequestBody userPostRequestBody);
	
	List<User> getAll();
	
	User findById(Long id);

	void delete(Long id);

	void replace(UserPutRequestBody userPutRequestBody);
	
	List<User> findByFirstName(String firstName);
	

}
