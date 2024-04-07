package com.designpatterns.observer;

import org.springframework.stereotype.Component;

@Component
public class PublishAndSubscribeMain {
    public void publishAndSubscribeUserNotification(){

        User user=new User(1,"Gaurav Shakya", "gauravshakya71@gmail.com");
        UserPublisher userPublisher = new UserPublisher();

        UserNotification userNotification = new UserNotification();
        UserVerifyNotification userVerifyNotification = new UserVerifyNotification();

        userPublisher.subscribe(userNotification);
        userPublisher.subscribe(userVerifyNotification);
        userPublisher.publish(user);
    }

}
