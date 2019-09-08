package in.co.javacoder.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping("/hello")
	public ModelAndView hello() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("id", 1234);
		modelAndView.addObject("name", "Arif");
		modelAndView.addObject("salary", 10000);
		
		return modelAndView;

	}
	
	
	@RequestMapping("/object")
	public ModelAndView object() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		modelAndView.addObject("id", 1234);
		modelAndView.addObject("name", "Arif");
		modelAndView.addObject("salary", 10000);
		
		return modelAndView;

	}
}
