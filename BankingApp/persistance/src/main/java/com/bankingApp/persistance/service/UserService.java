package com.bankingApp.persistance.service;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;

import com.bankingApp.persistance.domain.User;

@Component(value = "user_service")
public interface UserService extends UserDetailsService {

	public User findUserByEmail(String email);

	public void saveUser(User user);

	Optional<User> findByuserId(String userId);

	Optional<User> findByuserName(String userName);

}