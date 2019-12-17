package com.learning.java.functional;

import java.util.Scanner;

/*Write a program ​WindChill.java that takes two double command-line arguments t and v and prints the wind chill.
Use Math.pow(a, b) to compute ab. ​Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour),
the National Weather Service defines the effective temperature (the wind chill) to be:
 w  = 35.74 + 0.6215t +(0.4275 t - 35.75)vpower0.16
Note​: the formula is not valid if t is larger than 50 in absolute value or if v is larger than 120 or less than 3
(you may assume that the values you get are in that range).
 */

public class WindChill {

    public static class CalculateWindChill

    {
        double temp;
        double velocity;
        double result;
        static final double CONSTANT1 = 35.74;
        static final double CONSTANT2 = 0.6215;
        static final double CONSTANT3 = 0.4275;
        static final double CONSTANT4 = 35.75;
        static final double CONSTANT5 = 0.16;


        CalculateWindChill(double temp,double velocity)
        {
            this.temp = temp;
            this.velocity = velocity;
        }
        public double Calc(double temp, double velocity)
        {
            //w  = 35.74 + 0.6215t +(0.4275 t - 35.75)vpower0.16
            result = (CONSTANT1 + (CONSTANT2*temp) + (((CONSTANT3*temp)- CONSTANT4)* Math.pow(velocity,CONSTANT5)));
            return result;
        }
    }

    public static void main(String args[])
    {
        System.out.println("To find the 2 roots of x we will need three values: a,b and c");
        System.out.println("Please note: The formula is not valid if temperature is larger than 50 in absolute value or " +
                "if v is larger than 120 or less than 3 ");
        Scanner scanvalues = new Scanner(System.in);
        System.out.println("Enter the value of temp (in Fahrenheit) ");
        double temp = scanvalues.nextInt();
        System.out.println("Enter the value of velocity (in miles per hour) ");
        double velocity = scanvalues.nextInt();
        CalculateWindChill Roots = new CalculateWindChill(temp,velocity);
        System.out.println("Wind Chill = "+ Roots.Calc(temp,velocity));
    }

}
