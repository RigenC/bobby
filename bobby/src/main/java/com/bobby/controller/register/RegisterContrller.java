package com.bobby.controller.register;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterContrller {
	@RequestMapping("register")
	public String register(){
		return "register/register";
	}
}
