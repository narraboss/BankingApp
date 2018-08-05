/**
 * 
 */
package com.bankingApp.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingApp.persistance.domain.LoginDetails;

/**
 * @author vijayendrakantipudi
 *
 */

@Repository
public interface LoginDetailsRepository extends JpaRepository<LoginDetails, Long>{

}
