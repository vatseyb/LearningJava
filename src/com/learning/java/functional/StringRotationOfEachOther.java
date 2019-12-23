package com.learning.java.functional;
import java.lang.*;
import java.util.*;
/*
Author: Bhuvi Vatsey
Date: 12/20/2019
Purpose: The purpose of this program is to check if two strings are rotation of each other.
*/
public class StringRotationOfEachOther {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mainstring");
        String originalString = sc.nextLine();
        System.out.println("Enter the String you want to check for rotation");
        String secondString = sc.nextLine();
        checkForRotation(originalString,secondString);
    }

    public static void checkForRotation(String originalString,String secondString) {
        String doubleString = originalString + originalString;
        //Check if String contains another string
        if (doubleString.contains(secondString))
            System.out.println(secondString+ " is a rotation of "+ originalString);
    }
}
