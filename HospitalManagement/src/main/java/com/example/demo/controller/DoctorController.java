package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DocService;

@RestController
public class DoctorController {

	DocService ds = new DocService();
	
	@PostMapping("addDoctor")
   String addDoctor(@RequestBody Doctor d) {
		
			ds.saveDoctor(d);
	return "Doctor Added";
	}

	@GetMapping("getDoctor")
	Doctor getDoctor() {
		
		
		return  ds.getDoctor();

	}
}