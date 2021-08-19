package com.example.homepage;

public class message {
    String name;
    String message;

    public message() {

    }

    public message(final String name, final String message) {
        this.name = name;
        this.message = message;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}