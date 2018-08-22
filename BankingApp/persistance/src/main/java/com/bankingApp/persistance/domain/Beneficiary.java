/**
 * 
 */
package com.bankingApp.persistance.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

/**
 * @author vijayendrakantipudi
 *
 */
@EntityListeners(AuditingEntityListener.class)
@Entity(name = "beneficiary")
@Data
public class Beneficiary extends Auditable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8471731696814812388L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private String id;

	@Column(name = "acc_hldr_name", nullable = false)
	private String accHldrName;

	@Column(name = "acc_hldr_Mob_number", nullable = false)
	private String accHldrMobNum;

	@Column(name = "acc_hldr_mail", nullable = false)
	private String accHldrMail;

	@Column(name = "user_id", nullable = false)
	private String userId;

	/**
	 * @return the accHldrName
	 */
	public String getAccHldrName() {
		return accHldrName;
	}

	/**
	 * @param accHldrName
	 *            the accHldrName to set
	 */
	public void setAccHldrName(String accHldrName) {
		this.accHldrName = accHldrName;
	}

	/**
	 * @return the accHldrNum
	 */
	public String getAccHldrMobNum() {
		return accHldrMobNum;
	}

	/**
	 * @param accHldrNum
	 *            the accHldrNum to set
	 */
	public void setAccHldrMobNum(String accHldrMobNum) {
		this.accHldrMobNum = accHldrMobNum;
	}

	/**
	 * @return the accHldrMail
	 */
	public String getAccHldrMail() {
		return accHldrMail;
	}

	/**
	 * @param accHldrMail
	 *            the accHldrMail to set
	 */
	public void setAccHldrMail(String accHldrMail) {
		this.accHldrMail = accHldrMail;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Beneficiary [accHldrName=" + accHldrName + ", accHldrMobNum=" + accHldrMobNum + ", accHldrMail="
				+ accHldrMail + ", userId=" + userId + "]";
	}

}
