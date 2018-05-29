package com.truckking.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

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

	@RequestMapping("/")
	String ping() {
		logger.info("Server working ping...");
		return "Server working... ping...";
	}

	@RequestMapping("/index")
	String index() {
		try {

			logger.info("Welcome page");

		} catch (Exception e) {
			logger.info("Exception in index", e);
		}

		return "index";
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
		} catch (Exception e) {
			logger.error("Exception in insertUser", e);
			modelMap.addAttribute("status", "error");
			modelMap.addAttribute("msg", e.getMessage());
		}
		return modelMap;
	}

}
