package com.up.info.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/index")
public class IndexController {

	private static final Logger logger = Logger.getLogger(IndexController.class);

	@RequestMapping("")
	public ModelAndView index(HttpServletRequest req, HttpServletResponse resp) {
		if (logger.isInfoEnabled()) {
			logger.info("default request.");
		}
		return new ModelAndView("index");
	}

}
