package com.example.SpringHTTPS.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	
	@RequestMapping(value = "demo",method = RequestMethod.GET)
	public String getDataByTable() {
		return "Spring with HTTPS";
	} 

}
