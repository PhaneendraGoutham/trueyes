/**
 * 
 */
package com.samsoft.trueyes.crm.web;

import java.util.Collection;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.samsoft.trueyes.core.web.AbstractRestController;
import com.samsoft.trueyes.core.web.BadRequestException;
import com.samsoft.trueyes.crm.api.CustomerService;
import com.samsoft.trueyes.crm.api.EyePrescriptionService;
import com.samsoft.trueyes.crm.domain.Customer;
import com.samsoft.trueyes.crm.domain.EyePrescription;

/**
 * @author sambhav.jain
 *
 */

@RestController
@RequestMapping("/customer")
public class CustomerController extends AbstractRestController<Customer> {

	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

	@Autowired
	protected CustomerService customerService;

	@Autowired
	protected EyePrescriptionService eyePrescService;

	@RequestMapping(method = RequestMethod.GET, value = "/find")
	public Customer findByMobile(@RequestParam String mobile) {
		return customerService.findByMobile(mobile);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}/prescriptions")
	public Collection<EyePrescription> getAllPrescription(@PathVariable String id) {
		return eyePrescService.findAllPresriptionForCustomer(id);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{id}/prescription/latest")
	public EyePrescription getCurrentPrescription(@PathVariable String id) {
		return eyePrescService.findLatestEyePrescriptionForCustomer(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/{id}/prescription")
	public EyePrescription savePrescription(@PathVariable String id, @RequestBody @Valid EyePrescription prescription,
			BindingResult bindingResult) throws BadRequestException {

		if (bindingResult.hasErrors()) {
			logger.error("Binding error while saving eye prescription");
			throw new BadRequestException(bindingResult);
		}
		return eyePrescService.save(prescription, id);
	}
}
