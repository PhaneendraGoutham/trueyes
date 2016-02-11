/**
 * 
 */
package com.samsoft.trueyes.webfront.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author sambhav.jain
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class WebfrontUIApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(WebfrontUIApplication.class, args);
	}

}
