package com.up.info.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.up.info.entity.User;
import com.up.info.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	IUserService userService;
	
	@RequestMapping("query")
	public ModelAndView query(HttpServletRequest req) {
		ModelAndView mv = new ModelAndView("succ");
		User user = userService.queryById(1);
		mv.addObject("user", user);
		return mv;
	}
}
