package com.coforge.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coforge.entities.Customer;

@Repository
public class CustomerDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Customer> getAllCustomers() {
		
		String query="select * from customer";
		
		
		return null;
	}

}
