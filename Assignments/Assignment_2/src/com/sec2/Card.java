package com.sec2;

import java.util.Scanner;

public class Card {
    String userInput, firstChar, secondChar;
    Scanner myString = new Scanner(System.in);

    // Constructor which take input from user and assign the first
    // and second character in a separate variable
    public Card (){
        System.out.print("Enter the card notation: ");
        userInput = myString.nextLine().trim().toUpperCase();

        firstChar = userInput.substring(0,1);
        secondChar = userInput.substring(1,2);
    }
    // get the full name of one character
    public String getFullDescription(String str){
        switch(str){
            case "A":
                return "Ace";
            case "2":
                return "Two";
            case "3":
                return "Three";
            case "4":
                return "Four";
            case "5":
                return "Five";
            case "6":
                return "Six";
            case "7":
                return "Seven";
            case "8":
                return "Eight";
            case "9":
                return "Nine";
            case "10":
                return "Ten";
            case "J":
                return "Jack";
            case "Q":
                return "Queen";
            case "K":
                return "King";
            case "D":
                return "Diamonds";
            case "H":
                return "hearts";
            case "S":
                return "Spades";
            case "C":
                return "Clubs";
            default:
                return "Unknown";
        }
    }
    // the result
    public void getDescription(){
        System.out.println(getFullDescription(firstChar) + " of " + getFullDescription(secondChar) );
    }
}
