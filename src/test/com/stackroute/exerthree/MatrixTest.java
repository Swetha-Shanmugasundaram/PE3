package com.stackroute.exerthree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
    Matrix a = new Matrix();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void matrix() {
        int row=2;
        int column=2;
        int[][] matrix1 ={{2,2},{3,5}};
        int[][] matrix2 = {{9,5},{4,6}};
        int[][] output = {{11,7},{7,11}};
        assertArrayEquals(output,a.matrix(row,column,matrix1,matrix2));
    }
}