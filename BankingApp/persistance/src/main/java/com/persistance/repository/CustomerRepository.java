/**
 * 
 */
package com.persistance.repository;

import org.persistance.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author vijayendrakantipudi
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, String> {

}
