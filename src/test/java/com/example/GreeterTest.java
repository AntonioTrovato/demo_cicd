package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {
    @Test
    // this method tests greeting with a name
    void greet_withName() {
        assertEquals("Hello, Alice!", new Greeter().greet("Alice"));
    }
    @Test
    // this method tests greeting with default name
    void greet_default() {
        assertEquals("Hello, world!", new Greeter().greet(""));
    }
}
