/**
 * 
 */
package com.bankingApp.persistance.domain;

import java.sql.Date;

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
@Entity(name = "schedule_transactions")
@Data
public class SchedualTransactions extends Transaction {

	private static final long serialVersionUID = -2910438717068012897L;

	@Column(name = "schedule_time", nullable = false)
	private Date scheduleTime;

	/**
	 * @return the scheduleTime
	 */
	public Date getScheduleTime() {
		return scheduleTime;
	}

	/**
	 * @param scheduleTime
	 *            the scheduleTime to set
	 */
	public void setScheduleTime(Date scheduleTime) {
		this.scheduleTime = scheduleTime;
	}


}
