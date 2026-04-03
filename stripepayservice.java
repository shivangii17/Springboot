package com.example.demo;

import org.springframework.stereotype.Component;

@Component // This a
public class stripepayservice {
    public String processPayment() {
        // Simulate payment processing logic
        String paymentDetails = "Amount: $100, Currency: USD, Status: Success";
        System.out.println("Processing payment..." + paymentDetails);
        return "Payment processed successfully with details: " + paymentDetails;
    }
 }
