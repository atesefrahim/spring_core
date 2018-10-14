package com.ates.repository;

import com.ates.model.Customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository("customerRepository")
//@Component also we can use @component bean
public class CustomerRepositoryImpl implements CustomerRepository {

	
	@Override
	public List<Customer> listCustomer(){
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		customer.setFirstName("ibrahim");
		customer.setLastName("ates");
		customer.setId(1713);
		customers.add(customer);
		
		return customers;
		
	}
}
