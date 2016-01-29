/**
 * 
 */
package com.samsoft.trueyes.crm.api;

import java.util.Collection;

import com.samsoft.trueyes.crm.domain.EyePrescription;

/**
 * @author sambhav.jain
 *
 */
public interface EyePrescriptionService {

	EyePrescription find(String id);

	EyePrescription save(EyePrescription prescription,String customerID);

	Collection<EyePrescription> findAllPresriptionForCustomer(String customerID);

	EyePrescription findLatestEyePrescriptionForCustomer(String customerID);
}
