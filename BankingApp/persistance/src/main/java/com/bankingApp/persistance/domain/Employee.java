/**
 * 
 */
package com.bankingApp.persistance.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

/**
 * @author vijayendrakantipudi
 *
 */
@EntityListeners(AuditingEntityListener.class)
@Entity(name = "employee_details1")
@Data
public class Employee extends Auditable implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -601361143026566630L;
	@Id
	@Column(name = "employee_Id")
	private String employeeId;
	
	private String userId;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "ssn")
	private long ssn;

	@Column(name = "mobilr_num")
	private long mobNum;

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
}
