package com.designpatterns.observer;

public class UserNotification  implements Subscriber<User>{

        @Override
        public void next(User user) {
            System.out.println("Sending user registration email to " + user.email());
        }
}
