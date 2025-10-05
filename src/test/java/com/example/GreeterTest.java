package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {
    @Test
    void greet_withName() {
        // adding comment
        assertEquals("Hello, Alice!", new Greeter().greet("Alice"));
    }
    @Test
    void greet_default() {
        // adding comment
        assertEquals("Hello, world!", new Greeter().greet(""));
    }
}
