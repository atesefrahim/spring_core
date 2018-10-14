package com.ates.main;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ates.repository.CustomerRepository;
import com.ates.repository.CustomerRepositoryImpl;
import com.ates.service.CustomerService;
import com.ates.service.CustomerServiceImpl;

public class Application {

	private static ApplicationContext appContext;

	public static void main(String[] args) {
		
		
		//CustomerService customerService = new CustomerServiceImpl();
		
		// xml based config
		//appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// java based config
		appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		CustomerService customerService = appContext.getBean("customerService", CustomerService.class);

		System.out.println(customerService.listCustomer());
	}

}
