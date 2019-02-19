package com.stackroute.exerthree;

import java.util.Scanner;
public class Matrix {

        public int[][] matrix(int row,int column,int[][] matrix1,int[][] matrix2)
        {
            System.out.print("Input number of rows of matrix: "+row);
            System.out.print("Input number of columns of matrix: "+column);
            System.out.print("Input elements Of first matrix: "+matrix1);
            System.out.print("Input elements Of second matrix: "+matrix2);
            int[][] add = new int[row][column];
            System.out.println("Sum of the matrices:-");
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<column;j++)
                {
                    add[i][j]=matrix1[i][j]+matrix2[i][j];
                }
            }
            for(int i=0;i<row;i++)
            {
                for(int j=0;j<column;j++)
                {
                    System.out.print(add[i][j]+" ");
                }
                System.out.println();
            }

            return add;
        }
    }