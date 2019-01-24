/**
 * 
 */
package com.bankingApp.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingApp.persistance.domain.Customer;

/**
 * @author vijayendrakantipudi
 *
 */

@Repository(value = "customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, String> {

	public Customer findByCustomerId(String customerId);

	public Customer deleteByCustomerId(String customerId);

}
