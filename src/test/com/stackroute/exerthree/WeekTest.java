package com.stackroute.exerthree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeekTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findLastDate() {
        assertEquals("SUN 4/1/2020",Week.findLastDate(28,12,2019));
        assertEquals("SUN 4/2/2019",Week.findLastDate(28,1,2019));
        assertEquals("SUN 30/1/2019",Week.findLastDate(24,1,2019));
    }
}