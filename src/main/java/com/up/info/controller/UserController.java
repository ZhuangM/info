package com.up.info.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.up.info.entity.User;
import com.up.info.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private static final Logger logger = Logger.getLogger(UserController.class);

	@Resource
	IUserService userService;

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String role = req.getParameter("role");
		// TODO
		System.out.println(username + " | " + password + " | " + role);
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setRole(role);
		boolean verifySuccess = userService.verifyIdentity(user);
		ModelAndView mav = new ModelAndView();
		if (verifySuccess) {
			mav.setViewName("jsp/succ");
		} else {
			mav.setViewName("jsp/error");
		}
		return mav;
	}

	@RequestMapping("query")
	public ModelAndView query(HttpServletRequest req) {
		ModelAndView mv = new ModelAndView("jsp/succ");
		User user = userService.queryById(1);
		mv.addObject("user", user);
		return mv;
	}

	@RequestMapping(value = "queryUsers", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> queryUsers() {
		Map<String, Object> resp = new HashMap<String, Object>();
		List<User> users = new ArrayList<User>();
		for (int i = 0; i < 10; i++) {
			users.add(userService.queryById(i));
		}
		resp.put("users", users);
		resp.put("respCode", "00");
		return resp;
	}

	@RequestMapping(value = "printFile")
	@ResponseBody
	public Map<String, Object> printFile(HttpServletRequest req) {
		String fileName = req.getParameter("fileName");
		logger.info("receive file: " + fileName);
		Map<String, Object> resp = new HashMap<String, Object>();
		resp.put("fileName", fileName);
		resp.put("respCode", "00");
		return resp;
	}
}
