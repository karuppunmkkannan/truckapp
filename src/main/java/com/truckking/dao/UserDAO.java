/**
 * 
 */
package com.truckking.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truckking.model.TBid;
import com.truckking.model.TJob;
import com.truckking.model.TJobOrderDeatils;
import com.truckking.model.User;
import com.truckking.model.UserType;

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
	private TBidRepository tBidRepository;

	@Autowired
	private TJobRepository tJobRepository;

	@Autowired
	private TJobOrderDetailsRepository tJobOrderDetailsRepository;

	@Autowired
	private UserTypeRepository userTypeRepository;

	public TBid insertTBid(TBid tBid) throws Exception {
		return tBidRepository.save(tBid);
	}

	public TJob insertTJob(TJob job) throws Exception {
		return tJobRepository.save(job);
	}

	public TJobOrderDeatils insertTJobOrderDetails(TJobOrderDeatils jobOrderDeatils) throws Exception {
		return tJobOrderDetailsRepository.save(jobOrderDeatils);
	}

	public List<TJob> getTJobLists() throws Exception {
		return (List<TJob>) tJobRepository.findAll();
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

}
