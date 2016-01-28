/**
 * 
 */
package com.samsoft.trueyes.core.web;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author sambhav.jain
 *
 */
@Configuration
@ComponentScan
public class CoreWebConfiguration extends WebMvcConfigurerAdapter {

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {

		PageableHandlerMethodArgumentResolver pageableHandlerMethodArgumentResolver = new PageableHandlerMethodArgumentResolver();
		pageableHandlerMethodArgumentResolver.setMaxPageSize(20);
		pageableHandlerMethodArgumentResolver
				.setFallbackPageable(new PageRequest(0, 20, new Sort(Direction.DESC, "dateCreated")));
		argumentResolvers.add(pageableHandlerMethodArgumentResolver);
	}
}
