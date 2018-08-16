/**
 * 
 */
package com.bankingApp.customer.controller;

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

import com.bankingApp.customer.service.ICustomerService;
import com.bankingApp.persistance.domain.Customer;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;


/**
 * @author vijayendrakantipudi
 *
 */

@RestController
@RequestMapping("/customerDetails")
@Api(value = "customerController", description = "cntroller to save and get customer details")
public class CustomerController {
	
	@Autowired
	ICustomerService customerService;
	
	@ApiOperation(value = "Saves Consumer Details", nickname = "SaveCustomer", consumes = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
	                        @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	                        @ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(method = RequestMethod.POST, path = "/bankingApp/v1/saveCustomer", consumes = {"applicatio/json"})
	@ResponseStatus(code = HttpStatus.OK)
	public String saveCustomerDetails(@RequestBody Customer customer, 
			@RequestHeader(value = "userId", required = true) String userId) throws Exception{
		return customerService.saveCustomerDetails(customer, userId);
	}
	
	@ApiOperation(value = "Get Consumer Details", nickname = "GetCustomer", produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
	                        @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	                        @ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(method = RequestMethod.GET, path = "/bankingApp/v1/getAllCustomer", produces = {"applicatio/json"})
	@ResponseStatus(code = HttpStatus.OK)
	public List<Customer> getAllCustomerDetails(@RequestHeader(value = "userId", required = true) String userId) throws Exception{
		return customerService.getAllCustomerDetails();
	}
	
	@ApiOperation(value = "Get Consumer Details by CustomerId", nickname = "getByCustId", produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
	                        @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	                        @ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(method = RequestMethod.GET, path = "/bankingApp/v1/getCustByCustId/{custId}", produces = {"application/json"})
	@ResponseStatus(code = HttpStatus.OK)
	public Customer getCustomerByCustomerId(@PathVariable String customerId, 
					@RequestHeader(value = "userId", required = true) String userId) throws Exception {
		return customerService.getCustomerByCustomerId(customerId);
	}
	
	@ApiOperation(value = "Update Consumer Details by CustomerId", nickname = "UpdateCustomer", consumes = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
	                        @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	                        @ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(method = RequestMethod.PUT, path = "/bankingApp/v1/updateCustomer/{custId}", consumes = {"application/json"})
	@ResponseStatus(code = HttpStatus.OK)
	public String updateCustomerByCustomerId(@RequestBody Customer customer, @PathVariable String customerId,
			@RequestHeader(value = "userId", required = true) String userId) throws Exception {
		return customerService.updateCustomerBycustomerId(customer, customerId);
	}
	
	@ApiOperation(value = "Delete All Consumer Details", nickname = "DeleteCustomer")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
	                        @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	                        @ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(method = RequestMethod.DELETE, path = "/bankingApp/v1/deleteAllCustomers")
	public String deleteAllCustomerDetails(@RequestHeader(value = "userId", required = true) String userId) {
		return customerService.deleteAllCustomerDetails();
	}
	
	@ApiOperation(value = "Delete Consumer Details By CustomerId", nickname = "DeleteByCusId")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = String.class),
	                        @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	                        @ApiResponse(code = 404, message = "Not Found"), @ApiResponse(code = 500, message = "Failure")})
	@RequestMapping(method = RequestMethod.DELETE, path = "/bankingApp/v1/deleteByCustomerId")
	public String deleteCustomerByCustomerId(@PathVariable String customerId,
			@RequestHeader(value = "userId", required = true) String userId) {
		return customerService.deleteCustomerByCustomerId(customerId);
	}
}
