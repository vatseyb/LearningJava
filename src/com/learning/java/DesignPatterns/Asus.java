package com.learning.java.DesignPatterns;

public class Asus implements LaptopChoice{

    //Overriding the recommendation method from the Interface
    @Override
    public void recommendation() {

        System.out.println("I suggest you an ASUS Laptop");

    }
}
