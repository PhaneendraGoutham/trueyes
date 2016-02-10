/**
 * 
 */
package com.samsoft.trueyes.core.repo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.core.convert.CustomConversions;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;

/**
 * @author Kumar Sambhav Jain
 *
 */
public abstract class AbstractMongoRepoConfiguration implements InitializingBean {

	/**
	 * {@link Logger} log.
	 */
	private static Logger logger = LoggerFactory.getLogger(AbstractMongoRepoConfiguration.class);

	@Autowired
	protected MappingMongoConverter mappingMongoConverter;

	@Override
	public void afterPropertiesSet() throws Exception {
		logger.debug("Registering Customer Mongo converters");
		mappingMongoConverter.setCustomConversions(getCustomerConversion());
		mappingMongoConverter.afterPropertiesSet();
	}

	private CustomConversions getCustomerConversion() {
		List<Converter<?, ?>> converters = new ArrayList<Converter<?, ?>>();
		converters.add(new LocalDateReaderConverter());
		converters.add(new LocalDateWriterConverter());
		CustomConversions customConversion = new CustomConversions(converters);
		return customConversion;
	}
}
