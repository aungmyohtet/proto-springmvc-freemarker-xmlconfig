package com.amh.springmvc.sample.controllers;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

 
@Controller
public class HelloController {
 
	@RequestMapping("/hello")
	public String helloWorld(Model model) {
		model.addAttribute("greeting", "Hello there");
		return  "hello";
	}
}