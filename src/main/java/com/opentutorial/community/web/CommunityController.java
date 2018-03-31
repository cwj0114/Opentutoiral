package com.opentutorial.community.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.opentutorial.community.service.CommunityService;

@Controller
public class CommunityController {
	
	private CommunityService communityService;
	
	public void setCommunityService(CommunityService communityService) {
		this.communityService = communityService;
	}
	
	@RequestMapping("/")
	public String viewRegistPage() {
		return "community/main";
	}
	
	@RequestMapping("/write")
	public String viewWritePage() {
		return "community/write";
	}
	
}
