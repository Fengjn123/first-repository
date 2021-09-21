package com.feng.bootweb.bean;


import lombok.Data;

@Data
public class User {
    private String name;
private Integer id;


    public User(String name,int id) {
        this.id = id;
        this.name = name;
    }
}
