package com.learning.java.functional;

import java.util.Scanner;
/*
Write a program ​Quadratic.java to find the roots of the equation a*x*x + b*x + c.
Since the equation is x*x, hence there are 2 roots.
The 2 roots of the equation can be found using a formula (Note: Take a, b and c as input values)
delta = b*b - 4*a*c
Root 1 of x = (-b + sqrt(delta))/(2*a) Root 2 of x = (-b - sqrt(delta))/(2*a)
*/
    public class Quadratic
    {

        public static class CalculateRoots

        {
            double a;
            double b;
            double c;
            double temp;
            double root1;
            double root2;
            CalculateRoots(double a,double b,double c)
            {
                this.a = a;
                this.b = b;
                this.c = c;
            }
            public void Calc(double a, double b, double c)
            {
              double delta = ((Math.pow(b,2)) - (4*a*c));
              double temp  = Math.sqrt(delta);
              double root1 = (-b + temp)/(2*a);
              double root2 = (-b - temp)/(2*a);
              System.out.println("Delta: "+delta);
              System.out.println(temp);
              System.out.println("Value of Root1 "+root1);
              System.out.println("Value of Root2 "+root2);
            }
        }

        public static void main(String args[])
        {
            System.out.println("To find the 2 roots of x we will need three values: a,b and c");
            Scanner scanvalues = new Scanner(System.in);
            System.out.println("Enter the value of a");
            double a = scanvalues.nextInt();
            System.out.println("Enter the value of b");
            double b = scanvalues.nextInt();
            System.out.println("Enter the value of c");
            double c = scanvalues.nextInt();
            CalculateRoots Roots = new CalculateRoots(a,b,c);
            Roots.Calc(a,b,c);
        }
    }
