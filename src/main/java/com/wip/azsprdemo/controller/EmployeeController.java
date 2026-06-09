package com.wip.azsprdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("empl")
public class EmployeeController {
	@GetMapping
	public String sayHello() {
		return "Hello!!! How Are You?, I'm Fine";
	}

}
