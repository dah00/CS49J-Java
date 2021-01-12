package sec3;

import sec2.Appointment;

import java.time.LocalDate;

public class Onetime extends Appointment {
    public Onetime(String year, String month, String day){
        super(year, month, day);
    }

    public void OccursOn(String year, String month, String day) {
        LocalDate inputDate = LocalDate.parse(year + "-" + month + "-" + day);
        if (inputDate.isEqual(getAppointmentDate())){
            System.out.println("\n=> One time appointment");
            System.out.println("Description: " + getDescription());
            System.out.println(getAppointmentDate());
        }
    }

}
