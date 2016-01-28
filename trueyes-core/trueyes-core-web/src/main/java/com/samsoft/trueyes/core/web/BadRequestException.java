/**
 * 
 */
package com.samsoft.trueyes.core.web;

import org.springframework.validation.BindingResult;

/**
 * @author sambhav.jain
 *
 */
public class BadRequestException extends Exception {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5713454665377211142L;

	protected BindingResult bindingResult;

	/**
	 * @return the bindingResult
	 */
	public BindingResult getBindingResult() {
		return bindingResult;
	}

	/**
	 * @param bindingResult
	 *            the bindingResult to set
	 */
	public void setBindingResult(BindingResult bindingResult) {
		this.bindingResult = bindingResult;
	}

	/**
	 * @param bindingResult
	 */
	public BadRequestException(BindingResult bindingResult) {
		super();
		this.bindingResult = bindingResult;
	}

}
