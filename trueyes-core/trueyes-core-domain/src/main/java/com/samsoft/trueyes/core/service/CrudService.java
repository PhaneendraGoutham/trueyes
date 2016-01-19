/**
 * 
 */
package com.samsoft.trueyes.core.service;

import java.util.Collection;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

/**
 * @author kumar
 *
 */
@Repository
public interface CrudService<T> {

	Collection<T> list();

	Page<T> list(Pageable pageRequest);

	T save(T t);

	void delete(String id);

	T find(String id);

}
