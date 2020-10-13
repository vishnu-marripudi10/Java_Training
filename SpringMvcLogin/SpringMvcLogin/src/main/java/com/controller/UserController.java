package com.controller;

import com.model.User;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@PostMapping(value = "/login")
	public ModelAndView loginFunction(@ModelAttribute User user) // using @ModelAttribute
	{
		System.out.println(user.getUserName());

		ModelAndView modelAndView = new ModelAndView("userSuccess");
		modelAndView.addObject("key2", user);
		return modelAndView;

	}

}
