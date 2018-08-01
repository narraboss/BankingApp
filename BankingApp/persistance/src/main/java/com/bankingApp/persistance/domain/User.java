/**
 * 
 */
package com.bankingApp.persistance.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;

import com.bankingApp.persistance.domain.constants.Role;

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
	private String userName;
	private UserInfo userInfo;
	private String password;
	private List<Role> role;
	private List<SecurityQuestions> securityQuestions;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userInfo=" + userInfo + ", password=" + password
				+ ", role=" + role + ", securityQuestions=" + securityQuestions + "]";
	}
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
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
	 * @return the role
	 */
	public List<Role> getRole() {
		return role;
	}
	/**
	 * @param role the role to set
	 */
	public void setRole(List<Role> role) {
		this.role = role;
	}
	/**
	 * @return the securityQuestions
	 */
	public List<SecurityQuestions> getSecurityQuestions() {
		return securityQuestions;
	}
	/**
	 * @param securityQuestions the securityQuestions to set
	 */
	public void setSecurityQuestions(List<SecurityQuestions> securityQuestions) {
		this.securityQuestions = securityQuestions;
	}
	/**
	 * @return the userInfo
	 */
	public UserInfo getUserInfo() {
		return userInfo;
	}
	/**
	 * @param userInfo the userInfo to set
	 */
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
}
