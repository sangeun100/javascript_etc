package com.multi.contromller;

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
		if(s.equals("id01")) {
			data = "Gold";
		}else if(s.equals("id07")) {
			data = "Silver";
		}else if(s.equals("id11")) {
			data = "Bronze";
		} /*
			 * else { data = "밥에 관심"; }
			 */
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
