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
@Entity(name = "security_questions")
@Data
public class SecurityQuestions extends Auditable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3914566707150020428L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private String id;
	@Column(name = "question", nullable = false)
	private String sQuestion;

	@Column(name = "answer", nullable = false)
	private String sAnswer;

	@Column(name = "user_id", nullable = false)
	private String userId;

	/**
	 * @return the sQuestion
	 */
	public String getsQuestion() {
		return sQuestion;
	}

	/**
	 * @param sQuestion
	 *            the sQuestion to set
	 */
	public void setsQuestion(String sQuestion) {
		this.sQuestion = sQuestion;
	}

	/**
	 * @return the sAnswer
	 */
	public String getsAnswer() {
		return sAnswer;
	}

	/**
	 * @param sAnswer
	 *            the sAnswer to set
	 */
	public void setsAnswer(String sAnswer) {
		this.sAnswer = sAnswer;
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
		return "SecurityQuestions [sQuestion=" + sQuestion + ", sAnswer=" + sAnswer + ", userId=" + userId + "]";
	}

}
