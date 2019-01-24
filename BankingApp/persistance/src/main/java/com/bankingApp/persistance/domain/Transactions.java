/**
 * 
 */
package com.bankingApp.persistance.domain;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

/**
 * @author vijayendrakantipudi
 *
 */
@EntityListeners(AuditingEntityListener.class)
@Entity(name = "transactions")
@Data
public class Transactions extends Transaction {
}
