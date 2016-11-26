package com.up.info.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
	
	@Resource
	IUserService userService;
	
	@RequestMapping("query")
	public ModelAndView query(HttpServletRequest req) {
		ModelAndView mv = new ModelAndView("succ");
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
}
