/**
 * 
 */
package com.samsoft.trueyes.crm.impl;

import java.util.Collection;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.samsoft.trueyes.crm.api.CustomerService;
import com.samsoft.trueyes.crm.domain.Customer;

/**
 * @author kumar
 *
 */
@Service
public class CustomerServiceMongoImpl implements CustomerService {

	@Override
	public Customer find(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Customer> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Customer> find(PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
