package com.sec2;

public class P8_1 {
    public static void main(String[] args) {
        ComboLock myLock = new ComboLock(10, 15, 30);

        // First try
        // Successful test
        myLock.turnRight(30);
        myLock.turnLeft(5);
        myLock.turnRight(25);
        if(myLock.open())
            System.out.println("Successfully open");
        else
            System.out.println("Failed");

        // Second try
        // Unsuccessful test
        myLock.turnRight(20);
        myLock.turnLeft(10);
        myLock.turnRight(5);
        if(myLock.open())
            System.out.println("Successfully open");
        else
            System.out.println("Failed");
    }
}
