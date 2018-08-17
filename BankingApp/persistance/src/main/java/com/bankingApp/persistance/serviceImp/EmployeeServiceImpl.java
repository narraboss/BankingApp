/**
 * 
 */
package com.bankingApp.persistance.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.bankingApp.employee.service.IEmployeeService;
import com.bankingApp.persistance.domain.Employee;
import com.bankingApp.persistance.repository.EmployeeRepository;

/**
 * @author vijayendrakantipudi
 *
 */
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	

	@Override
	public String saveEmployeeDetails(Employee employee) {
		employeeRepository.save(employee);
		return "Success";
	}

	@Override
	public List<Employee> getAllEmployeeDetails() {
		List<Employee> employee = employeeRepository.findAll();
		return employee;
	}

	@Override
	public Employee getEmployeeByEmployeeId(String employeeId) {
		Employee employee = employeeRepository.findByEmployeeId(employeeId);
		return employee;
	}

	@Override
	public String updateEmployeeByEmployeeId(Employee employee, String employeeId) {
		Employee employe = employeeRepository.findByEmployeeId(employeeId);
		employe.setFirstName(employee.getFirstName());
		employe.setLastName(employee.getLastName());
		employe.setMobNum(employee.getMobNum());
		employee.setSsn(employee.getSsn());
		employeeRepository.save(employe);
		return "Success";
	}

	@Override
	public String deleteAllEmployeeDetails() {
		employeeRepository.deleteAll();
		return "Success";
	}

	@Override
	public String deleteEmployeeByEmployeeId(String employeeId) {
		return "Success";
	}

}
