package com.multi.contromller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@RequestMapping("/member")
	public String member(Model m) {
		m.addAttribute("center", "member/center");
		m.addAttribute("left", "member/left");
		return "main";
	}
	@RequestMapping("/member1")
	public String member1(Model m) {
		m.addAttribute("center", "member/member1");
		m.addAttribute("left", "member/left");
		return "main";
	}
	@RequestMapping("/member2")
	public String member2(Model m) {
		m.addAttribute("center", "member/member2");
		m.addAttribute("left", "member/left");
		return "main";
	}
}
