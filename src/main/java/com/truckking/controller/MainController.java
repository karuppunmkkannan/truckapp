package com.truckking.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

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
		logger.info("Welcome page");
		return "index";
	}

}
