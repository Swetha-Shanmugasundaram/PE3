package com.stackroute.exerthree;
import java.lang.*;
public class Student {
        public String grades(int n, int[] grades){
            String temp="";
            for(int i=0;i<n;i++)
            {
                if(grades[i]>0 && grades[i]<=100)
                {
                    temp="Grades are within the range";
                }
                else
                {
                    try{
                        throw new ArguementOutOfBoundException();
                    }
                    catch (ArguementOutOfBoundException e){
                        temp= e.getMessage();
                    }
                    return temp;
                }
            }
            return temp;
        }
    }
    class ArguementOutOfBoundException extends Exception{
        public String getMessage(){
            return "Grades are out of range";
        }
    }


