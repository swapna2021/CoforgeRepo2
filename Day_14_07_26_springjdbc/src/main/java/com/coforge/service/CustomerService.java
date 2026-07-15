package com.coforge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.CustomerDao;
import com.coforge.entities.Customer;

@Service
public class CustomerService {

	@Autowired
	CustomerDao dao;
	
	public List<Customer> getAllCustomers() {
		
		return dao.getAllCustomers();
	}

}
