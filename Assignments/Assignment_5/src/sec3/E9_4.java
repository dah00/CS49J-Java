package sec3;

import sec2.Appointment;


import java.util.ArrayList;
import java.util.Scanner;

public class E9_4 {
    public static void main(String[] args) {
        ArrayList<Appointment> myAppointment = new ArrayList<>();
        Scanner myScanner  = new Scanner(System.in);

        String year;
        String day;
        String month;
        String date;

        // For Add, Check, and Quit
        char userChoice1;
        // For Onetime, Daily, and Monthly
        char userChoice2;


        do {
            System.out.println("\tA - Add for an appointment, C - for Checking, Q to quit ");
            System.out.print("=> ");
            userChoice1 = myScanner.next().trim().toUpperCase().charAt(0);

            switch(userChoice1) {
                case 'A':
                    System.out.print("\tEnter the type (O - Onetime, D - Daily, or M - Monthly) : ");
                    userChoice2 = myScanner.next().trim().toUpperCase().charAt(0);
                    System.out.print("\tEnter the date (yyyy-mm-dd): ");
                    date = myScanner.next();
                    System.out.println(date);

                    // assigning year, month, and day from date
                    year = date.substring(0,4);
                    month = date.substring(5,7);
                    day = date.substring(8);

                    if (userChoice2 == 'O')
                        myAppointment.add(new Onetime(year, month, day));
                    else if (userChoice2 == 'D')
                        myAppointment.add(new Daily(year, month, day));
                    else if (userChoice2 == 'M')
                        myAppointment.add(new Monthly(year, month, day));
                    break;
                case 'C':
                    System.out.print("\tEnter the year: ");
                    year = myScanner.next();
                    System.out.print("\tEnter the month: ");
                    month = myScanner.next();
                    System.out.print("\tEnter the day: ");
                    day = myScanner.next();
                    for (Appointment myArray: myAppointment) {
                        myArray.OccursOn(year, month, day);
                    }
                    break;
                default:

            }

        } while (userChoice1 != 'Q');


    }

}


