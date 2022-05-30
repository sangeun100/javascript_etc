package com.multi.contromller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoodsController {
	
	
	  @RequestMapping("/goods") 
	  public String goods(Model m) {
	  m.addAttribute("center","goods/center"); 
	  m.addAttribute("left","goods/left");
	  return "main"; }
	 
	
	
	  @RequestMapping("/goods1") 
	  public String goods1(Model m) {
	  m.addAttribute("center","goods/goods1"); 
	  m.addAttribute("left","goods/left");
	  return "main"; }
	  
	/*
	 * @RequestMapping("/food2") public String food2(Model m) {
	 * m.addAttribute("center","food/food2"); m.addAttribute("left","food/left");
	 * return "main"; }
	 * 
	 * @RequestMapping("/food3") public String food3(Model m) {
	 * m.addAttribute("center","food/food3"); m.addAttribute("left","food/left");
	 * return "main"; }
	 */
	 

}
