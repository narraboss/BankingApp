/**
 * 
 */
package com.bankingApp.persistance.domain;

import com.bankingApp.persistance.domain.constants.TransactionType;

/**
 * @author vijayendrakantipudi
 *
 */
public class Transactions extends Auditable{
	
	private String frmAccount;
	private String toAccount;
	private double amount; //todo restrict to 2 decimal points
	private TransactionType transactionType;

}
