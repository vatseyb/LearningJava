package com.learning.java.functional;

import java.util.Scanner;

public class BubbleSort <Inte>{

    public void Sortarray(Inte arr[]) {

        int n = arr.length;
        Inte temp=arr[0];
        for (int i=0;i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if (arr[j])>arr[j+1]) {
                    temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
    }

    public static void main(String args[])
    {
        Scanner scanarray = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = scanarray.nextInt();
        //int[] Array1 = new int[n];
        BubbleSort <Integer> [] Array1 = new BubbleSort[n];
        System.out.println("Enter the array elements");
        for (int i=0;i<n;i++)
        {
            Array1[i] =  scanarray.nextInt();
        }
        BubbleSort ob = new BubbleSort();
        ob.Sortarray(Array1);
        System.out.println("Array:");
        for (int i=0;i<n;i++)
        {
            System.out.print(Array1[i]+" ");
        }
    }
}