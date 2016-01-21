/**
 * 
 */
package com.samsoft.trueyes.crm.impl;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.samsoft.trueyes.crm.repo.CRMMongoRepositoryConfig;

/**
 * @author kumar
 *
 */
@Import(value = { CRMMongoRepositoryConfig.class })
@Configuration
public class CustomerServiceConfiguration {

}
