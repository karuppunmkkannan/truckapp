package com.truckking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.truckking.dao.UserDAO;
import com.truckking.model.TBidDetails;
import com.truckking.model.TJob;
import com.truckking.model.TJobOrderDeatils;
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

	public User getUser(String userName) throws Exception {
		return userDAO.getUser(userName);
	}

	public TBidDetails insertTBidDetails(TBidDetails tBid) throws Exception {
		return userDAO.insertTBidDetails(tBid);
	}

	public TJob insertTJob(TJob job) throws Exception {
		return userDAO.insertTJob(job);
	}

	public TJobOrderDeatils insertTJobOrderDetails(TJobOrderDeatils jobOrderDeatils) throws Exception {
		return userDAO.insertTJobOrderDetails(jobOrderDeatils);
	}

	public List<TJob> getAllPendingJobs() throws Exception {
		return (List<TJob>) userDAO.getAllPendingJobs();
	}

	public List<TJob> getAllPendingJobs(String userName, String status) throws Exception {
		return (List<TJob>) userDAO.getAllPendingJobs(userName, status);
	}

	public List<TBidDetails> getTBidDetailsByUser(String userName, String status) throws Exception {
		return (List<TBidDetails>) userDAO.getTBidDetailsByUser(userName, status);
	}

	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public int setUserApproved(String userName, String approvedUser) throws Exception {
		return userDAO.setUserApproved(userName, approvedUser);
	}

}
