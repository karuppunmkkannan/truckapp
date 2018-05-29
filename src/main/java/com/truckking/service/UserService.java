package com.truckking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truckking.dao.UserDAO;
import com.truckking.model.User;
import com.truckking.model.UserType;

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

	public List<User> getUserLists() throws Exception {
		return userDAO.getUserLists();
	}

	public List<UserType> getUserTypeLists() throws Exception {
		return (List<UserType>) userDAO.getUserTypeLists();
	}

	public User insertUser(User user) throws Exception {
		return userDAO.insertUser(user);
	}

}
