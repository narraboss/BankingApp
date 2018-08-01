/**
 * 
 */
package com.bankingApp.persistance.domain;

import java.sql.Timestamp;

/**
 * @author vijayendrakantipudi
 *
 */
public class LoginDetails extends Auditable {
	
    private Timestamp loginTime;

	/**
	 * @return the loginTime
	 */
	public Timestamp getLoginTime() {
		return loginTime;
	}

	/**
	 * @param loginTime the loginTime to set
	 */
	public void setLoginTime(Timestamp loginTime) {
		this.loginTime = loginTime;
	}	

}
