package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {
    
    @Test
    public void testAdd() {
        Calc calc = new Calc();
        assertEquals(5, calc.add(2, 3));
    }
    
    @Test
    public void testSubtract() {
        Calc calc = new Calc();
        assertEquals(1, calc.subtract(3, 2));
    }
}
