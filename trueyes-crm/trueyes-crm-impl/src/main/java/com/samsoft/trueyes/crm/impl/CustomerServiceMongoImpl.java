/**
 * 
 */
package com.samsoft.trueyes.crm.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.samsoft.trueyes.crm.api.CustomerService;
import com.samsoft.trueyes.crm.domain.Customer;
import com.samsoft.trueyes.crm.repo.CustomerMongoRepository;

/**
 * @author kumar
 *
 */
@Service
public class CustomerServiceMongoImpl implements CustomerService {

	@Autowired
	protected CustomerMongoRepository repository;

	@Override
	public Customer find(String id) {
		return repository.findOne(id);
	}

	@Override
	public Collection<Customer> list() {
		return repository.findAll();
	}

	@Override
	public Page<Customer> find(Pageable pageRequest) {
		return repository.findAll(pageRequest);
	}

	@Override
	public Customer save(Customer t) {
		return repository.save(t);
	}

	@Override
	public Customer findByMobile(String mobile) {
		return repository.findByMobile(mobile);
	}

}
