package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class UserPublisher implements Publisher<User> {

    private final List<Subscriber<User>> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Subscriber<User> subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber<User> subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void publish(User user) {
        subscribers.forEach(s -> s.next(user));
    }

}
