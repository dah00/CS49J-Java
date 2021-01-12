package sec3Solution;

import sec2Solution.P9_3;

import java.util.ArrayList;
import java.util.Scanner;

public class P9_4 {
    static ArrayList<sec3.Appointment> appointments;

    public static void main(String[] args) {
        appointments = new ArrayList<>();
        boolean done = false;
        try {
            while (!done) {
                System.out.print("Select an option: a for add an appointment, c forchecking, q to quit: ");
                Scanner scan = new Scanner(System.in);
                char choice = scan.nextLine().toLowerCase().charAt(0);
                switch (choice) {
                    case 'a':
                        System.out.print("Enter the type (o - Onetime, d - Daily, or m - Monthly): ");
                        char type = scan.nextLine().toLowerCase().charAt(0);
                        System.out.print("Enter the date (yyyy-mm-dd): ");
                        String date = scan.nextLine();
                        System.out.print("Enter the description: ");
                        String description = scan.nextLine();
                        addAppointment(type, date, description);
                        break;
                    case 'c':
                        System.out.print("Enter the year: ");
                        int year = scan.nextInt();
                        System.out.print("Enter the month: ");
                        int month = scan.nextInt();
                        System.out.print("Enter the day: ");
                        int day = scan.nextInt();
                        sec3.Appointment[] apps = new Appointment[appointments.size()];
                        printOccurs(appointments.toArray(apps), year, month, day);
                        break;
                    case 'q':
                        done = true;
                        break;
                    default:
                        System.out.println("Invalid option.");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Something went wrong, program terminated.");
        }
    }

    /**
     * Add an appointment based on type, date and description     * @param type o = onetime, d = daily, m = monthly     * @param date format: yyyy-mm-yy     * @param description
     */
    public static void addAppointment(char type, String date, String description) {
        try {
            switch (type) {
                case 'o':
                    appointments.add(new Onetime(date, description));
                    break;
                case 'd':
                    appointments.add(new Daily(date, description));
                    break;
                case 'm':
                    appointments.add(new Monthly(date, description));
                    break;
                default:
                    System.out.println("Invalid type, fail to add the appointment.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Invalid format, please use yyyy-mm-dd.");
        }
    }

    public static void printOccurs(Appointment[] appointments, int year, int month, int day) {
        System.out.println("Appointment(s) on " + year + "-" + month + "-" + day + ": ");
        for (Appointment app : appointments) {
            if (app.occursOn(year, month, day))
                System.out.println(app);
        }
    }
}
