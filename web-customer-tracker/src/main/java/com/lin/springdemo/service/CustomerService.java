package com.lin.springdemo.service;

import java.util.List;

import com.lin.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

}
