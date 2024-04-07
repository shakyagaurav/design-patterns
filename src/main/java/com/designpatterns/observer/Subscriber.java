package com.designpatterns.observer;

public interface Subscriber<T> {
    void next(T data);
}
