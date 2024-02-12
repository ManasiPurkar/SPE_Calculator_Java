package org.example;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

//    @org.junit.jupiter.api.Test
//    void main() {
//    }
    @org.junit.jupiter.api.Test
    public void testSquareRootFunction() {
        double result = Main.squareRoot(16);
        assertEquals(4, result, 0.0001);
    }

    @org.junit.jupiter.api.Test
    public void testFactorialFunction() {
        long result = Main.factorial(5);
        assertEquals(120, result);
    }

    @org.junit.jupiter.api.Test
    public void testNaturalLogarithmFunction() {
        double result = Main.naturalLogarithm(2.71828);
        assertEquals(1, result, 0.0001);
    }

    @org.junit.jupiter.api.Test
    public void testPowerFunction() {
        double result = Main.power(2, 3);
        assertEquals(8, result, 0.0001);
    }
}