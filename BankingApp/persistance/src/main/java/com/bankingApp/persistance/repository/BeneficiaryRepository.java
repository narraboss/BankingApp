/**
 * 
 */
package com.bankingApp.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingApp.persistance.domain.Beneficiary;

/**
 * @author vijayendrakantipudi
 *
 */
@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Long>{

}
