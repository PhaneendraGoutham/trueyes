/**
 * 
 */
package com.samsoft.trueyes.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.samsoft.trueyes.security.domain.RegisteredUser;
import com.samsoft.trueyes.security.repo.RegisteredUserRepository;

/**
 * @author sambhav.jain
 *
 */
@Service
public class RegisteredUserServiceImpl implements RegisteredUserService {

	@Autowired
	protected RegisteredUserRepository repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		RegisteredUser user = repo.findByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException(username + " not found");
		} else {
			return user;
		}
	}

	@Override
	public RegisteredUser register(RegisteredUser user) {
		return repo.save(user);
	}

}
