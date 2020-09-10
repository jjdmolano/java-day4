package com.zuitt.app;

public class StaticPoly {
//    gets the sum of 2 integers
    public int add(int a, int b) {
        return a + b;
    }

//    gets the sum of 3 integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

//    gets the sum of 2 doubles
    public double add (double a, double b) {
        return a + b;
    }


//    mini-exercise: create 3 functions called multiply with the following arguments:

//    1st -> 2 integers
    public int multiply(int a, int b) {
        return a * b;
    }

//    2nd -> 3 long numbers
    public double multiply(double a, double b, double c) {
        return a * b * c;
    }

//    3rd -> a single integer and the integer is multiplied by 5
    public int multiply(int a) {
        return a * 5;
    }
}
