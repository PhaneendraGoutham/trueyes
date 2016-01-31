/**
 * 
 */
package com.samsoft.trueyes.crm.repo;

import java.time.LocalDate;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

/**
 * @author sambhav.jain
 *
 */
@ReadingConverter
public class LocalDateReaderConverter implements Converter<Long, LocalDate> {

	@Override
	public LocalDate convert(Long source) {
		return LocalDate.ofEpochDay(source);
	}

}
