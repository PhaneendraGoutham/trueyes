/**
 * 
 */
package com.samsoft.trueyes.crm.repo;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.CustomConversions;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author kumar
 *
 */
@EnableMongoRepositories
@EnableAutoConfiguration
@EnableMongoAuditing
public class CRMMongoRepositoryConfig implements InitializingBean {

	private static Logger logger = LoggerFactory.getLogger(CRMMongoRepositoryConfig.class);

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
