package org.example.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {
    private String nickname;
    private String name;
    private String mobilePhone;
    private String password;

    public User() {}

    public User(String nickname, String name, String mobilePhone, String password) {
        this.nickname = nickname;
        this.name = name;
        this.mobilePhone = name;
        this.password = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getPassword() {
        return password;
    }

}