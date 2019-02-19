package com.stackroute.exerthree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumbersTest {
    ConsecutiveNumbers consecutiveNumbers;
    @Before
    public void setUp() throws Exception {
        consecutiveNumbers= new ConsecutiveNumbers();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkconsecutiveSuccess1() {
        assertEquals(false,consecutiveNumbers.checkconsecutive("98,96,95,94,93,91,89"));
        assertNotNull(consecutiveNumbers.checkconsecutive("98,96,95,94,93,91,89"));
    }
    @Test
    public void checkconsecutiveSuccess2() {
        assertEquals(false,consecutiveNumbers.checkconsecutive("97,96,92,91,97,98,99"));
        assertNotNull(consecutiveNumbers.checkconsecutive("97,96,92,91,97,98,99"));
    }

    @Test
    public void checkconsecutiveFailure() {
        assertNotEquals(true,consecutiveNumbers.checkconsecutive("98,96,95,94,93,91,89"));
        assertNotNull(consecutiveNumbers.checkconsecutive("98,96,95,94,93,91,89"));
    }
}