/**
 * 
 */
package com.samsoft.trueyes.crm.repo.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.samsoft.trueyes.crm.domain.Customer;
import com.samsoft.trueyes.crm.repo.CRMMongoRepositoryConfig;
import com.samsoft.trueyes.crm.repo.CustomerMongoRepository;

/**
 * @author kumar
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CRMMongoRepositoryConfig.class })
public class CustomerMongoRepositoryTest {

	// TODO : Write other repo test cases.

	@Autowired
	public CustomerMongoRepository repo;

	@Test
	public void test() {
		assertNotNull(repo);
		Customer c = new Customer();
		c.setAddress("Test Address");
		c.setFullName("Sambhav");

		c = repo.save(c);
		assertNotNull(c.getId());
	}

}
