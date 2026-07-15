package com.coforge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.coforge.entities.Customer;
import com.coforge.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	
	@RequestMapping("/customers")
	public List<Customer> getAllCustomers(){
		return  service.getAllCustomers();
	}

}
