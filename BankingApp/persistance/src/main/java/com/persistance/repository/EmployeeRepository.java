/**
 * 
 */
package com.persistance.repository;

import org.persistance.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author vijayendrakantipudi
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
