package com.truckking.truckapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.gson.Gson;
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
			userType.setId(1l);

			user.setUserType(userType);

			System.out.println(gson.toJson(user));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
