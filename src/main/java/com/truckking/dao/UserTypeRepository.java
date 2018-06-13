/**
 * 
 */
package com.truckking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.truckking.model.UserType;

/**
 * @author karuppusamy
 * @version 1.0
 *
 */

@Repository
public interface UserTypeRepository extends CrudRepository<UserType, String> {

}
