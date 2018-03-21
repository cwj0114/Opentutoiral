package com.opentutorial.member.service;

import com.opentutorial.member.vo.MemberVO;

public interface MemberService {
	
	public boolean createMember(MemberVO member);
	public MemberVO readMember(MemberVO memberVO);
	
}
