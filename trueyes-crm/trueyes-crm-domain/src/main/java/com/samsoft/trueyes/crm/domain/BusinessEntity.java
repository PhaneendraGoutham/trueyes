/**
 * 
 */
package com.samsoft.trueyes.crm.domain;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;

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
	@TextIndexed
	protected String fullName;

	protected String address;

	@NotEmpty
	@Size(min = 10, max = 11)
	@Indexed(background=false,unique=true,sparse=true)
	protected String mobile;

	@Email
	protected String email;

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName
	 *            the fullName to set
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
	 * @param address
	 *            the address to set
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
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
