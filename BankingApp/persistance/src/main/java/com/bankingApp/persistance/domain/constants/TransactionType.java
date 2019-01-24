/**
 * 
 */
package com.bankingApp.persistance.domain.constants;

/**
 * @author vijayendrakantipudi
 *
 */
public enum TransactionType implements TypeEnum {
	
	Credit("credit"),
	Debit("debit"),
	Deposit("deposit");

    private final String value;

    TransactionType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public TransactionType[] getValues() {
        return TransactionType.values();
    }
}
