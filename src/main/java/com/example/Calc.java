package com.example;

public final class Calc {  // final prevents extension issues

    /**
     * Adds two integers.
     * @param a first number
     * @param b second number  
     * @return sum of a and b
     */
    public int add(final int a, final int b) {
        return a + b;
    }

    /**
     * Subtracts two integers.
     * @param a minuend
     * @param b subtrahend
     * @return difference (a - b)
     */
    public int subtract(final int a, final int b) {
        return a - b;  // ✅ Fixed: was returning a + b
    }

    /**
     * Divides two integers safely.
     * @param a dividend
     * @param b divisor (must be non-zero)
     * @return quotient (a / b)
     * @throws IllegalArgumentException if b is zero
     */
    public int divide(final int a, final int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero not allowed");
        }
        return a / b;  // ✅ Fixed: added zero check
    }

    /**
     * Multiplies two integers.
     * @param a first factor
     * @param b second factor
     * @return product (a * b)
     */
    public int multiply(final int a, final int b) {
        return a * b;  // ✅ Fixed: was returning a + b
    }
}
