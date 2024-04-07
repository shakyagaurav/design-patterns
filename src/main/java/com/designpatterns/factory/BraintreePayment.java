package com.designpatterns.factory;

import org.springframework.stereotype.Service;

    @Service(BraintreePayment.BRAINTREE_PAYMENT_BEAN)
    public class BraintreePayment implements PaymentProvider {
        public static final String BRAINTREE_PAYMENT_BEAN = "braintreePayment";

        @Override
        public void processPayment() {
            System.out.println("Process payment using Braintree");
        }
    }
