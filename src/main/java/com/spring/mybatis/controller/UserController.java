package com.spring.mybatis.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.mybatis.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	
	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/loginSuccess")
	public String loginSuccess(){
		
		logger.info("登录成功");
		
		return "../wxeditor/index";
	}

	@RequestMapping("/loginFailure")
	public String loginFailure(){
		logger.info("登录失败");
		
		return "../index";
	}
	
}
