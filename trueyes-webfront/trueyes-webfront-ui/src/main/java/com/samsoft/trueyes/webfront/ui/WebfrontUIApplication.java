/**
 * 
 */
package com.samsoft.trueyes.webfront.ui;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.WebUtils;

/**
 * @author sambhav.jain
 *
 */
@SpringBootApplication
@EnableZuulProxy
@EnableOAuth2Sso
public class WebfrontUIApplication extends WebSecurityConfigurerAdapter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(WebfrontUIApplication.class, args);
	}

	public static class CsrfHeaderFilter extends OncePerRequestFilter {
		private static final String XSRF_TOKEN = "XSRF-TOKEN";

		@Override
		protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
				FilterChain filterChain) throws ServletException, IOException {
			CsrfToken csrf = (CsrfToken) request.getAttribute(CsrfToken.class.getName());
			if (csrf != null) {
				Cookie cookie = WebUtils.getCookie(request, XSRF_TOKEN);
				String token = csrf.getToken();
				if (cookie == null || token != null && !token.equals(cookie.getValue())) {
					cookie = new Cookie(XSRF_TOKEN, token);
					cookie.setPath("/");
					response.addCookie(cookie);
				}
			}
			filterChain.doFilter(request, response);
		}
	}

	private CsrfTokenRepository csrfTokenRepository() {
		HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
		repository.setHeaderName("X-XSRF-TOKEN");
		return repository;
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
		//@formatter:off
		http
			.authorizeRequests()
			.antMatchers("/**/*.html", "/**/*.js", "/**/*.less", "/**/*.css")
			.permitAll()
				.anyRequest()
				.authenticated()
			.and()
				.csrf()
				.csrfTokenRepository(csrfTokenRepository())
			.and()
				.addFilterAfter(new CsrfHeaderFilter(), CsrfFilter.class);
		//@formatter:off
	}

}
