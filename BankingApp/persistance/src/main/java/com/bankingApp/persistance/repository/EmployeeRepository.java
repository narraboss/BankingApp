/**
 * 
 */
package com.bankingApp.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankingApp.persistance.domain.Employee;

/**
 * @author vijayendrakantipudi
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
