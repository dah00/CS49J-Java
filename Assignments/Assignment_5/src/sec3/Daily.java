package sec3;

import sec2.Appointment;

import java.time.LocalDate;

public class Daily extends Appointment {
    public Daily(String year, String month, String day){
        super(year, month, day);
    }

    public void OccursOn(String year, String month, String day) {
        LocalDate inputDate = LocalDate.parse(year + "-" + month + "-" + day);
        if (inputDate.isEqual(getAppointmentDate()) || inputDate.isAfter(getAppointmentDate())){
            System.out.println("\n => Daily appointment");
            System.out.println("Description: " + getDescription());
            System.out.println(getAppointmentDate());
        }

    }
}
