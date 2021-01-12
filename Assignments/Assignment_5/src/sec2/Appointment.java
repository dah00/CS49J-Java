package sec2;

import java.time.LocalDate;
import java.util.Scanner;

public class Appointment {
    private String year, month, day;

    private String description;

    private LocalDate appointmentDate;
    Scanner myScanner = new Scanner(System.in);
    public Appointment(String year, String month, String day){
        this.year = year;
        this.month = month;
        this.day = day;
        appointmentDate = LocalDate.parse(year + "-" + month + "-" + day);
        System.out.print("Description: ");
        description = myScanner.nextLine();
    }


    public void OccursOn(String year, String month, String day){
        if (this.year.equals(year) && this.month.equals(month) && this.day.equals(day))
            System.out.print("You have an appointment");
    }



    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public String getDescription() {   return description;    }
}
