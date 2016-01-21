/**
 * 
 */
package com.samsoft.trueyes.crm.impl.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.samsoft.trueyes.crm.api.CustomerService;
import com.samsoft.trueyes.crm.impl.CustomerServiceConfiguration;

/**
 * @author kumar
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CustomerServiceConfiguration.class })
public class CustomerServiceTest {

	@Autowired
	CustomerService customerService;

	@Test
	public void test() {
		assertNotNull(customerService);
	}

}
