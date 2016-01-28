/**
 * 
 */
package com.samsoft.trueyes.crm.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.samsoft.trueyes.core.web.AbstractRestController;
import com.samsoft.trueyes.crm.api.CustomerService;
import com.samsoft.trueyes.crm.domain.Customer;

/**
 * @author sambhav.jain
 *
 */

@RestController
@RequestMapping("/customer")
public class CustomerController extends AbstractRestController<Customer> {

	@Autowired
	protected CustomerService customerService;

	@RequestMapping(method = RequestMethod.GET, value = "/find")
	public Customer findByMobile(@RequestParam String mobile) {

		return customerService.findByMobile(mobile);
	}
}
