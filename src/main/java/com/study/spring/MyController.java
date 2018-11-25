package com.study.spring;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginPage() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String welcomePage(ModelMap model, User usr, @RequestParam String username, @RequestParam String password) {
		
	
		
		if (!(username.equalsIgnoreCase("krishna") && password.equalsIgnoreCase("krishna"))) {
			model.put("errorMessage", "Invalid credentials");
			return "login";
		}
		model.put("name", username);
		return "greeting";

	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String registerPage() {
		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerSuccessful(ModelMap model, 
			@Valid User user, BindingResult result,@RequestParam String userName) {
		
		model.put("name", userName);
		return "greeting";
	}

	@RequestMapping("/greeting")
	public String hello(Model model,
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		model.addAttribute("name", name);
		return "greeting";
	}
}
