/**
 * 
 */
package com.bankingApp.persistance.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankingApp.customer.service.ICustomerService;
import com.bankingApp.persistance.domain.Customer;
import com.bankingApp.persistance.repository.CustomerRepository;

/**
 * @author vijayendrakantipudi
 *
 */

@Service
public class CustomerServiceImp implements ICustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public String saveCustomerDetails(Customer customer, String userId) throws Exception {
		customerRepository.save(customer);
		return "success";
	}

	@Override
	public List<Customer> getAllCustomerDetails() {
		List<Customer> customer = customerRepository.findAll();
		return customer;
	}

	@Override
	public Customer getCustomerByCustomerId(String customerId) {
		Customer customer = customerRepository.findByCustomerId(customerId);
		return customer;
	}

	@Override
	public String updateCustomerBycustomerId(Customer customer, String customerId) {
	Customer customer1 = customerRepository.findByCustomerId(customerId);
	customer1.setFirstName(customer.getFirstName());
	customer1.setLastName(customer.getLastName());
	customer1.setMobNum(customer.getMobNum());
	customer1.setSsn(customer.getSsn());
	customerRepository.save(customer1);
		return "success";
	}//440421

	@Override
	public String deleteAllCustomerDetails() {
		customerRepository.deleteAll();
		return "success";
	}

	@Override
	public String deleteCustomerByCustomerId(String customerId) {
		
		return "Success";
	}
}
