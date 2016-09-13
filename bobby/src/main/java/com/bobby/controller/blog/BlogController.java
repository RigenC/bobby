package com.bobby.controller.blog;

import java.io.File;
import java.io.IOException;

import org.markdown4j.Markdown4jProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bobby.redis.RedisService;

@Controller
public class BlogController {
	@Autowired RedisService redisService;
	@RequestMapping("blog")
	public ModelAndView blogSkip(){
		ModelAndView mv=new ModelAndView();
		mv.setViewName("article/blog");
		File file=new File("C:\\Users\\cailikun\\Desktop\\JQuery学习笔记(一)—JQuery选择器.md");
		Markdown4jProcessor mdprocessor= new Markdown4jProcessor();
		try {
			String html=mdprocessor.process(file);
			mv.addObject("blogcontent", html);
			mv.addObject("blogheader", "对账查询sql语句");
			System.out.println(html);
			redisService.save("test", "ok");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
}
