package com.truckking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truckking.dao.UserDAO;

/**
 * 
 * @author Altrocks
 * @version 1.0
 *
 */

@Service("userService")
public class UserService {

	@Autowired
	private UserDAO userDAO;

}
