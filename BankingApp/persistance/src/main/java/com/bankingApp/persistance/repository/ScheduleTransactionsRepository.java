/**
 * 
 */
package com.bankingApp.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingApp.persistance.domain.SchedualTransactions;

/**
 * @author vijayendrakantipudi
 *
 */

@Repository
public interface ScheduleTransactionsRepository extends JpaRepository<SchedualTransactions, String>{

}
