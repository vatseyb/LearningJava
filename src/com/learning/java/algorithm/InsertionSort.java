package com.learning.java.algorithm;
/*
Author: Bhuvi Vatsey
Date: 12/24/2019
Purpose: Reads in strings and prints them in sorted order using insertion sort.
I/P -> read in the list words
Logic -> Use Insertion Sort to sort the words in the String array
O/P -> Print the Sorted List
*/

import java.util.Scanner;

public class InsertionSort {

    public String[] sort(String arrayToSort[]) {
        int n = arrayToSort.length;
        for (int i = 1; i < n; ++i) {
            String key = arrayToSort[i];
            int j = i - 1;

			/* Move elements of arr[0..i-1], that are
			greater than key, to one position ahead
			of their current position */
            while (j >= 0 && (arrayToSort[j].compareTo(key) > 0)) {
                arrayToSort[j + 1] = arrayToSort[j];
                j = j - 1;
            }
            arrayToSort[j + 1] = key;
        }
        return arrayToSort;
    }

    // Driver method
    public static void main(String args[]) {
        //Enter the Array size
        Scanner scanArrayLength = new Scanner(System.in);
        System.out.println("Enter number of elements to sort");
        int arraySize = scanArrayLength.nextInt();
        //Define Array
        String[] arrayToSort = new String[arraySize];
        Scanner scanArray = new Scanner(System.in);
        System.out.println("Enter the array elements");
        //Call method to Create array
        populateArray(arrayToSort,arraySize,scanArray);
        //Call method to sort the array using Insertion Sort
        InsertionSort ob = new InsertionSort();
        String [] sortedArray = ob.sort(arrayToSort);
        displayArray(sortedArray);
    }

    private static void displayArray(String[] arrayToSort) {
        int lengthOfArray = arrayToSort.length;
        System.out.print("{");
        for (int i=0;i<lengthOfArray;i++)
        {
            System.out.print(" "+ arrayToSort[i] + ",");
        }
        System.out.print("}");
    }

    private static String[] populateArray(String[] arrayToSort, int arraySize, Scanner scanArray) {
        for (int i=0;i<arraySize;i++)
        {
            arrayToSort[i] = String.valueOf(scanArray.nextLine());
        }
        return arrayToSort;
    }
}
