/**
 * 
 */
package com.samsoft.trueyes.crm.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.samsoft.trueyes.crm.domain.Customer;

/**
 * @author kumar
 *
 */
public interface CustomerMongoRepository extends MongoRepository<Customer, String> {

	Customer findByMobile(String mobile);

}
