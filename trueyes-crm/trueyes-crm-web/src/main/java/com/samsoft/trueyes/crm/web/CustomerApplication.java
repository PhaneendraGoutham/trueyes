/**
 * 
 */
package com.samsoft.trueyes.crm.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.samsoft.trueyes.core.web.CoreWebConfiguration;
import com.samsoft.trueyes.crm.impl.CustomerServiceConfiguration;

/**
 * @author sambhav.jain
 *
 */

@SpringBootApplication
@Import(value = { CustomerServiceConfiguration.class, CoreWebConfiguration.class })
public class CustomerApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

}
