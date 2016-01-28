/**
 * 
 */
package com.samsoft.trueyes.core.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.samsoft.trueyes.core.api.CRUDService;

/**
 * @author sambhav.jain
 *
 */
public abstract class AbstractRestController<T> {

	@Autowired
	protected CRUDService<T> service;

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public T find(@PathVariable String id) {
		return service.find(id);
	}

	@RequestMapping(method = RequestMethod.POST)
	public T save(@RequestBody @Valid T t, BindingResult result) throws Exception {

		if (result.hasErrors()) {
			throw new BadRequestException(result);
		}
		return service.save(t);
	}
}
