/**
 * 
 */
package com.samsoft.trueyes.crm.repo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.samsoft.trueyes.core.repo.AbstractMongoRepoConfiguration;

/**
 * @author kumar
 *
 */
@EnableMongoRepositories
@EnableAutoConfiguration
@EnableMongoAuditing
public class CRMMongoRepositoryConfig extends AbstractMongoRepoConfiguration {

	

}
