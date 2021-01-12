package com.sec2;

import java.util.Scanner;

public class P6_5 {
    public static void main(String[] args) {
        Scanner mykeyboard = new Scanner(System.in);
        int userInput;


        System.out.print("Up to what number would you like to show all prime numbers: ");
        userInput = mykeyboard.nextInt();


        PrimeGenerator myPrime = new PrimeGenerator(userInput);

        // Displaying the prime numbers
        // The local variable prime and
        // the if statement are to avoid a duplicated print
        System.out.println("Here are the prime numbers up to " + userInput);
        for (int count=2; count<=userInput; count++){
            int prime = myPrime.nextPrime(count);
            if (prime<count)
                continue;
            System.out.print(prime + " ");
        }
    }
}
