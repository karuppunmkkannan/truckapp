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

	@RequestMapping(value = "/insertUser", method = RequestMethod.POST)
	public @ResponseBody ModelMap insertUser(@RequestBody User user) {
		ModelMap modelMap = new ModelMap();
		try {
			modelMap.addAttribute("user", userservice.insertUser(user));
			modelMap.addAttribute("status", "success");
		} catch (DataIntegrityViolationException e) {
			logger.error("User Already Exists");
			modelMap.addAttribute("status", "error");
			modelMap.addAttribute("msg", "User Already Exists");
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
