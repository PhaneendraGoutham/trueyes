/**
 * 
 */
package com.samsoft.trueyes.security.repo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.samsoft.trueyes.core.repo.AbstractMongoRepoConfiguration;

/**
 * @author sambhav.jain
 *
 */
@EnableMongoRepositories
@EnableAutoConfiguration
@EnableMongoAuditing
public class SecurityMongoRepositoryConfig extends AbstractMongoRepoConfiguration {

}
