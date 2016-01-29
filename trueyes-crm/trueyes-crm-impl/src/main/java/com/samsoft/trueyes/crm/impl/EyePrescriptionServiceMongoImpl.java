/**
 * 
 */
package com.samsoft.trueyes.crm.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samsoft.trueyes.crm.api.EyePrescriptionService;
import com.samsoft.trueyes.crm.domain.Customer;
import com.samsoft.trueyes.crm.domain.EyePrescription;
import com.samsoft.trueyes.crm.repo.CustomerMongoRepository;
import com.samsoft.trueyes.crm.repo.EyePrescriptionMongoRepository;

/**
 * @author sambhav.jain
 *
 */
@Service
public class EyePrescriptionServiceMongoImpl implements EyePrescriptionService {

	@Autowired
	protected EyePrescriptionMongoRepository repo;

	@Autowired
	protected CustomerMongoRepository customerMongoRepo;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.samsoft.trueyes.crm.api.EyePrescriptionService#find(java.lang.String)
	 */
	@Override
	public EyePrescription find(String id) {
		return repo.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.samsoft.trueyes.crm.api.EyePrescriptionService#
	 * findAllPresriptionForCustomer(java.lang.String)
	 */
	@Override
	public Collection<EyePrescription> findAllPresriptionForCustomer(String customerID) {
		return repo.findByCustomerId(customerID);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.samsoft.trueyes.crm.api.EyePrescriptionService#
	 * findLatedEyePrescriptionForCustomer(java.lang.String)
	 */
	@Override
	public EyePrescription findLatestEyePrescriptionForCustomer(String customerID) {
		return repo.findTopByCustomerIdOrderByDateCreatedDesc(customerID);
	}

	@Override
	public EyePrescription save(EyePrescription prescription, String customerID) {
		Customer customer = customerMongoRepo.findOne(customerID);
		prescription.setCustomer(customer);
		return repo.save(prescription);
	}

}
