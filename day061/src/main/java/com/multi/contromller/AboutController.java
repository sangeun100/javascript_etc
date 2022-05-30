package com.multi.contromller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {
	
	@RequestMapping("/about")
	public String about(Model m) {
		m.addAttribute("center","about/center");
		m.addAttribute("left","about/left");
		return "main";
	}
	@RequestMapping("/about1")
	public String about1(Model m) {
		m.addAttribute("center","about/about1");
		m.addAttribute("left","about/left");
		return "main";
	}
	@RequestMapping("/about2")
	public String about2(Model m) {
		m.addAttribute("center","about/about2");
		m.addAttribute("left","about/left");
		return "main";
	}
	@RequestMapping("/about3")
	public String about3(Model m) {
		m.addAttribute("center","about/about3");
		m.addAttribute("left","about/left");
		return "main";
	}
	@RequestMapping("/about4")
	public String about4(Model m) {
		m.addAttribute("center","about/about4");
		m.addAttribute("left","about/left");
		return "main";
	}
	@RequestMapping("/about5")
	public String about5(Model m) {
		m.addAttribute("center","about/about5");
		m.addAttribute("left","about/left");
		return "main";
	}
	/*
	 * @RequestMapping("/food1") 
	 * public String food1(Model m) {
	 * m.addAttribute("center","food/food1"); 
	 * m.addAttribute("left","food/left");
	 * return "main"; }
	 * 
	 * @RequestMapping("/food2") public String food2(Model m) {
	 * m.addAttribute("center","food/food2"); m.addAttribute("left","food/left");
	 * return "main"; }
	 * 
	 * @RequestMapping("/food3") public String food3(Model m) {
	 * m.addAttribute("center","food/food3"); m.addAttribute("left","food/left");
	 * return "main"; }
	 */

}
