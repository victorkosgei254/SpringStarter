package com.kosgei.dev.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kosgei.dev.model.Employees;

@RestController
public class EmployeeController {
	
	@Value("${app.name}")
	private String aboutService;
	
	public String getAboutService() {
		return this.aboutService;
	}
	
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
	
	@DeleteMapping("/employees")
	public String deleteEmployee(@RequestParam("name") String name) {
		
		return String.format("%s,User successfully deleted ::: OK", name);
		
	}
	
	//handler method
	@PostMapping("/employees")
	public Employees addEmployee(@RequestBody Employees employee) {
		System.out.println(employee.name);
		
		return  employee;
	}
	
	@PutMapping("/employees/{name}")
	public Employees updateEmployee(@PathVariable String name) {
		Employees employee = new Employees();
		employee.name = name;
		
		return employee;
	}
	
	@GetMapping("/about")
	public String aboutService() {
		return getAboutService();
	}

}
