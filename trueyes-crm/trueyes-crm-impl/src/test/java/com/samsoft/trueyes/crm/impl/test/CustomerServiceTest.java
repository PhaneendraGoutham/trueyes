/**
 * 
 */
package com.samsoft.trueyes.crm.impl.test;

import org.apache.commons.lang.math.RandomUtils;
import org.jfairy.Fairy;
import org.jfairy.producer.person.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.samsoft.trueyes.crm.api.CustomerService;
import com.samsoft.trueyes.crm.api.EyePrescriptionService;
import com.samsoft.trueyes.crm.domain.Customer;
import com.samsoft.trueyes.crm.domain.EyePrescription;
import com.samsoft.trueyes.crm.domain.EyePrescription.EyeSight;
import com.samsoft.trueyes.crm.impl.CustomerServiceConfiguration;

/**
 * @author kumar
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { CustomerServiceConfiguration.class })
@ActiveProfiles("dev")
@TestPropertySource(locations = { "classpath:application.properties" })
public class CustomerServiceTest {

	private static final Fairy FAIRY = Fairy.create();

	@Autowired
	CustomerService customerService;

	@Autowired
	EyePrescriptionService prescService;

	private static final int COUNT = 100;

	@Test
	public void testSave() {

		for (int i = 0; i < COUNT; i++) {

			Person person = FAIRY.person();
			Customer customer = new Customer();
			customer.setAddress(person.getAddress().toString());
			customer.setEmail(person.email());
			customer.setFullName(person.fullName());
			customer.setMobile("852654" + RandomUtils.nextInt(9999));

			customer = customerService.save(customer);

			Assert.assertNotNull(customer);

			Assert.assertTrue(customer.getId().length() > 0);

			EyePrescription prescription = new EyePrescription();

			prescription.setCustomer(customer);
			prescription.setLeft(new EyeSight(RandomUtils.nextFloat() - 2));
			prescription.setRight(new EyeSight(RandomUtils.nextFloat() - 2));
			prescService.save(prescription, customer.getId());
		}

	}

}
