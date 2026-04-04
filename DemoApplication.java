package com.example.demo;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	private final pyservice pyservice ;
	public DemoApplication(pyservice pyservice) {
		this.pyservice = pyservice;
	}
	@Override
	public void run(String... args) throws Exception {
		// Add your application logic here
		String paymentResult = pyservice.processPayment();
		System.out.println(paymentResult);
	}

}
