/**
 * 
 */
package com.bankingApp.persistance.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Repository;

import com.bankingApp.persistance.domain.User;

/**
 * @author vijayendrakantipudi
 *
 */

@Repository
public interface UserRepository extends JpaRepository<User, String>, UserDetailsService {

	User findByemail(String email);

	Optional<User> findByuserName(String userName);
	Optional<User> findByuserId(String userId);


}
