package com.designpatterns.mediator;

public class UserService implements User {
    private MessageService messageService;
    private String user;

    public UserService(MessageService messageService, String user) {
        this.messageService = messageService;
        this.user = user;
        messageService.addUser(this);
    }

    public void send(String message) {
        System.out.println(user + " sends a message: " + message);
        messageService.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(user + " receives a message: " + message);
    }
}
