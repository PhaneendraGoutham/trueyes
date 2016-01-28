/**
 * 
 */
package com.samsoft.trueyes.core.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author sambhav.jain
 *
 */
@ControllerAdvice
public class GlobalControllerExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(GlobalControllerExceptionHandler.class);

	@ExceptionHandler(value = { BadRequestException.class })
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody
	public Map<String, String> handleBindingResultException(BadRequestException exception) {
		logger.error("Invalid data", exception);

		List<FieldError> allErrors = exception.bindingResult.getFieldErrors();

		Map<String, String> map = new HashMap<>(allErrors.size());

		allErrors.stream().forEach(e -> {
			map.put(e.getObjectName() + "." + e.getField(), e.getDefaultMessage());
		});
		return map;

	}

	@ExceptionHandler(value = { DataIntegrityViolationException.class })
	@ResponseStatus(value = HttpStatus.CONFLICT)
	@ResponseBody
	public Map<String, String> handleDataIntegrityViolationException(DataIntegrityViolationException exception) {

		logger.error("Handle DataIntegrityViolationException",exception);
		Map<String, String> map = new HashMap<>(1);
		map.put("error", exception.getMessage());
		return map;
	}
}
