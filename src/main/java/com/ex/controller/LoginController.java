package com.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
//@RequestMapping("/")
public class LoginController {
	
	@GetMapping("/login")
	public String login() {
		return "exa_login";
	}
}
