package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

//import org.springframework.stereotype.Component;

@Component // This annotation indicates that this class is a Spring component, 
// which allows Spring to automatically detect and manage it as a bean in the 
// application context. This means that Spring will create an instance of this 
// class and make it available for dependency injection wherever needed in the 
// application.
@ConditionalOnProperty(name = "payment.provider", havingValue = "stripe")
public class stripepayservice implements pyservice {
    @Override
    public String processPayment() {
        // Simulate payment processing logic
        String paymentDetails = "Amount: $100, Currency: USD, Status: Success";
        System.out.println("Processing payment..." + paymentDetails);
        return "Payment processed successfully with details: " + paymentDetails;
    }
 }
