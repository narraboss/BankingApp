/**
 * 
 */
package org.persistance.domain;

/**
 * 
 */
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
@Entity(name = "customer_details")
@Data
public class Customer extends Auditable implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2751721474382940224L;
	@Id
	@Column(name = "customer_id")
	private String customerId;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "ssn")
	private long ssn;

	@Column(name = "mobilr_num")
	private long mobNum;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName + ", ssn="
				+ ssn + ", mobNum=" + mobNum + "]";
	}
}
