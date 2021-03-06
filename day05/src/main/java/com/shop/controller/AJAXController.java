package com.shop.controller;

import java.io.PrintWriter;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class AJAXController { 

	@RequestMapping("/gettime")
	//@ResponseBody  데이터를 바로 전송하겠따 그러나 여기서 불필요
	public Object gettime() {
		Date d = new Date();
		return "서버시간:"+d.toString();	
	}
	
	@RequestMapping("/checkid")
	public Object checkid(String id) {
		String result = "";
		if(id.equals("aaaa") || id.equals("bbbb") || id.equals("cccc")) {
			result = "0";
		}else {
			result = "1";
		}
		return result;
		}

	@RequestMapping("/search")
	public Object search(String s) {
		PrintWriter out = null;
		String data = "";
		if(s.equals("a")) {
			data = "주식에 관심";
		}else if(s.equals("b")) {
			data = "햄버거에 관심";
		}else {
			data = "밥에 관심";
		}
		return data;
	}
	@RequestMapping("/getdata")
	public Object getdata() {
		//[{},{},{},...] 배열이 먼저 그다음 제이슨 옵젝
		//Json 이런식의 정보를 만들어서 뿌림 aaa에 json 형태로 데이터를 만들어서 뿌림
		JSONArray ja = new JSONArray();
		
		for (int i = 0; i < 6; i++) {
			JSONObject jo  = new JSONObject();
			jo.put("id", "id0"+i);
			jo.put("name", "james"+i);
			Random r = new Random();
			int a = r.nextInt(50)+1;
			jo.put("age", a);
			ja.add(jo);
		}
		return ja;
	}
	@RequestMapping("/getmarkers")
	public Object getmarkers(String loc) {
		JSONArray ja = new JSONArray();
		if (loc.equals("s")) {
			JSONObject jo1 = new JSONObject();	
			jo1.put("content", "<div>카카오1</div>");
			jo1.put("lat", "37.55041692365908");
			jo1.put("lng", "126.91037178013711");
			jo1.put("target", "js01");
			ja.add(jo1);
			JSONObject jo2 = new JSONObject();
			jo2.put("content", "<div>카카오2</div>");
			jo2.put("lat", "37.56041692365908");
			jo2.put("lng", "126.92037178013711");
			jo2.put("target", "js02");
			ja.add(jo2);
			JSONObject jo3 = new JSONObject();
			jo3.put("content", "<div>카카오3</div>");
			jo3.put("lat", "37.57041692365908");
			jo3.put("lng", "126.93037178013711");
			jo3.put("target", "js03");
			ja.add(jo3);
		}else if (loc.equals("b")) {
			JSONObject jo1 = new JSONObject();	
			jo1.put("content", "<div>카카오1</div>");
			jo1.put("lat", "35.17642453774257");
			jo1.put("lng", "129.16669784099807");
			jo1.put("target", "js01");
			ja.add(jo1);
			JSONObject jo2 = new JSONObject();
			jo2.put("content", "<div>카카오2</div>");
			jo2.put("lat", "35.18642453774257");
			jo2.put("lng", "129.17669784099807");
			jo2.put("target", "js02");
			ja.add(jo2);
			JSONObject jo3 = new JSONObject();
			jo3.put("content", "<div>카카오3</div>");
			jo3.put("lat", "35.19642453774257");
			jo3.put("lng", "129.18669784099807");
			jo3.put("target", "js03");
			ja.add(jo3);
		}else if (loc.equals("g")) {
			JSONObject jo1 = new JSONObject();	
			jo1.put("content", "<div>카카오1</div>");
			jo1.put("lat", "35.16173425533525");
			jo1.put("lng", "126.88758871719189");
			jo1.put("target", "js01");
			ja.add(jo1);
			JSONObject jo2 = new JSONObject();
			jo2.put("content", "<div>카카오2</div>");
			jo2.put("lat", "35.17173425533525");
			jo2.put("lng", "126.87758871719189");
			jo2.put("target", "js02");
			ja.add(jo2);
			JSONObject jo3 = new JSONObject();
			jo3.put("content", "<div>카카오3</div>");
			jo3.put("lat", "35.18173425533525");
			jo3.put("lng", "126.86758871719189");
			jo3.put("target", "js03");
			ja.add(jo3);
		}
		
		return ja;
	}
	
	@RequestMapping("/getchart")
	public Object getchart() {
		JSONArray ja = new JSONArray();
		for (int i = 0; i <15; i++) {
			Random r = new Random();
			int data = r.nextInt(50)+1;
			ja.add(data);
		}
		return ja;		
	}
}
