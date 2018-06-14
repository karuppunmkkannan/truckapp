package com.truckking.truckapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.gson.Gson;
import com.truckking.model.TBidDetails;
import com.truckking.model.TJob;
import com.truckking.model.TJobOrderDeatils;
import com.truckking.model.TStatus;
import com.truckking.model.User;
import com.truckking.model.UserType;

@RunWith(SpringJUnit4ClassRunner.class)
public class TruckkingApplicationTests {

	Gson gson = new Gson();

	@Test
	public void contextLoads() {
		try {

			User user = new User();
			user.setAddress("nmk");
			user.setApproved_by("ok");
			user.setEmail_id("mk");
			user.setGstn_no("10");
			user.setName("kk");
			user.setPassword("kkk");
			user.setUserName("lll");
			user.setMobileNumer("1212121212");

			UserType userType = new UserType();
			userType.setType("DRIVER");

			TStatus status = new TStatus();
			status.setStatus("PENDING");

			user.setUserType(userType);

			user.setStatus(status);

			System.out.println(gson.toJson(user));

			TJob tJob = new TJob();
			tJob.setDestination("mk");
			tJob.setExpected_delivery_date("2018-02-02");
			tJob.setPickup_location("oo");
			tJob.setPrice("5000");
			tJob.setWeight("10");
			tJob.setType_ofmaterial("ll");
			tJob.setStatus(status);
			User user2 = new User();
			user.setUserName("1");
			tJob.setUser(user2);

			System.out.println(gson.toJson(tJob));

			TBidDetails tBidDetails = new TBidDetails();
			tBidDetails.setStatus(status);
			tBidDetails.setType("kjnkjn");
			tBidDetails.setBid_amount("4000");
			TJob tJobid = new TJob();
			tJobid.setId(1L);
			tBidDetails.setTJobid(tJobid);
			User user3 = new User();
			user3.setUserName("1");
			tBidDetails.setTransporter(user3);

			System.out.println(gson.toJson(tBidDetails));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
