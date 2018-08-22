package com.bankingApp.persistance.service;

import com.bankingApp.persistance.domain.User;

public interface UserService {

	public User findUserByEmail(String email);
	public void saveUser(User user);

}