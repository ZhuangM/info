package com.up.info.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/index")
public class DefaultController {

	@RequestMapping(value = "")
	public String defaultMethod() {
		return "index.html";
	}
	
}
