/**
 * 
 */
package com.bankingApp.persistance.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.bankingApp.persistance.domain.constants.Role;

import lombok.Data;

/**
 * @author vijayendrakantipudi
 *
 */
@EntityListeners(AuditingEntityListener.class)
@Entity(name = "user_details")
@Data
public class User extends Auditable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -724691016780820533L;

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private String userId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "user_info")
	private UserInfo userInfo;

	@Column(name = "password")
	private String password;

	@Enumerated(EnumType.STRING)
	@Column(name = "role")
	private Role role;

	@OneToMany(mappedBy = "id")
	@Column(name = "security_questions")
	private List<SecurityQuestions> securityQuestions;

	/*
	 * (non-Javadoc)
	 * 
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
	 * @param userId
	 *            the userId to set
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
	 * @param userName
	 *            the userName to set
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
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}



	/**
	 * @return the securityQuestions
	 */
	public List<SecurityQuestions> getSecurityQuestions() {
		return securityQuestions;
	}

	/**
	 * @param securityQuestions
	 *            the securityQuestions to set
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
	 * @param userInfo
	 *            the userInfo to set
	 */
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
