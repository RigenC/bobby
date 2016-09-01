package com.bobby.controller.demo;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.bobby.db.imp.MemberMapper;
import com.bobby.entity.Member;
import com.bobby.service.member.imp.IMemberService;
@Controller
public class SkipContrller {
	@Resource
	private IMemberService MemberServiceClient;
	@Resource
	private MemberMapper memberDB;
	@RequestMapping("test")
	public ModelAndView test(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("test");
		System.out.println("ok");
		return mv;
	}
}
