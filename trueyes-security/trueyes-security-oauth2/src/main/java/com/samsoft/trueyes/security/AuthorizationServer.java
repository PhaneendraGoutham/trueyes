/**
 * 
 */
package com.samsoft.trueyes.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * 
 * 
 * OAuth2 Authorization Server.
 * 
 * @author sambhav.jain
 *
 */
@SpringBootApplication
@EnableAuthorizationServer
public class AuthorizationServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(AuthorizationServer.class, args);
	}

}
