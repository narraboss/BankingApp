/**
 * 
 */
package org.persistance.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;

import lombok.Data;

/**
 * @author vijayendrakantipudi
 *
 */
@Data
@Entity(name = "user")
public class User extends Auditable implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -724691016780820533L;
	
	
	private String userId;
	private String userDetails;
	private String password;
	private List<String> securityQuestions;
	
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the userDetails
	 */
	public String getUserDetails() {
		return userDetails;
	}
	/**
	 * @param userDetails the userDetails to set
	 */
	public void setUserDetails(String userDetails) {
		this.userDetails = userDetails;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the securityQuestions
	 */
	public List<String> getSecurityQuestions() {
		return securityQuestions;
	}
	/**
	 * @param securityQuestions the securityQuestions to set
	 */
	public void setSecurityQuestions(List<String> securityQuestions) {
		this.securityQuestions = securityQuestions;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userDetails=" + userDetails + ", password=" + password
				+ ", securityQuestions=" + securityQuestions + "]";
	}
}
