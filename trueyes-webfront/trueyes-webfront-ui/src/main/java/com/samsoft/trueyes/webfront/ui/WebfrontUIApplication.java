/**
 * 
 */
package com.samsoft.trueyes.webfront.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author sambhav.jain
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class WebfrontUIApplication extends WebMvcAutoConfigurationAdapter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(WebfrontUIApplication.class, args);
	}

}
