package com.opentutorial.member.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.opentutorial.member.constants.Member;
import com.opentutorial.member.service.MemberService;
import com.opentutorial.member.vo.MemberVO;

@Controller
public class MemberController {

	private MemberService memberService;

	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String viewLoginPage(HttpSession session) {
		if ( session.getAttribute(Member.USER) != null ) {
			return "redirect:/";
		}
		return "member/login";
	} 
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public String doLoginAction(@ModelAttribute("loginForm")@Valid MemberVO memberVO, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		
		MemberVO loginMember =  memberService.readMember(memberVO);
			
		if( loginMember != null ) {
			session.setAttribute(Member.USER, loginMember);
			return "redirect:/";
		}
		return "redirect:/login";	
	}	
	
	@RequestMapping("/logout")
	public String doLogoutAction(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}
	
	@RequestMapping(value= "/regist", method = RequestMethod.GET)
	public String viewRegistPage() {
		return "member/regist";
	}
	
	@RequestMapping(value = "/regist", method = RequestMethod.POST)
	public ModelAndView doRegistAction(@ModelAttribute("registForm") @Valid MemberVO memberVO) {
		
		if ( memberService.createMember(memberVO)) {
			return new ModelAndView("redirect:/login");
		}
		return new ModelAndView("redirect:/regist");
	}
	
	
	
	
	
	
	
	
	
	

}
