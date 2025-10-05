package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void add_works() {
        assertEquals(5, new Calculator().add(2,3));
    }
    @Test
    void sub_works() {
        assertEquals(1, new Calculator().sub(3,2));
    }
}
