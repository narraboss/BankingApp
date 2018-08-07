/**
 * 
 */
package com.bankingApp.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingApp.persistance.domain.Account;

/**
 * @author vijayendrakantipudi
 *
 */

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

}
