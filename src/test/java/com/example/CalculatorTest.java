package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    // this method tests the constructor
    void constructor_works() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }
    
    @Test
    // this method tests addition
    void add_works() {
        assertEquals(5, new Calculator().add(2,3));
    }
    @Test
    // this method tests subtraction
    void sub_works() {
        assertEquals(1, new Calculator().sub(3,2));
    }
}
