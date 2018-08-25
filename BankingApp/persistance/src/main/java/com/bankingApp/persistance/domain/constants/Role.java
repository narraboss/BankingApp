/**
 * 
 */
package com.bankingApp.persistance.domain.constants;

/**
 * @author vijayendrakantipudi
 *
 */
public enum Role implements TypeEnum {

	Employee("employee"), Customer("customer"), Admin("admin");

	private final String value;

	Role(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public Role[] getValues() {
		return Role.values();
	}
}
