/**
 * 
 */
package com.bankingApp.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author vijayendrakantipudi
 *
 */
@Repository
public interface SecurityQuestionRepository extends JpaRepository<SecurityQuestionRepository, Long> {

}
