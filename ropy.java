package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ropy implements pyservice {
@Override
 public String processPayment()  {
        // Simulate payment processing logic
        String paymentDetails = "rupy : Amount: $100000, Currency: USD, Status: Success";
        System.out.println("Processing payment..." + paymentDetails);
        return "Payment processed successfully with details: " + paymentDetails;
    }
}
