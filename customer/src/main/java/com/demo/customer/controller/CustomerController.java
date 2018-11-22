package com.demo.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.customer.bean.Customer;
import com.fasterxml.jackson.annotation.ObjectIdGenerators.UUIDGenerator;

@RestController
@RequestMapping("/customer/")
public class CustomerController {

	@Autowired
	private UUIDGenerator UUIDGenerator;
	
	@GetMapping("{id}")
	@ResponseBody
	public Customer get(@PathVariable String id) {
		return new Customer("Test Customer", UUIDGenerator.generateId(id));
	}
}
