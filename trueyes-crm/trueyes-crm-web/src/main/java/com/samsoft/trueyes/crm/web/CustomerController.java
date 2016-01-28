/**
 * 
 */
package com.samsoft.trueyes.crm.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samsoft.trueyes.core.web.AbstractRestController;
import com.samsoft.trueyes.crm.domain.Customer;

/**
 * @author sambhav.jain
 *
 */

@RestController
@RequestMapping("/customer")
public class CustomerController extends AbstractRestController<Customer> {

}
