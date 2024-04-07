package com.designpatterns;

import com.designpatterns.builer.Product;
import com.designpatterns.factory.BraintreePayment;
import com.designpatterns.factory.PaymentProviderFactory;
import com.designpatterns.factory.StripePayment;
import com.designpatterns.mediator.MessageService;
import com.designpatterns.mediator.User;
import com.designpatterns.mediator.UserService;
import com.designpatterns.observer.PublishAndSubscribeMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication implements CommandLineRunner {

	@Autowired
	PaymentProviderFactory paymentProviderFactory;

	@Autowired
	PublishAndSubscribeMain publishAndSubscribeMain;


	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		Some of the builder pattern example in Java classes are;
//
//		java.lang.StringBuilder#append() (unsynchronized)
//		java.lang.StringBuffer#append() (synchronized)

		System.out.println("************* Builder Design Pattern ***********");
		Product product = new Product.ProductBuilder(
				"IPhone 17", 299.9).setDescription("256 GB ROM and 16 GB RAM")
				.setId(1).setStock(17).build();
		System.out.println("Product Creation: "+product.toString());

		System.out.println("************* Mediator Design Pattern *************");
		// Create a message service mediator
		MessageService messageService = new MessageService();
		UserService user1 =new UserService(messageService, "gaurav");
		UserService user2 =new UserService(messageService, "Harsh");

		user1.send("Hi..Buddy..I am waiting!");
		user2.send("Hi..Buddy..I am Reaching there!");

		System.out.println("************* Factory Design Pattern *************");
		paymentProviderFactory.getPaymentProvider(StripePayment.STRIPE_PAYMENT_BEAN).processPayment();
		paymentProviderFactory.getPaymentProvider(BraintreePayment.BRAINTREE_PAYMENT_BEAN).processPayment();

		System.out.println("************* Observer Design Pattern *************");
		publishAndSubscribeMain.publishAndSubscribeUserNotification();
	}
}
