/**
 * 
 */
package com.bankingApp.persistance.domain.constants;

/**
 * @author vijayendrakantipudi
 *
 */
public enum AddressType implements TypeEnum {

	Permanent("permanent"), 
	Temporary("temporary");
	private final String value;

	AddressType(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public AddressType[] getValues() {
		return AddressType.values();
	}
}
