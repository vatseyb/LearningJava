package com.learning.java.functional;

import java.util.Arrays;
import java.util.Scanner;

public class Sumof3IntegerAddsToZero {

    /*Sum of three Integer adds to ZERO
    a. Desc -> A program with cubic running time. Read in N integers and counts the number of triples that sum to exactly 0.
    b. I/P -> N number of integer, and N integer input array
    c. Logic -> Find distinct triples (i, j, k) such that a[i] + a[j] + a[k] = 0
    d. O/P -> One Output is number of distinct triplets as well as the second output is to
    print the distinct triplets.*/
        /*
         * Complete the simpleArraySum function below.
         */
        public int simpleArraySum(int[] ar) {
            int result = 0;
            for (int i=0;i<ar.length;i++)
            {
                result = ar[i] + result;
            }
            return result;
        }

        public static void main(String[] args) {

            Scanner scandef = new Scanner(System.in);
            System.out.println("Enter Number of elements in the Array");
            int arCount = scandef.nextInt();
            int[] ar = new int[arCount];
            System.out.println("Enter Array Elements");
            /*Below loop is to populate the keyed elements into an array*/
            for (int arItr = 0; arItr < arCount; arItr++) {
                int arItem = scandef.nextInt();
                ar[arItr] = arItem;
            }
            int totalCount = 0;
            /*List<String> arTemp = new ArrayList<String>();*/
            int[] arTemp = new int[3];
            //Sumof3IntegerAddsToZero Sum = new Sumof3IntegerAddsToZero();

            for (int i=0;i<(arCount-2);i++)
            {
                for (int j=1;j<(arCount-1);j++)
                {
                    for (int k=2;k<arCount;k++)
                    {
                        if ((i==j) || (i==k) || (j==k))
                            continue;
                        else
                            {

                                if ((ar[i] + ar[j] + ar[k]) == 0)
                                {

                                   /* arTemp.add(Arrays.toString(ar[i],ar[k]));*/
                                    arTemp[0] = ar[i];
                                    arTemp[1] = ar[j];
                                    arTemp[2] = ar[k];
                                    totalCount = totalCount + 1;
                                    /*int result = Sum.simpleArraySum(ar);*/
                                    System.out.println("array " + Arrays.toString(arTemp));
                                }
                            }
                    }
                }

            }
            System.out.println("Total Count:"+ totalCount);
        }
    }

