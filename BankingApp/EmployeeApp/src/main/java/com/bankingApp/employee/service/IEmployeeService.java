/**
 * 
 */
package com.bankingApp.employee.service;

import java.util.List;

import com.bankingApp.persistance.domain.Employee;

/**
 * @author vijayendrakantipudi
 *
 */
public interface IEmployeeService {

	String saveEmployeeDetails(Employee employee);

	List<Employee> getAllEmployeeDetails();

	Employee getEmployeeByEmployeeId(String employeeId);

	String updateEmployeeByEmployeeId(Employee employee, String employeeId);

	String deleteAllEmployeeDetails();

	String deleteEmployeeByEmployeeId(String employeeId);

}
