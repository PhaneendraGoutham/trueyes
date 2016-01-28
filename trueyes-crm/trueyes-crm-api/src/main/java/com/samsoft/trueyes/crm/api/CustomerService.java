/**
 * 
 */
package com.samsoft.trueyes.crm.api;

import com.samsoft.trueyes.core.api.CRUDService;
import com.samsoft.trueyes.crm.domain.Customer;

/**
 * @author kumar
 *
 */
public interface CustomerService extends CRUDService<Customer> {

	
	Customer findByMobile(String mobile);
}
