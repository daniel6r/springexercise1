package com.example.springexercise1.model;

public class User {
    private int id;
    private String name;
    private boolean registered;

    public User(int id, String name, boolean registered) {
        this.id = id;
        this.name = name;
        this.registered = registered;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }
}
