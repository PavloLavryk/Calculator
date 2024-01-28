package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
private SumCalculator calculator;
    @BeforeEach
    public void setUp(){
        calculator = new SumCalculator();
    }

    @Test
    void testSumOfOne(){
        assertEquals(1, calculator.sum(1));
    }
    @Test
    public void testSumOfThree() {
        assertEquals(6, calculator.sum(3));
    }
    @Test
    public void testSumOfZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}