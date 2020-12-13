package com.spring.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {


	@GetMapping(value = "/")
	@ResponseBody
	public String index() {
		
		
		return "index";
		
	}
	
	
}
