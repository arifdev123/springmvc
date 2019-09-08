package in.co.javacoder.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QueryController {

	@RequestMapping("/query")
	ModelAndView sendQuery(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam(value= "sal", required= false, defaultValue= "0.0") double salary) {
		System.out.println("id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Salary : " + salary);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");
		return modelAndView;
	}

}
