package com.opentutorial.community.service;

import com.opentutorial.community.dao.CommunityDao;

public class CommunityServiceImpl implements CommunityService {
	
	private CommunityDao communityDao;
	
	public void setCommunityDao(CommunityDao communityDao) {
		this.communityDao = communityDao;
	}
	
}
