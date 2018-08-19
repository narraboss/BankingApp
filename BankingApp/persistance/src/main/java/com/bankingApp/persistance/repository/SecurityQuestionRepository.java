/**
 * 
 */
package com.bankingApp.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingApp.persistance.domain.SecurityQuestions;

/**
 * @author vijayendrakantipudi
 *
 */
@Repository
public interface SecurityQuestionRepository extends JpaRepository<SecurityQuestions, String> {

}
