package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	//private stripepayservice stripePayService = new stripepayservice();// tight coupling becox it is 
	// dependent on the concrete implementation of the stripepayservice class. 
	// This makes it difficult to change the payment processing logic without 
	// modifying the DemoApplication class. -> for loose coupling we can use 
	// interfaces and dependency injection.(beans which handle it for us)

	/*using constructor injection to inject the dependency 
	private final stripepayservice stripePayService;

	public DemoApplication(stripepayservice stripePayService) {
		this.stripePayService = stripePayService;//bean injection by spring framework,
		//  it will automatically create an instance of stripepayservice and inject it 
		// into the DemoApplication class when it is created. This allows for loose 
		// coupling between the classes, as the DemoApplication class does not need to 
		// know about the specific implementation of the stripepayservice class.
	}*/
	// using @autowired annotation for field injection
	@Autowired
	private stripepayservice stripePayService;

	@Override
	public void run(String... args) throws Exception {
		// Add your application logic here
		String paymentResult = stripePayService.processPayment();
		System.out.println(paymentResult);
	}

}
