package com.example.hai.asiantech_intent.Asiantech_fragment.model;

import java.io.Serializable;

/**
 * Created by Hai on 6/7/2017.
 */

public class User implements Serializable {
    String name;
    String address;
    String phone;
    String gender;

    public User() {
    }

    public User(String name, String address, String phone, String gender) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
