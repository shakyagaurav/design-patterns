package com.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class MessageService implements Message {
        private List<User> users;

        public MessageService() {
            this.users = new ArrayList<>();
        }

        public void addUser(User user) {
            users.add(user);
        }

        @Override
        public void sendMessage(String message, User sender) {
            for (User user : users) {
                if (user != sender) {
                    user.receiveMessage(message);
                }
            }
        }
}
