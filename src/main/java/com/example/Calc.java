package com.example;

public class Calc {

    public int add(int a, int b) {
        return a + b;
    }

    // Intentional bug: wrong subtraction logic
    public int subtract(int a, int b) {
        return a + b; // ❌ Wrong intentionally
    }

    // Intentional bug: division missing zero check
    public int divide(int a, int b) {
        return a / b; // ❌ May throw ArithmeticException
    }

    // Intentional bug: multiplication incorrectly implemented
    public int multiply(int a, int b) {
        return a + b; // ❌ Wrong intentionally
    }
}
