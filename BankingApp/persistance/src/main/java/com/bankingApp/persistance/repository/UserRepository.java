/**
 * 
 */
package com.bankingApp.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingApp.persistance.domain.User;

/**
 * @author vijayendrakantipudi
 *
 */

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
