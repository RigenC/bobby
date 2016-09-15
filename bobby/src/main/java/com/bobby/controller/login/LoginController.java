package com.bobby.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("login")
	public ModelAndView login(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("login/login");
		mv.addObject("login", true);
		return mv;
	}
	@RequestMapping(value="logincheck",method=RequestMethod.POST)
	@ResponseBody
	public String loginCheck(){
		return "";
	}
	
}
