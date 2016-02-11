package com.samsoft.trueyes.security.service.test;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.samsoft.trueyes.security.service.RegisteredUserService;
import com.samsoft.trueyes.security.service.SecurityServiceConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = { SecurityServiceConfiguration.class })
public class RegisteredUserServiceTest {

	@Autowired
	private RegisteredUserService registeredUserService;

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
