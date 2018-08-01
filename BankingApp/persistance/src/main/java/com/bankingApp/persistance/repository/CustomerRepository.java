/**
 * 
 */
package com.bankingApp.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankingApp.persistance.domain.Customer;

/**
 * @author vijayendrakantipudi
 *
 */
public interface CustomerRepository extends JpaRepository<Customer, String> {

}
