/**
 * 
 */
package com.samsoft.trueyes.inventory.domain;

import java.math.BigDecimal;

import com.samsoft.trueyes.core.domain.Effectivity;
import com.samsoft.trueyes.core.domain.IdAware;

/**
 * 
 * Stock Keeping Unit
 * 
 * @author sambhav.jain
 *
 */
public interface SKU extends Effectivity, IdAware<String> {

	/**
	 * Cost of procuring the Stock keeping Unit. this is not function of time.
	 * Selling price on other hand can be function of time, discounts, offers
	 * etc.
	 * 
	 * @return
	 */
	BigDecimal getCost();
}
