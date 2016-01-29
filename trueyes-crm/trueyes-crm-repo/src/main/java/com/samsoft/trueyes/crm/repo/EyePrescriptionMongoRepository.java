/**
 * 
 */
package com.samsoft.trueyes.crm.repo;

import java.util.Collection;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.samsoft.trueyes.crm.domain.EyePrescription;

/**
 * @author sambhav.jain
 *
 */
public interface EyePrescriptionMongoRepository extends MongoRepository<EyePrescription, String> {

	Collection<EyePrescription> findByCustomerId(String customerID);

	EyePrescription findTopByCustomerIdOrderByDateCreatedDesc(String customerID);

}
