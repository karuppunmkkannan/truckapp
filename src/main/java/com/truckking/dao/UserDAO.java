/**
 * 
 */
package com.truckking.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Altrocks
 * @version 1.0
 *
 */

@Service("userDAO")
public class UserDAO {

	@Autowired
	private UserRepository userRepo;

}
