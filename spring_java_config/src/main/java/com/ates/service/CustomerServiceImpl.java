package com.ates.service;

import com.ates.repository.CustomerRepository;
import com.ates.repository.CustomerRepositoryImpl;
import com.ates.model.Customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("customerService")
@Scope("singleton")
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;/* = new CustomerRepositoryImpl() ;*/
	

	public CustomerServiceImpl() {
		
	}
	/* if we use autowired annotations below code is not neccesary
	public CustomerServiceImpl() {
	
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	*/
	
	/*@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("onstructor injection / xml based");
		this.customerRepository = customerRepository;
	}
	*/
 
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("constructor injection / java config based");
		this.customerRepository = customerRepository;
	}

	
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("setter injection" );
		
		this.customerRepository = customerRepository;
	}


	@Override
	public List<Customer> listCustomer(){
		
		return customerRepository.listCustomer();
		
	}

	/* if we use autowired annotations below code is not neccesary
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	*/

}
