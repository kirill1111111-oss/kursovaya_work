package com.devcolibri.secure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


public class Userr {
    private String login;
    private String password;
    public Userr(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public Userr() {
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

