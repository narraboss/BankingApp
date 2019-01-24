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
@Entity(name = "employee_details")
@Data
public class Employee extends Auditable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -601361143026566630L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_Id", nullable = false)
	private String employeeId;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "ssn", nullable = false)
	private long ssn;

	@Column(name = "mobilr_num", nullable = false)
	private long mobNum;

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
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId
	 *            the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the ssn
	 */
	public long getSsn() {
		return ssn;
	}

	/**
	 * @param ssn
	 *            the ssn to set
	 */
	public void setSsn(long ssn) {
		this.ssn = ssn;
	}

	/**
	 * @return the mobNum
	 */
	public long getMobNum() {
		return mobNum;
	}

	/**
	 * @param mobNum
	 *            the mobNum to set
	 */
	public void setMobNum(long mobNum) {
		this.mobNum = mobNum;
	}

}
