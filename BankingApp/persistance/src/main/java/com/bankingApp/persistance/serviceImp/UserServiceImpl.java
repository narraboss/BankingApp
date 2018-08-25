package com.bankingApp.persistance.serviceImp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.bankingApp.persistance.Security.domain.CustomUserDetails;
import com.bankingApp.persistance.domain.User;
import com.bankingApp.persistance.repository.UserRepository;
import com.bankingApp.persistance.service.UserService;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public User findUserByEmail(String email) {
		return userRepository.findByemail(email);
	}

	@Override
	public void saveUser(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userRepository.save(user);
	}
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

		Optional<User> optionalUsers = userRepository.findByuserName(userName);

		optionalUsers.orElseThrow(() -> new UsernameNotFoundException("UserName not found!!!!!!!"));

		return optionalUsers.map(user -> new CustomUserDetails(user)).get();
	}

	@Override
	public Optional<User> findByuserId(String userId) {
		Optional<User> optionalUsers = userRepository.findByuserId(userId);

		optionalUsers.orElseThrow(() -> new UsernameNotFoundException("UserName not found!!!!!!!"));

		return optionalUsers;
	}

	@Override
	public Optional<User> findByuserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

}
