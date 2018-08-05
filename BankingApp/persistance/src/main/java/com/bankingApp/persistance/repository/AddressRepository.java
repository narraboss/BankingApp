/**
 * 
 */
package com.bankingApp.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingApp.persistance.domain.Address;

/**
 * @author vijayendrakantipudi
 *
 */
@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
