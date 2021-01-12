package com.sec2;


public class PrimeGenerator {
    private final int userInput;

    // Constructor that initializes the attribute member
    public PrimeGenerator(int userInput){
        this.userInput = userInput;
    }

    // Takes an integer("input") that returns the last prime number before that integer("input")
    // Returns 0 is no prime number was found.
    public int nextPrime(int input){
        int prime = 0;
        for(int count = 2; count<=input; count++){
            if (isPrime(count))
                prime = count;
        }
        return prime;
    }
    // Check whether "primeTest" is a prime number or not
    private boolean isPrime(int primeTest){
        for (int count=primeTest-1; count>1; count--){
            if (primeTest%count == 0)
                return false;
        }
        return true;
    }
}
