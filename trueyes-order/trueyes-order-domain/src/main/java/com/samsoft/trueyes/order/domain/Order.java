/**
 * 
 */
package com.samsoft.trueyes.order.domain;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.samsoft.trueyes.core.domain.AuditableMongoEntity;
import com.samsoft.trueyes.crm.domain.Customer;

/**
 * @author sambhav.jain
 *
 */

public class Order extends AuditableMongoEntity {

	public static enum Status {
		PENDING, COMPLETED, ON_HOLD
	}

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8906684270400698578L;

	@DBRef(lazy = true)
	@NotNull
	protected Customer customer;

	protected Status orderStatus = Status.PENDING;

	protected LocalDate estimatedDate;

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the orderStatus
	 */
	public Status getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus
	 *            the orderStatus to set
	 */
	public void setOrderStatus(Status orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * @return the estimatedDate
	 */
	public LocalDate getEstimatedDate() {
		return estimatedDate;
	}

	/**
	 * @param estimatedDate
	 *            the estimatedDate to set
	 */
	public void setEstimatedDate(LocalDate estimatedDate) {
		this.estimatedDate = estimatedDate;
	}

	
	public static void main(String... args){
		LocalDate ld = LocalDate.now();
		
		
		System.out.println(ld.getLong(ChronoField.EPOCH_DAY));
		
	}
}
