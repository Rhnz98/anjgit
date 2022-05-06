package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("web")
	public String show() {
		return "register";
	}

}
