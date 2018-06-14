/**
 * 
 */
package com.truckking.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.truckking.model.User;

/**
 * @author karuppusamy
 * @version 1.0
 *
 */

@Repository
public interface UserRepository extends CrudRepository<User, String> {

	@Modifying(clearAutomatically = true)
	@Query("UPDATE User U SET U.approved_by = :approvedUser WHERE U.userName = :userName ")
	public int setUserApproved(@Param("userName") String userName, @Param("approvedUser") String approvedUser)
			throws Exception;

}
