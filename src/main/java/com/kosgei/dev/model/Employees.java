package com.kosgei.dev.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Employees{
	
	public String name;
	
	
	public String age;
	

	public String location;
	
	
	public String email;
	
	@Override
	public String toString() {
		
		return "EMPLOYEE : name="+name+" age = "+age+" location = "+location+" email = "+email+" ...OK";
	}
	
	
	
}
