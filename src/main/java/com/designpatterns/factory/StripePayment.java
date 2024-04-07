package com.designpatterns.factory;

import org.springframework.stereotype.Service;

@Service(StripePayment.STRIPE_PAYMENT_BEAN)
public class StripePayment implements PaymentProvider {
    public static final String STRIPE_PAYMENT_BEAN = "stripePayment";

    @Override
    public void processPayment() {
        System.out.println("Process payment using Stripe");
    }
}
