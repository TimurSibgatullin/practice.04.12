package org.example.model;
import java.time.LocalDateTime;

public class Message {
    private String sender = new User;
    private String recipient = new User;
    private String message;
    private String time;

    public Message() {}

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getMessage() {
        return message;
    }

    public String getTime() {
        return time;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTime(String time) {
        this.time = now(time);
    }
}
