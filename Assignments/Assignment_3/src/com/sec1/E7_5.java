package com.sec1;

import java.util.Scanner;

public class E7_5 {

    public static void main(String[] args) {
        // Declaring all the variables used in the program
        int sum = 0;
        int arraySize;

        Scanner myKeyboard = new Scanner(System.in);

        // Getting the number of entry from the user
        // and declaring the array
        System.out.print("How many elements would you like to put in the array: ");
        arraySize = myKeyboard.nextInt();
        int[] arrays = new int[arraySize];

        // Filling the array as well as alternating
        // sum of all elements in the array
        for (int i=0; i < arraySize; i++){
            System.out.print("Array[" + (i+1) + "] = ");
            arrays[i] = myKeyboard.nextInt();
            if (i%2 == 0)
                sum += arrays[i];
            else
                sum -= arrays[i];

        }

        // Displaying the result
        System.out.println("------------ || RESULT || ------------");
        for (int i=0; i < arraySize-1; i++){
            System.out.print(arrays[i]);
            if (i%2 == 0) {
                System.out.print(" - ");
            }
            else {
                System.out.print(" + ");
            }
        }
        System.out.print(arrays[arraySize-1] + " = " + sum);

    }
}
