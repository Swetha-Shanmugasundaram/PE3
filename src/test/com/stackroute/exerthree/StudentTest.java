package com.stackroute.exerthree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    Student g = new Student();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void grades() {
        assertEquals("Grades are within the range", g.grades(5, new int[]{10, 38, 98, 76, 25}));
        assertEquals("Grades are out of range", g.grades(4, new int[]{10, 90, 160, 56, 23}));
        assertEquals("Grades are out of range", g.grades(4, new int[]{89, -98, 23, 67, 100}));
    }

    @Test
    public void gradesFailure() {

        assertNotEquals("Grades are out of range", g.grades(5, new int[]{10, 56, 79, 45, 46}));

        assertNotNull(g.grades(4, new int[]{20, 40, 190, 70}));
    }
}
