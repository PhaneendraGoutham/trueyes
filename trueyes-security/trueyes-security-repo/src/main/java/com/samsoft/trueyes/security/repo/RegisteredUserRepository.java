/**
 * 
 */
package com.samsoft.trueyes.security.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.samsoft.trueyes.security.domain.RegisteredUser;

/**
 * @author sambhav.jain
 *
 */
@Repository
public interface RegisteredUserRepository extends MongoRepository<RegisteredUser, String> {

}
