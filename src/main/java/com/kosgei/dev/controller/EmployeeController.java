package com.kosgei.dev.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
//	When user sends  request, the request is mapped here 
	
//	@RequestMapping(value="/employees", method=RequestMethod.GET)
	@GetMapping("/employees")
	public HashMap<String,String>  getEmployees() {
		HashMap<String,String> employees = new HashMap<String, String>();
		employees.put("name","Kosgei Victor Kipruto");
		employees.put("Age", "24");
		employees.put("role","Software Engineer");
		return employees;
		
	}
	
	
	@GetMapping("/employees/{name}")
	public String getEmployee(@PathVariable("name") String name) {
		System.out.println(name);
		return name;
	}

}
