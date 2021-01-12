package sec2Solution;

import java.time.LocalDate;

public class Appointment {
    private LocalDate date;
    private String description;

    Appointment(String date, String description){
        this.description = description;
        this.date = LocalDate.parse(date);
    }

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    /*
        Check if the appointment occurs on the input date.
        Same as onetime appointment

        @param year
        @param month
        @param day

        @return true if the input date is the same date as appointment date
     */
    public boolean occursOn(int year, int month, int day){
        return date.isEqual(LocalDate.of(year, month, day));
    }

    /*
        print format: <description> made on <date>
        @return string representation of Appointment objects
     */
    @Override
    public String toString(){
        return description + "\tmade on\t" + date;
    }
}
