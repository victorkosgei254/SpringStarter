package com.kosgei.dev.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.kosgei.dev.service.EmployeesService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeesService eService;
	
	@Value("${app.name}")
	private String aboutService;
	
	public String getAboutService() {
		return this.aboutService;
	}
	
//	When user sends  request, the request is mapped here 
	
//	@RequestMapping(value="/employees", method=RequestMethod.GET)
	@GetMapping("/employees")
	public List<Employees>  getEmployees() {
		return eService.getEmployees();
		
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
