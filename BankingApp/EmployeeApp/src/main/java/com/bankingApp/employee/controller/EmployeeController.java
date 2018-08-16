/**
 * 
 */
package com.bankingApp.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bankingApp.employee.service.IEmployeeService;
import com.bankingApp.persistance.domain.Employee;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;

/**
 * @author vijayendrakantipudi
 *
 */

@RestController
@RequestMapping("/employeeDetails")
@Api(value = "employeeController", description = "cntroller to save and get employee details")
public class EmployeeController {
	
	@Autowired
	IEmployeeService employeeService;

	@ApiOperation(value = "Save Employee Details", nickname = "SaveEmployee", consumes = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
	                        @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	                        @ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(method = RequestMethod.POST, path = "/bankingApp/v1/saveEmployee", consumes = "application/json")
	public String saveEmployeeDetails(@RequestBody Employee employee, 
			@RequestHeader(value = "userId", required = true) String userId) throws Exception {
		return employeeService.saveEmployeeDetails(employee);
	} 
	
	@ApiOperation(value = "Get Employee Details", nickname = "GetEmployee", produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
	                        @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	                        @ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(method = RequestMethod.GET, path = "/bankingApp/v1/getAllEmployee", produces = {"applicatio/json"})
	@ResponseStatus(code = HttpStatus.OK)
	public List<Employee> getAllEmployeeDetails(@RequestHeader(value = "userId", required = true) String userId) throws Exception{
		return employeeService.getAllEmployeeDetails();
	}
	
	@ApiOperation(value = "Get Employee Details by EmployeeId", nickname = "getByEmplId", produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
	                        @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	                        @ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(method = RequestMethod.GET, path = "/bankingApp/v1/getEmpByEmpId/{empId}", produces = {"application/json"})
	@ResponseStatus(code = HttpStatus.OK)
	public Employee getEmployeeByEmployeeId(@PathVariable String employeeId, 
					@RequestHeader(value = "userId", required = true) String userId) throws Exception {
		return employeeService.getEmployeeByEmployeeId(employeeId);
	}
	
	@ApiOperation(value = "Update Employee Details by EmployeeId", nickname = "UpdateEmployee", consumes = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
	                        @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	                        @ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(method = RequestMethod.PUT, path = "/bankingApp/v1/updateEmployee/{empId}", consumes = {"application/json"})
	@ResponseStatus(code = HttpStatus.OK)
	public String updateEmployeeByEmployeeId(@RequestBody Employee employee, @PathVariable String employeeId,
			@RequestHeader(value = "userId", required = true) String userId) throws Exception {
		return employeeService.updateEmployeeByEmployeeId(employee, employeeId);
	}
	
	@ApiOperation(value = "Delete All Employee Details", nickname = "DeleteEmployee")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
	                        @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	                        @ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(method = RequestMethod.DELETE, path = "/bankingApp/v1/deleteAllEmployee")
	public String deleteAllEmployeeDetails(@RequestHeader(value = "userId", required = true) String userId) {
		return employeeService.deleteAllEmployeeDetails();
	}
	
	@ApiOperation(value = "Delete Employee Details By EmployeeId", nickname = "DeleteByEmpId")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
	                        @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	                        @ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(method = RequestMethod.DELETE, path = "/bankingApp/v1/deleteByEmployeeId")
	public String deleteEmployeeByEmployeeId(@PathVariable String employeeId,
			@RequestHeader(value = "userId", required = true) String userId) {
		return employeeService.deleteEmployeeByEmployeeId(employeeId);
	}
}
