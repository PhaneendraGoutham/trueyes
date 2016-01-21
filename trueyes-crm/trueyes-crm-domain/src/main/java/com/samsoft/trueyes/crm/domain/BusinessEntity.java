/**
 * 
 */
package com.samsoft.trueyes.crm.domain;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.samsoft.trueyes.core.domain.AuditableMongoEntity;

/**
 * @author kumar
 *
 */
public class BusinessEntity extends AuditableMongoEntity {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	@NotEmpty
	protected String fullName;
	
	protected String address;
	
	@Length(min=10,max=11)
	@NotEmpty
	protected String mobile;
	
	

}
