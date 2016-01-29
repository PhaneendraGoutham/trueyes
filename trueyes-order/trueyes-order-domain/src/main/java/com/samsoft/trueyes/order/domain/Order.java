/**
 * 
 */
package com.samsoft.trueyes.order.domain;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.samsoft.trueyes.core.domain.AuditableMongoEntity;
import com.samsoft.trueyes.crm.domain.Customer;

/**
 * @author sambhav.jain
 *
 */

public class Order extends AuditableMongoEntity {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -8906684270400698578L;

	@DBRef(lazy = true)
	@JsonIdentityReference(alwaysAsId = true)
	protected Customer customer;

}
