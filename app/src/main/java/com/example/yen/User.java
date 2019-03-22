package com.example.yen;

import java.io.Serializable;

public class User implements Serializable {
    private String name, email;
    private int phone;

    public User() {
    }

    public User(String name, String email, int phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }


    @Override
    public String toString() {
        return this.name+this.email+this.phone;
    }
}
