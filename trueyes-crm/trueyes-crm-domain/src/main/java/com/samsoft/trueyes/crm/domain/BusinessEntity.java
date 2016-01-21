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

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	

}
