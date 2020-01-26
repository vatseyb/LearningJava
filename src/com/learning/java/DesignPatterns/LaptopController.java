package com.learning.java.DesignPatterns;

import com.sun.org.apache.bcel.internal.generic.RETURN;

//This class is to ensure based on customer's needs we are able to make a suggestion.
public class LaptopController {

    //the brand method returns the object of LaptopChoice interface. Since
    //the return objet can be of any type the declaration hence uses the Interface
    public LaptopChoice brand(Character weight, Character price, Character memory) {
        try {
            if (weight == 'L' && price == 'H' && memory == 'H')
                return new iOS();
            else if (weight == 'L' && price == 'L' && memory == 'H')
                return new Lenovo();
            else if (weight == 'H' && price == 'L' && memory == 'H')
                return new Dell();
            else if (weight == 'L' && price == 'L' && memory == 'L')
                return new Acer();
            else
                return new Asus();
        } catch (Exception e) {
            return new Asus();
        }
    }
}

