package com.learning.java.ArrayExercises;

import java.util.Arrays;

public class SortArray {

    public static void main(String args[]) {

        String[] names = {"Arun", "Rick", "Shyam", "Brian", "Colbert","Meghan","Charlotte"};
        String searchString = "Shyam";
        Arrays.sort(names);
        int midIndex = 0;
        midIndex = (names.length - midIndex) / 2;
        searchStringFunc(names, searchString, midIndex);
    }

    private static void searchStringFunc(String[] names, String searchString, int midIndex) {

        String midString = names[midIndex];

        if (searchString.compareTo(midString) == 0) {
            System.out.println("String found at Position " + midIndex);
        } else if (searchString.compareTo(midString) > 0) {
            midIndex = (names.length + midIndex) / 2;
            searchStringFunc(names, searchString, midIndex);
        } else if (searchString.compareTo(midString) < 0) {
            midIndex = ((midIndex) / 2);
            searchStringFunc(names, searchString, midIndex);
        }

    }
}
