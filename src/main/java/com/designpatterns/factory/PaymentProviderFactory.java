package com.designpatterns.factory;

import org.springframework.stereotype.Service;
import java.util.Map;
@Service
public class PaymentProviderFactory {
    private final Map<String, PaymentProvider> paymentProviderMap;

    public PaymentProviderFactory(Map<String, PaymentProvider> paymentProviderMap) {
        this.paymentProviderMap = paymentProviderMap;
    }

    public PaymentProvider getPaymentProvider(String paymentProviderType) {
        return paymentProviderMap.get(paymentProviderType);
    }
}