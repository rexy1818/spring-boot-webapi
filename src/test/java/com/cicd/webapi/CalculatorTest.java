package com.cicd.webapi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    
    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.subtract(5, 3));
        assertEquals(-8, calculator.subtract(-5, 3));
    }

    @Test
    void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 3));
        assertEquals(-3, calculator.multiply(1, -3));
    }

    @Test
    void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.divide(10, 2));

        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> calculator.divide(10, 0)
        );

        // Validamos el mensaje exacto que tienes en Calculator.java ("Denominator cannot be zero.")
        assertEquals("Denominator cannot be zero.", exception.getMessage());
    }
}