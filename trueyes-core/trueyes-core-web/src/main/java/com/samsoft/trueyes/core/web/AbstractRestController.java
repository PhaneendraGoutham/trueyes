/**
 * 
 */
package com.samsoft.trueyes.core.web;

import java.security.Principal;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

	private static final Logger logger = LoggerFactory.getLogger(AbstractRestController.class);

	@Autowired
	protected CRUDService<T> service;

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public T find(@PathVariable String id) {
		return service.find(id);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/list")
	public Page<T> find(Pageable pageRequest, Principal principal) {
		logger.debug("Customer page requested by user {}", principal);
		return service.find(pageRequest);
	}

	@RequestMapping(method = RequestMethod.POST)
	public T save(@RequestBody @Valid T t, BindingResult result) throws Exception {

		if (result.hasErrors()) {
			throw new BadRequestException(result);
		}
		return service.save(t);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}
