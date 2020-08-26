package com.algobty.educare;

public class UserHelper {

    String username;

    //constructor without params
    public UserHelper(){
    }

    //constructor with params
    public String getUsername() {
        return username;
    }

    //setter
    public void setUsername(String username) {
        this.username = username;
    }

    //getter
    public UserHelper(String username) {
        this.username = username;
    }
}
