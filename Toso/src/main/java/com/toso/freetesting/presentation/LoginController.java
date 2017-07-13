package com.toso.freetesting.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class LoginController {


	
@RequestMapping("/")
public String home(){
	return "redirect:/index";
}
@RequestMapping("/index")
public String index(){
	return "index";
}

@RequestMapping("/signin")
public String signin(){
	return "signin";
}
@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup(Model model) {
		
		return "signup";
	}
	
}
