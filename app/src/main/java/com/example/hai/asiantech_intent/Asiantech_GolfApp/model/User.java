package com.example.hai.asiantech_intent.Asiantech_GolfApp.model;

import java.io.Serializable;

/**
 * Created by Hai on 6/8/2017.
 */

public class User implements Serializable{
    private String email;
    private String password;
    private String name;
    private String gender;

    public User() {
    }

    public User(String email, String password, String name, String gender) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}

