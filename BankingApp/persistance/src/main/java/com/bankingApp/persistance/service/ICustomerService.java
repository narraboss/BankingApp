/**
 * 
 */
package com.bankingApp.persistance.service;

import java.util.List;

import com.bankingApp.persistance.domain.Customer;

/**
 * @author vijayendrakantipudi
 *
 */
public interface ICustomerService {
	
	public String saveCustomerDetails(Customer customer, String userId) throws Exception;

	public List<Customer> getAllCustomerDetails();

	public Customer getCustomerByCustomerId(String customerId);

	public String updateCustomerBycustomerId(Customer customer, String customerId);

	public String deleteAllCustomerDetails();

	public String deleteCustomerByCustomerId(String CustomerId);

}
