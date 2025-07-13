package com.example.demo.service;

import com.example.demo.entity.Doctor;

public class DocService{

	
public	String saveDoctor(Doctor d)
	
	{
		
		
		if(d.getAddrees().equals("Pune"))		
			
			
		
		{
			//logic
			return "Doctor addd";
		}
		
		return  "We want doctor from pune ";
	}

public Doctor getDoctor()
{
	
	
	//logic
	
	Doctor d = new Doctor();
	    d.setdId(1);
		d.setAddrees("Pune");
		d.setName("John");
		d.setEmail("John@gmail.com");
		d.setSpl("Nuro");	
	   
		
		return d;
	
}	


	

	
}	

	