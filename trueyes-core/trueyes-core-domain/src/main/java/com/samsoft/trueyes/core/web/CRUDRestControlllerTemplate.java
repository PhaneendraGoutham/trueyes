/**
 * 
 */
package com.samsoft.trueyes.core.web;

import org.springframework.web.bind.annotation.RestController;

import com.samsoft.trueyes.core.service.CrudService;

/**
 * @author kumar
 *
 */
@RestController
public abstract class CRUDRestControlllerTemplate<T> {

	protected abstract CrudService<T> getService();

	protected CrudService<T> service;

	public CRUDRestControlllerTemplate() {
		service = getService();
	}

}
