package com.sec1;

import java.util.Scanner;

public class E4_23 {

    public static void main(String[] args) {
        Scanner myKeyboard = new Scanner(System.in);
        float height, diameter;
        String input;

        // Getting the height and diameter form the user
        System.out.print("Enter Soda Can's height and diameter, use space to separate elements: ");
        input = myKeyboard.nextLine();

        // Assigning height and diameter from the user's input
        height = Float.parseFloat(input.substring(0, input.indexOf(" ")));
        diameter = Float.parseFloat(input.substring(input.indexOf(" ")));

        SodaCan mySoda = new SodaCan(height, diameter);

        // Formatting the results to 2 decimal places
        String volumeFomatted = String.format("%.02f", mySoda.getVolume());
        String SurfaceAreaFormatted = String.format("%.02f", mySoda.getSurfaceArea());

        System.out.println("Soda Can Volume: " + volumeFomatted);
        System.out.print("Soda Can Area: " + SurfaceAreaFormatted);
    }
}
