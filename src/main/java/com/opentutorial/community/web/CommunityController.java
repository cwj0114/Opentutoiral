package com.opentutorial.community.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommunityController {

	@RequestMapping("/")
	public String viewMainPage() {
		return "community/main";
	}
	
}
