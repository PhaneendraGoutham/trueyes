package com.samsoft.trueyes.core.domain;

import java.io.Serializable;

public interface IdAware<T extends Serializable> {

	/**
	 * @return the id
	 */
	T getId();

	void setId(T id);

}