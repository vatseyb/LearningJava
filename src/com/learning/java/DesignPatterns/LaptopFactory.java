package com.learning.java.DesignPatterns;

/*PURPOSE: The purpose of this program is to demonstrate a factory design pattern.
Here we have created an Interface LaptopChoice where we have a method Recommendation implemented
in Acer, Asus, Dell and iOS classes.Based on the given Weight,Price and memory the Customer will be suggested
a laptop brand.

Date: 1/18/2020
Author: Bhuvi Vatsey
 */

public class LaptopFactory {

    public static void main(String[] args)
    {
        System.out.println("Welcome to our Laptop factory here we will offer you a Laptop brand based on your choice");
        System.out.println("You can provide H-> High or L-> Low values of weight,price and memory respectively");
        //Creating an object of the Controller class, based on the choices made suggestions will be made.
        LaptopController obj1 = new LaptopController();
        LaptopChoice lcobj1 = obj1.brand('H','H','H');
        lcobj1.recommendation();

        LaptopChoice lcobj2 = obj1.brand('L','H','H');
        lcobj2.recommendation();

        LaptopChoice lcobj3 = obj1.brand('H','L','H');
        lcobj3.recommendation();


    }
}
