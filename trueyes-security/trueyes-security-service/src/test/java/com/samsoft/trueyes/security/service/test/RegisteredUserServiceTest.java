package com.samsoft.trueyes.security.service.test;

import org.jfairy.Fairy;
import org.jfairy.producer.person.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.samsoft.trueyes.security.domain.RegisteredUser;
import com.samsoft.trueyes.security.service.RegisteredUserService;
import com.samsoft.trueyes.security.service.SecurityServiceConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { SecurityServiceConfiguration.class })
public class RegisteredUserServiceTest {

	@Autowired
	private RegisteredUserService registeredUserService;

	private static final short COUNT = 5;

	private static final Fairy FAIRY = Fairy.create();

	@Test
	public void testSave() {
		for (short i = 0; i < COUNT; i++) {
			Person person = FAIRY.person();
			RegisteredUser user = new RegisteredUser(person.email(), "so");
			user = registeredUserService.register(user);
			Assert.assertNotNull(user.getId());
		}
	}

}
