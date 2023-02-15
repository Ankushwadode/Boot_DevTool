package com.devtool.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testController {
	
	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		int a=5;
		int b=1;
		int c=1;
		return "sum is: "+(a+b+c);
	}
}
