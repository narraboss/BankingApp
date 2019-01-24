/**
 * 
 */
package com.bankingApp.persistance.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

/**
 * @author vijayendrakantipudi
 *
 */
@EntityListeners(AuditingEntityListener.class)
@Entity(name = "account_details")
@Data
public class Account extends Auditable implements Serializable {

	private static final long serialVersionUID = -5844474580749849748L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_number", nullable = false)
	private String accNumber;

	@Column(name = "account_balance", nullable = false)
	private String balance;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	/**
	 * @return the accNumber
	 */
	public String getAccNumber() {
		return accNumber;
	}

	/**
	 * @param accNumber
	 *            the accNumber to set
	 */
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	/**
	 * @return the balance
	 */
	public String getBalance() {
		return balance;
	}

	/**
	 * @param balance
	 *            the balance to set
	 */
	public void setBalance(String balance) {
		this.balance = balance;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
