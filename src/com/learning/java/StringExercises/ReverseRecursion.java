package com.learning.java.StringExercises;

public class ReverseRecursion {

    static int count=0;

    public static void main(String args[]) {
        String str1 = "Bhuvi Vatsey";
        char[] array1 = str1.toCharArray();
        reversearr(array1);
        /*StringBuilder sbr = new StringBuilder(str1);
        System.out.println(sbr.reverse());*/

    }


    private static void reversearr(char[] array1) {
            int arraylength = array1.length;
            //int arraylength = 4;
            if (count < arraylength) {
                System.out.print(array1[(arraylength-1) - count]);
                count++;
                reversearr(array1);
            }
        }
    }

