/**
 * 
 */
package com.samsoft.trueyes.core.web;

/**
 * @author sambhav.jain
 *
 */
public class ResourceNotFoundException extends Exception {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -6917321740792774921L;

	public String message;

	/**
	 * @param message
	 */
	public ResourceNotFoundException(String message) {
		super();
		this.message = message;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
