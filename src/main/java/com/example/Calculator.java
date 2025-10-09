package com.example;

public class Calculator {
    private int a;
    private int b;
    
    public Calculator() {
        // Constructor for Calculator
    }
    
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public int add(int a, int b) {
        // adding a comment
        return a + b;
    }
    public int sub(int a, int b) {
        // adding a comment
        return a - b;
    }
    public int multiply(int a, int b) {
        // adding a comment
        return a * b;
    }
    public int divide(int a, int b) {
        // adding a comment
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }
    // modulus method
    public int mod(int a, int b) {
        // adding a comment
        return a % b;
    }

}
