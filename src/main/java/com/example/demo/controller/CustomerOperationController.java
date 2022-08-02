package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerOperationController {
	
	@GetMapping("/display")
	public String displayData() {
		return "Customer info will be displayed here.. Welcome to call center";
	}

}