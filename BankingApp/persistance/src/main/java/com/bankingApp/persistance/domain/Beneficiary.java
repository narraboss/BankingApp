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

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @param user
	 *            the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

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

}
