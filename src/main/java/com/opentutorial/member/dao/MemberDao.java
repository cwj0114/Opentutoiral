package com.opentutorial.member.dao;

import com.opentutorial.member.vo.MemberVO;

public interface MemberDao {

	public int insertMember(MemberVO memberVO);
	
	public MemberVO selectMember(MemberVO memberVO);
	
}
