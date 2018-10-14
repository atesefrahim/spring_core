package com.ates.main;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.ates.repository.CustomerRepository;
import com.ates.repository.CustomerRepositoryImpl;
import com.ates.service.CustomerService;
import com.ates.service.CustomerServiceImpl;

@Configuration
@ComponentScan("com.ates")
@PropertySource("app.properties")
public class AppConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcePlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	// below code is about setter injection of config
	/*
	@Bean(name="customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl service = new CustomerServiceImpl();
		//service.setCustomerRepository(getCustomerRepository());
		return service;
	}
	
	*/
	
	
	// Constructor injection of config
	/*@Bean(name="customerService")
	public CustomerService getCustomerService() {
		CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
		return service;
	}*/
	
	/*
	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new CustomerRepositoryImpl();
		
	}*/
}
