/**
 * 
 */
package com.bankingApp.persistance.domain;

import com.bankingApp.persistance.domain.constants.AddressType;

/**
 * @author vijayendrakantipudi
 *
 */
public class Address {
	
	private String buildingNum;
	private String street;
	private String city;
	private String state;
	private String Country;
	private String zipCode; //todo restrict to 5 digits
	private AddressType addressType;

}
