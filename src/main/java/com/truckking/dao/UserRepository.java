/**
 * 
 */
package com.truckking.dao;

import org.springframework.data.repository.CrudRepository;

import com.truckking.model.User;

/**
 * @author karuppusamy
 * @version 1.0
 *
 */

public interface UserRepository extends CrudRepository<User, String> {

}
