package com.opentutorial.community.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CommunityController {
	
	@RequestMapping("/")
	public String viewRegistPage() {
		return "community/main";
	}
	
	@RequestMapping("/write")
	public String viewWritePage() {
		return "community/write";
	}
	
}
