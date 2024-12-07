package org.example;

import org.example.model.Message;
import org.example.model.MessageService;
import org.example.model.User;
import org.example.model.UserService;

public class Main {
    public static void main(String[] args) {
        User[] arr = UserService.create4Users();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName() + " " + arr[i].getNickname() + " " + arr[i].getMobilePhone() + " " + arr[i].getPassword());
        }
        Message[] arr2 = MessageService.create4Message(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i].getSender().getName() + " " + arr2[i].getRecipient().getName() + " " + arr2[i].getMessage() + " " + arr2[i].getTime());
        }
    }
}
