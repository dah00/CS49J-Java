package com.sec1;

import java.util.Scanner;

public class E4_17 {

    public static void main(String[] args) {
        String firstTime, secondTime;
        int firstHour, secondHour, firstMinute, secondMinute, resultHour, resultMinute;

        Scanner myScanner = new Scanner(System.in);

        // Getting input from user  (1st time)
        System.out.print("Please enter the first time: ");
        firstTime = myScanner.nextLine();

        // Getting input from user  (2nd time)
        System.out.print("Please enter the first time: ");
        secondTime = myScanner.nextLine();

        //Casting string to int and define hour and minute
        firstHour = Integer.parseInt(firstTime.substring(0,2));
        secondHour = Integer.parseInt(secondTime.substring(0,2));

        firstMinute = Integer.parseInt(firstTime.substring(2,4));
        secondMinute = Integer.parseInt(secondTime.substring(2,4));

        //Operation 1. if first time < second time
        if (firstHour <= secondHour){
            if (firstMinute <= secondMinute) {
                resultHour = secondHour - firstHour;
                resultMinute = secondMinute - firstMinute;
            }
            else {
                resultHour = secondHour - firstHour - 1;
                resultMinute = firstMinute - secondMinute;
            }
            System.out.print( resultHour + " hours ");
            System.out.print(resultMinute + " minutes");
        }
        // 2. if first time > second time
        else{
            if (firstMinute <= secondMinute) {
                resultHour = (24-firstHour) + secondHour;
                resultMinute = secondMinute - firstMinute;
            }
            else {
                resultHour = ((24-firstHour) + secondHour) - 1;
                resultMinute = firstMinute - secondMinute;
            }

            System.out.print( resultHour + " hours ");
            System.out.print(resultMinute + " minutes");
        }

    }
}
