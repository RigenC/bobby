package com.bobby.controller.register;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bobby.commons.service.member.IMemberService;

@Controller
public class RegisterContrller {
	@Resource
	private IMemberService MemberServiceClient;
	@RequestMapping("register")
	public ModelAndView register(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("register/register");
		mv.addObject("login", false);
		return mv;
	}
	@RequestMapping("registerAccount")
	public String registerAccount(){
		return "";
	}
	@RequestMapping("checkUserName")
	@ResponseBody
	public boolean checkUserName(@RequestParam String username){
		boolean result=MemberServiceClient.isUserName(username);
		return result;
	}
	
}
