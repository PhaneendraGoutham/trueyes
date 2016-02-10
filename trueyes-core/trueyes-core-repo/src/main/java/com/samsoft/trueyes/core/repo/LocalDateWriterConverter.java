/**
 * 
 */
package com.samsoft.trueyes.core.repo;

import java.time.LocalDate;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;

/**
 * @author sambhav.jain
 *
 */
@WritingConverter
public class LocalDateWriterConverter implements Converter<LocalDate, Long> {

	@Override
	public Long convert(LocalDate source) {
		return source.toEpochDay();
	}

}
