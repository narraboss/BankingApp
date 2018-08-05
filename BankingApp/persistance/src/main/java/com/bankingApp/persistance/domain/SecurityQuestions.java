/**
 * 
 */
package com.bankingApp.persistance.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

/**
 * @author vijayendrakantipudi
 *
 */
@EntityListeners(AuditingEntityListener.class)
@Entity(name = "security_questions")
@Data
public class SecurityQuestions extends Auditable implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3914566707150020428L;
	
	@Column(name = "question")
	private String sQuestion;
	
	@Column(name = "answer")
	private String sAnswer;
	
	@Column(name = "user_id")
	private String userId;
	
	/**
	 * @return the sQuestion
	 */
	public String getsQuestion() {
		return sQuestion;
	}
	/**
	 * @param sQuestion the sQuestion to set
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
	 * @param sAnswer the sAnswer to set
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
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SecurityQuestions [sQuestion=" + sQuestion + ", sAnswer=" + sAnswer + ", userId=" + userId + "]";
	}

}
