package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {

    Calc c = new Calc();

    @Test
    void testAdd() {
        assertEquals(5, c.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertNotEquals(1, c.subtract(3, 2)); // Should fail
    }

    @Test
    void testDivide() {
        assertThrows(ArithmeticException.class, () -> c.divide(10, 0));
    }

    @Test
    void testMultiply() {
        assertNotEquals(6, c.multiply(2, 3)); // Should fail
    }
}
