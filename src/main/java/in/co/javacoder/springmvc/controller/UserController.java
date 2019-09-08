package in.co.javacoder.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import in.co.javacoder.springmvc.dto.User;

@Controller
public class UserController {
	
	@RequestMapping("/registartionPage")
	ModelAndView showRegPage() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("regUser");
		return modelAndView;
	}
	
	
	
	@RequestMapping(value="/registerUser" , method=RequestMethod.POST)
	ModelAndView registerUser(@ModelAttribute("user") User user) {
		System.out.println(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", user);
		modelAndView.setViewName("regResult");
		return modelAndView;
	}
	
}
