package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ajcontroller {
	
	@RequestMapping("/register_formimpl")
	public String register_formipml(Model m,String id, String pwd) {
	System.out.println(id+""+pwd);
	m.addAttribute("center","ajax/registerok");
	m.addAttribute("left","ajax/left");
		return "main";	
	}

	@RequestMapping("/register_form1impl")
	public String register_form1ipml(Model m, String name, String id, String pwd, String sel, String comment) {
	System.out.println(name+""+id+""+pwd+""+sel+""+comment);
	m.addAttribute("center","ajax/registerok");
	m.addAttribute("left","ajax/left");
		return "main";	
	}
	
	@RequestMapping("/ajax")
	public String ajax(Model m) {
		m.addAttribute("center","ajax/center");
		m.addAttribute("left","ajax/left");
		return "main";
	} 
	
	@RequestMapping("/aj01")
	public String ajax01(Model m) {
		m.addAttribute("center","ajax/aj01");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	
	@RequestMapping("/aj02")
	public String ajax02(Model m) {
		m.addAttribute("center","ajax/aj02");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj03")
	public String ajax03(Model m) {
		m.addAttribute("center","ajax/aj03");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj04")
	public String ajax04(Model m) {
		m.addAttribute("center","ajax/aj04");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj05")
	public String ajax05(Model m) {
		m.addAttribute("center","ajax/aj05");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj06")
	public String ajax06(Model m) {
		m.addAttribute("center","ajax/aj06");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj07")
	public String ajax07(Model m) {
		m.addAttribute("center","ajax/aj07");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj08")
	public String ajax08(Model m) {
		m.addAttribute("center","ajax/aj08");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj09")
	public String ajax09(Model m) {
		m.addAttribute("center","ajax/aj09");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj10")
	public String ajax10(Model m) {
		m.addAttribute("center","ajax/aj10");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj11")
	public String ajax11(Model m) {
		m.addAttribute("center","ajax/aj11");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj12")
	public String ajax12(Model m) {
		m.addAttribute("center","ajax/aj12");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	@RequestMapping("/aj13")
	public String ajax13(Model m) {
		m.addAttribute("center","ajax/aj13");
		m.addAttribute("left","ajax/left");
		return "main";
	}
	
}
