package com.stackroute.exerthree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelTest {
    Vowel vr = new Vowel();

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void removeVowels() {
        String[] input={"INDIA","EGYPT"};
        String[] output={"IND","EGYPT"};
        assertArrayEquals(output,vr.removeVowels(input));
    }
}