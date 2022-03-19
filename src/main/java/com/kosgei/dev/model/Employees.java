package com.kosgei.dev.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Employees{
	
	public String name;
	
	@JsonIgnore
	public String age;
	

	public String location;
	
	
	public String email;
	
	
	
	
}
