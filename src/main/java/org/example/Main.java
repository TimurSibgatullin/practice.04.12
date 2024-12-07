package org.example;

import org.example.model.User;
import org.example.model.UserService;

public class Main {
    public static void main(String[] args) {
        User[] arr = UserService.create4Users();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName() + arr[i].getNickname() + arr[i].getMobilePhone() + arr[i].getPassword());
        }

    }
}
