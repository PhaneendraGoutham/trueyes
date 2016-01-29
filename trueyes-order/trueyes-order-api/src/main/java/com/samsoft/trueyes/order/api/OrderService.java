/**
 * 
 */
package com.samsoft.trueyes.order.api;

import java.util.Collection;

import org.springframework.data.domain.Pageable;

import com.samsoft.trueyes.core.api.CRUDService;
import com.samsoft.trueyes.order.domain.Order;

/**
 * @author sambhav.jain
 *
 */
public interface OrderService extends CRUDService<Order> {

	Collection<Order> getAllActiveOrders();

	Collection<Order> list(Pageable pageRequest);

	Collection<Order> getAllOrderForCustomer(String customerId);

	Collection<Order> getAllPendingOrderForCustomer(String customerId);

}
