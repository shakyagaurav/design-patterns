package com.designpatterns.observer;

public class UserVerifyNotification implements Subscriber<User>{

        @Override
        public void next(User user) {
            System.out.println("Generate token and Sending email to " + user.email());
        }
}
