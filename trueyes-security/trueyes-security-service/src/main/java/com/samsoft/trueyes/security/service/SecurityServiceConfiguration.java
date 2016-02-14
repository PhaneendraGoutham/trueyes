/**
 * 
 */
package com.samsoft.trueyes.security.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.samsoft.trueyes.security.repo.SecurityMongoRepositoryConfig;

/**
 * @author sambhav.jain
 *
 */
@Configuration
@ComponentScan
@Import(SecurityMongoRepositoryConfig.class)
public class SecurityServiceConfiguration {

}
