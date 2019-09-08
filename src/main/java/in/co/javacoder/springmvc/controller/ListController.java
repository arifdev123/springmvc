package in.co.javacoder.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.co.javacoder.springmvc.dto.Employee;

@Controller
public class ListController {
	
	@RequestMapping("/getList")
	ModelAndView sendObject() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");
		
		Employee employee1 = new Employee();
		employee1.setId(1);
		employee1.setName("Arif");
		employee1.setSalary(20000);
		
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Anees");
		employee2.setSalary(30000);
		
		Employee employee3 = new Employee();
		employee3.setId(3);
		employee3.setName("Abdhiya");
		employee3.setSalary(40000);
		
		List<Employee> list = new ArrayList<>();
		
		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		
		modelAndView.addObject("list" , list);
		
		return modelAndView;
	}
}
