package com.truckking.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.truckking.model.TBidDetails;
import com.truckking.model.TJob;
import com.truckking.model.User;
import com.truckking.service.UserService;

/**
 * 
 */

/**
 * @author karuppusamy
 * @version 1.0
 *
 */

@Controller
@CrossOrigin(origins = "*")
@SessionAttributes("truckking")
@RequestMapping("/")
public class MainController {

	private static final Logger logger = Logger.getLogger(MainController.class);

	@Autowired
	private UserService userservice;

	@RequestMapping(value = { "/login", "/" }, method = RequestMethod.GET)
	public @ResponseBody ModelAndView login() {

		ModelAndView model = new ModelAndView("login");
		logger.info("login page");

		return model;
	}

	@RequestMapping(value = { "dashboard" }, method = RequestMethod.GET)
	public @ResponseBody ModelAndView dashBoard() {

		ModelAndView model = new ModelAndView("dashboard");
		logger.info("dashboard page");

		return model;
	}

	@RequestMapping(value = "/getTJobLists", method = RequestMethod.POST)
	public @ResponseBody ModelMap getTJobLists() {
		ModelMap modelMap = new ModelMap();
		try {
			modelMap.addAttribute("getTJobLists", userservice.getAllPendingJobs());
			modelMap.addAttribute("status", "success");
		} catch (Exception e) {
			logger.error("Exception in getTJobLists", e);
			modelMap.addAttribute("status", "error");
			modelMap.addAttribute("msg", e.getMessage());
		}
		return modelMap;
	}

	@RequestMapping(value = "/getTJobListsByUser", method = RequestMethod.POST)
	public @ResponseBody ModelMap getTJobListsByUser(@RequestParam(value = "userName") String userName,
			@RequestParam(value = "status") String status) {
		ModelMap modelMap = new ModelMap();
		try {
			modelMap.addAttribute("getTJobListsByUser", userservice.getAllPendingJobs(userName, status));
			modelMap.addAttribute("status", "success");
		} catch (Exception e) {
			logger.error("Exception in getTJobListsByUser", e);
			modelMap.addAttribute("status", "error");
			modelMap.addAttribute("msg", e.getMessage());
		}
		return modelMap;
	}

	@RequestMapping(value = "/setUserApproved", method = RequestMethod.POST)
	public @ResponseBody ModelMap setUserApproved(@RequestParam(value = "userName") String userName,
			@RequestParam(value = "approvedUser") String approvedUser) {
		ModelMap modelMap = new ModelMap();
		try {
			if (userservice.setUserApproved(userName, approvedUser) > 0) {
				modelMap.addAttribute("status", "success");
			} else {
				modelMap.addAttribute("status", "Update failed");
			}
		} catch (Exception e) {
			logger.error("Exception in setUserApproved", e);
			modelMap.addAttribute("status", "error");
			modelMap.addAttribute("msg", e.getMessage());
		}
		return modelMap;
	}

	@RequestMapping(value = "/getTBidDetailsByUser", method = RequestMethod.POST)
	public @ResponseBody ModelMap getTBidDetailsByUser(@RequestParam(value = "userName") String userName,
			@RequestParam(value = "status") String status) {
		ModelMap modelMap = new ModelMap();
		try {
			modelMap.addAttribute("tBidDetails", userservice.getTBidDetailsByUser(userName, status));
			modelMap.addAttribute("status", "success");
		} catch (Exception e) {
			logger.error("Exception in getTBidDetailsByUser", e);
			modelMap.addAttribute("status", "error");
			modelMap.addAttribute("msg", e.getMessage());
		}
		return modelMap;
	}

	@RequestMapping(value = "/getUserTypeLists", method = RequestMethod.POST)
	public @ResponseBody ModelMap getUserTypeLists() {
		ModelMap modelMap = new ModelMap();
		try {
			modelMap.addAttribute("userTypeLists", userservice.getUserTypeLists());
			modelMap.addAttribute("status", "success");
		} catch (Exception e) {
			logger.error("Exception in getUserTypeLists", e);
			modelMap.addAttribute("status", "error");
			modelMap.addAttribute("msg", e.getMessage());
		}
		return modelMap;
	}

	@RequestMapping(value = "/insertTJob", method = RequestMethod.POST)
	public @ResponseBody ModelMap insertTJob(@RequestBody TJob tJob) {
		ModelMap modelMap = new ModelMap();
		try {
			modelMap.addAttribute("user", userservice.insertTJob(tJob));
			modelMap.addAttribute("status", "success");
		} catch (Exception e) {
			logger.error("Exception in insertTJob", e);
			modelMap.addAttribute("status", "error");
			modelMap.addAttribute("msg", e.getMessage());
		}
		return modelMap;
	}

	@RequestMapping(value = "/insertTBidDetails", method = RequestMethod.POST)
	public @ResponseBody ModelMap insertTBidDetails(@RequestBody TBidDetails tBid) {
		ModelMap modelMap = new ModelMap();
		try {
			modelMap.addAttribute("user", userservice.insertTBidDetails(tBid));
			modelMap.addAttribute("status", "success");
		} catch (Exception e) {
			logger.error("Exception in insertTBid", e);
			modelMap.addAttribute("status", "error");
			modelMap.addAttribute("msg", e.getMessage());
		}
		return modelMap;
	}

	@RequestMapping(value = "/insertUser", method = RequestMethod.POST)
	public @ResponseBody ModelMap insertUser(@RequestBody User user) {
		ModelMap modelMap = new ModelMap();
		User user1 = new User();
		try {
			user1 = userservice.insertUser(user);
			modelMap.addAttribute("user", user1);
			modelMap.addAttribute("msg", "success");
		} catch (DataIntegrityViolationException e) {
			logger.error("User Already Exists", e);
			modelMap.addAttribute("msg", "User Already Exists");
			modelMap.addAttribute("user", user1);
		} catch (Exception e) {
			logger.error("Exception in insertUser", e);
			modelMap.addAttribute("status", "error");
			modelMap.addAttribute("msg", e.getMessage());
		}
		return modelMap;
	}

	@RequestMapping(value = "/findUser", method = RequestMethod.POST)
	public @ResponseBody ModelMap findUser(@RequestParam(value = "userName") String userName,
			@RequestParam(value = "passWord") String passWord) {

		ModelMap modelMap = new ModelMap();
		try {
			User user = userservice.getUser(userName);

			if (user != null && user.getUserName().equalsIgnoreCase(userName)) {
				if (user.getPassword().equalsIgnoreCase(passWord)) {
					modelMap.addAttribute("user", user);
					modelMap.addAttribute("msg", "success");
				} else {
					modelMap.addAttribute("msg", "Password is incorrect");
				}
			} else {
				modelMap.addAttribute("msg", "User not found");
			}
			modelMap.addAttribute("status", "success");
		} catch (Exception e) {
			logger.error("Exception in findUser", e);
			modelMap.addAttribute("status", "error");
			modelMap.addAttribute("msg", e.getMessage());
		}
		return modelMap;
	}

}
