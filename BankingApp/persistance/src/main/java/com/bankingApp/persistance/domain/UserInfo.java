/**
 * 
 */
package com.bankingApp.persistance.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;

/**
 * @author vijayendrakantipudi
 *
 */

@Data
@Embeddable
public class UserInfo implements Serializable {

	private static final long serialVersionUID = -1133947250911941187L;

	@Column(name = "first_name")
	private String fName;

	@Column(name = "last_name")
	private String lName;

	@Column(name = "user_address")
	private Address userAddress;

	@Column(name = "mobile_num")
	private String mobileNum;

	@Column(name = "email_id")
	private String mail;

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName
	 *            the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName
	 *            the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the userAddress
	 */
	public Address getUserAddress() {
		return userAddress;
	}

	/**
	 * @param userAddress
	 *            the userAddress to set
	 */
	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}

	/**
	 * @return the mobileNum
	 */
	public String getMobileNum() {
		return mobileNum;
	}

	/**
	 * @param mobileNum
	 *            the mobileNum to set
	 */
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail
	 *            the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}

}
