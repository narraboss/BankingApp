/**
 * 
 */
package com.bankingApp.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bankingApp.persistance.domain.Transactions;

/**
 * @author vijayendrakantipudi
 *
 */
@Repository
public interface TransactionsRepository extends JpaRepository<Transactions, Long>{

}
