package com.clients.service.dto;

public class Client {
    private String name;
    private String email;
    private int age;

    public Client (String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Client () {
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getEmail () {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }
}
