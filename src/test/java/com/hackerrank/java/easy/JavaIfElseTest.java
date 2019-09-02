package com.hackerrank.java.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaIfElseTest {

    @Test
    public void checkIfElseSolution() {
        String result = com.hackerrank.java.easy.JavaIfElse.ifElseSolution(1);
        assertEquals("Odd number validation failed. Number lower than 2.", "Weird", result);

        result = com.hackerrank.java.easy.JavaIfElse.ifElseSolution(3);
        assertEquals("Odd number validation failed. Number between 2 and 5.", "Weird", result);

        result = com.hackerrank.java.easy.JavaIfElse.ifElseSolution(9);
        assertEquals("Odd number validation failed. Number between 6 and 20.", "Weird", result);

        result = com.hackerrank.java.easy.JavaIfElse.ifElseSolution(51);
        assertEquals("Odd number validation failed. Number greater than 20.", "Weird", result);

        result = com.hackerrank.java.easy.JavaIfElse.ifElseSolution(2);
        assertEquals("Even number validation failed. Number between 2 and 5.", "Not Weird", result);

        result = com.hackerrank.java.easy.JavaIfElse.ifElseSolution(10);
        assertEquals("Even number validation failed. Number between 6 and 20.", "Weird", result);

        result = com.hackerrank.java.easy.JavaIfElse.ifElseSolution(24);
        assertEquals("Even number validation failed. Number greater than 20.", "Not Weird", result);

    }
}