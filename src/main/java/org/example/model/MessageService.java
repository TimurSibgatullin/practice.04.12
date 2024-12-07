package org.example.model;

public class MessageService {

    public MessageService() {}

    public static Message[] create4Message(User[] arr) {
        Message message1 = new Message(arr[0],arr[1],"hi");
        Message message2 = new Message(arr[1],arr[0],"hihi");
        Message message3 = new Message(arr[0],arr[1],"hi");
        Message message4 = new Message(arr[1],arr[0],"hihi");
        Message[] arr5 = {message1, message2, message3, message4};
        return arr5;
    }
}