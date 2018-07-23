package com.iotek.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/user")
@Controller
public class UserController {
	
	@RequestMapping("/jumpLogin")
	public String jumpLogin() {
		return "common/login";
	}

	@RequestMapping("/login")
	public String login(String name,String password) {
		String managerName = "admin";
		String managerPassword = "123";
		if(name.equals(managerName) && password.equals(managerPassword)) {
			return "manager/managerIndex";
		}else {
			return "user/userIndex";
		}
	}
}
