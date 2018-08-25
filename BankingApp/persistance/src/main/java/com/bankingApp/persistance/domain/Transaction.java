/**
 * 
 */
package com.bankingApp.persistance.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.bankingApp.persistance.domain.constants.TransactionType;

/**
 * @author basanth
 *
 */
@MappedSuperclass
public class Transaction extends Auditable implements Serializable {

	private static final long serialVersionUID = 6609815263954499654L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private String id;

	@Column(name = "from_accnt", nullable = false)
	private String frmAccount;

	@Column(name = "to_accnt", nullable = false)
	private String toAccount;

	@Column(name = "amount", nullable = false)
	private double amount; // todo restrict to 2 decimal points

	@Enumerated(EnumType.STRING)
	@Column(name = "transaction_type", nullable = false)
	private TransactionType transactionType;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the frmAccount
	 */
	public String getFrmAccount() {
		return frmAccount;
	}

	/**
	 * @param frmAccount
	 *            the frmAccount to set
	 */
	public void setFrmAccount(String frmAccount) {
		this.frmAccount = frmAccount;
	}

	/**
	 * @return the toAccount
	 */
	public String getToAccount() {
		return toAccount;
	}

	/**
	 * @param toAccount
	 *            the toAccount to set
	 */
	public void setToAccount(String toAccount) {
		this.toAccount = toAccount;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}

	/**
	 * @return the transactionType
	 */
	public TransactionType getTransactionType() {
		return transactionType;
	}

	/**
	 * @param transactionType
	 *            the transactionType to set
	 */
	public void setTransactionType(TransactionType transactionType) {
		this.transactionType = transactionType;
	}

}
