package com.kosgei.dev.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.kosgei.dev.model.Employees;

@Service
public class EmployeesServiceImplementation implements EmployeesService {
	
	private static List<Employees> list = new ArrayList<>();

	static {
		Employees e = new Employees();
		e.name = "Kosgei Victor";
		e.age = "24";
		e.email = "victorkosgei254@gmail.com";
		e.location = "Nairobi, Kenya";
		list.add(e);
		
		Employees e1 = new Employees();
		e1.name = "Kosgei Victor";
		e1.age = "24";
		e1.email = "victorkosgei254@gmail.com";
		e1.location = "Nairobi, Kenya";
		list.add(e1);
	}
	
	@Override
	public List<Employees> getEmployees() {
		// TODO Auto-generated method stub
		return list;
	}

}
