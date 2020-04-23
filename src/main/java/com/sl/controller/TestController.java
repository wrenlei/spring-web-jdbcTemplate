package com.sl.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sl.service.TestService;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping("/save")
	@ResponseBody
	public void save(){
		//testService.save();
		testService.methodA();
	}
	
	@RequestMapping("/del")
	@ResponseBody
	public void del() throws Exception {
		testService.del();
	}
	
	@RequestMapping("/get")
	@ResponseBody
	public String get(){
		String str= "...";
		List<Map<String, Object>> list = testService.get();
		for(Map<String, Object> map : list) {
			str = map.get("name").toString();
		}
		return str;
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public void update() throws Exception {
		testService.update();
	}
}
