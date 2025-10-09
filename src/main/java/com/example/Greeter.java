package com.example;

public class Greeter {
    private String name;

    public Greeter() {
    }

    public Greeter(String name) {
        this.name = name;
    }

    public String greet(String name) {
        if (name == null || name.isBlank()) return "Hello world!";
        return "Hello " + name + "!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
