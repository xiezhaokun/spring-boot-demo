package com.example.demo.learning.annotation.model;


import lombok.Getter;
import lombok.Setter;

/**
 * @author xiezhaokun
 */
@Getter
@Setter
public class User {

    private String id;

    private String name;

    private String account;

    public User() {

    }

    public User(String id, String name, String account) {
        this.id = id;
        this.name = name;
        this.account = account;
    }
}
