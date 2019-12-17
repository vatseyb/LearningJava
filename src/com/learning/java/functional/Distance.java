package com.learning.java.functional;
import java.util.Scanner;

import static java.lang.Math.*;
/*
    Write a program ​Distance.java t​hat takes two integer command-line arguments x and y and prints the Euclidean distance
    from the point (x, y) to the origin (0, 0).
    The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function
*/
public class Distance {
    
    public static void main(String args[])
    {
        Scanner scanarguments = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = scanarguments.nextInt();
        System.out.println("Enter the value of x");
        int y = scanarguments.nextInt();
        double distance = sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("Euclidean distance between X and Y is "+ distance);
    }
}
