/**
 * 
 */
package com.samsoft.trueyes.security.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.samsoft.trueyes.security.domain.RegisteredUser;

/**
 * @author sambhav.jain
 *
 */
public interface RegisteredUserService extends UserDetailsService {

	RegisteredUser register(RegisteredUser user);
}
