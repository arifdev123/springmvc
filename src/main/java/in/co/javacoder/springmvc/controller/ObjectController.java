package in.co.javacoder.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.co.javacoder.springmvc.dto.Employee;

@Controller
public class ObjectController {
	
	@RequestMapping("/getObject")
	ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Arif");
		employee.setSalary(20000);
		modelAndView.addObject("emp" , employee);
		
		return modelAndView;
	}
}
