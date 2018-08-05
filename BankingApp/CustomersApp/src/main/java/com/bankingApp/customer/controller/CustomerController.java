/**
 * 
 */
package com.bankingApp.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bankingApp.customer.service.ICustomerService;
import com.bankingApp.persistance.domain.Customer;

/**
 * @author vijayendrakantipudi
 *
 */

@RestController
public class CustomerController {
	
	@Autowired
	ICustomerService customerService;
	
	@RequestMapping(method = RequestMethod.POST, path = "/bankingApp/v1/saveCustomer", consumes = {"applicatio/json"})
	@ResponseStatus(code = HttpStatus.OK)
	public String saveCustomerDetails(@RequestBody Customer customer, 
			@RequestHeader(value = "userId", required = true) String userId) throws Exception{
		return customerService.saveCustomerDetails();

	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/bankingApp/v1/getCustomer", produces = {"applicatio/json"})
	@ResponseStatus(code = HttpStatus.OK)
	public String getCustomerDetails(@RequestBody Customer customer, 
			@RequestHeader(value = "userId", required = true) String userId) throws Exception{
		return null;

	}

}
