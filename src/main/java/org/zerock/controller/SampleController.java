package org.zerock.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;
import org.zerock.domain.TodoDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

//	@InitBinder
//	public void initBinder(WebDataBinder binder) {
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//		binder.registerCustomEditor(java.util.Date.class, new CustomDateEditor(dateFormat, false));
//	}
//	
	
	@RequestMapping("")
	public void basic() {
		log.info("=====basic=====");
	}
	
	@RequestMapping(value = "/basic", method = {RequestMethod.GET, RequestMethod.POST})
	public void basicGet() {
		log.info("=====basic get=====");
	}
	
	
	@GetMapping("/basicOnlyGet")
	public void basicOnlyGet() {
		log.info("=====basic only get=====");
	}
	
//	객체를 넣었을 때, 객체 속의 각 형에 맞게 자동으로 입력된다.
	@GetMapping
	public String ex01(SampleDTO dto) {
		log.info("===== "+dto+" =====");
		return "ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
		log.info("=====");
		log.info("name : "+name);
		log.info("age : "+age);
		log.info("=====");
		
		return "ex02";
	}
	
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids") ArrayList<String> ids) {
		log.info("=====");
		log.info("ids : "+ids);
		log.info("=====");
		return "ex02List";
	}
	
	@GetMapping("/ex02Array")
	public String ex02Array(@RequestParam("ids") String[] ids) {
		log.info("=====");
		log.info("array ids : "+Arrays.toString(ids));
		log.info("=====");
		return "ex02Array";
	}
	
	@GetMapping("/ex02Bean")
	public String ex02Bean(SampleDTOList list) {
		log.info("=====");
		log.info("list dtos : " + list);
		log.info("=====");
		return "ex02Bean";
	}
	
	@GetMapping("/ex03")
	public String ex03(TodoDTO todo) {
		log.info("=====");
		log.info("todo : "+ todo);
		log.info("=====");
		
		return "ex03";
	}
	
}
