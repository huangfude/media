package com.spring.mybatis.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/editor")
public class EditorController {

	protected Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/save")
	public String save(String content){
		
		logger.info("保存成功:"+content);
		
		return "../index";
	}
	
}
