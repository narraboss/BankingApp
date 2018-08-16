/**
 * 
 */
package com.bankingApp.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bankingApp.employee.service.IEmployeeService;
import com.bankingApp.persistance.domain.Employee;

/**
 * @author vijayendrakantipudi
 *
 */
public class EmployeeController {
	
	@Autowired
	IEmployeeService employeeService;

	@RequestMapping(method = RequestMethod.POST, path = "/bankingApp/v1/saveEmployee", consumes = "application/json")
	public String saveEmployeeDetails(@RequestBody Employee employee, 
			@RequestHeader(value = "userId", required = true) String userId) throws Exception {
		return employeeService.saveEmployeeDetails(employee);
	} 
}
