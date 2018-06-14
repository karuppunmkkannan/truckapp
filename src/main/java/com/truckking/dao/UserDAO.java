/**
 * 
 */
package com.truckking.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.truckking.model.TBidDetails;
import com.truckking.model.TJob;
import com.truckking.model.TJobOrderDeatils;
import com.truckking.model.User;
import com.truckking.model.UserType;
import com.truckking.utility.Utility;

/**
 * @author Altrocks
 * @version 1.0
 *
 */

@Service("userDAO")
public class UserDAO {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private TBidDetailsRepository tBidRepository;

	@Autowired
	private TJobRepository tJobRepository;

	@Autowired
	private TJobOrderDetailsRepository tJobOrderDetailsRepository;

	@Autowired
	private UserTypeRepository userTypeRepository;

	public TBidDetails insertTBidDetails(TBidDetails tBid) throws Exception {
		return tBidRepository.save(tBid);
	}

	public TJob insertTJob(TJob job) throws Exception {
		return tJobRepository.save(job);
	}

	public TJobOrderDeatils insertTJobOrderDetails(TJobOrderDeatils jobOrderDeatils) throws Exception {
		return tJobOrderDetailsRepository.save(jobOrderDeatils);
	}

	public List<TJob> getAllPendingJobs() throws Exception {
		return (List<TJob>) tJobRepository.getAllPendingJobs(Utility.UserTypePending);
	}

	public List<TJob> getAllPendingJobs(String userName, String status) throws Exception {
		return (List<TJob>) tJobRepository.getAllPendingJobs(userName, status);
	}
	
	public List<TBidDetails> getTBidDetailsByUser(String userName, String status) throws Exception {
		return (List<TBidDetails>) tBidRepository.getTBidDetailsByUser(userName, status);
	}

	public List<User> getUserLists() throws Exception {
		return (List<User>) userRepo.findAll();
	}

	public List<UserType> getUserTypeLists() throws Exception {
		return (List<UserType>) userTypeRepository.findAll();
	}

	public User insertUser(User user) throws Exception {
		return userRepo.save(user);
	}

	public User getUser(String userName) throws Exception {
		return userRepo.findOne(userName);
	}

	@Transactional(propagation=Propagation.REQUIRED)
	public int setUserApproved(String userName, String approvedUser) throws Exception {
		return userRepo.setUserApproved(userName, approvedUser);
	}
	
}
