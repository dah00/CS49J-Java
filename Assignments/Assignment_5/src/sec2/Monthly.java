package sec2;

import java.time.LocalDate;

public class Monthly extends Appointment{
    public Monthly(String year, String month, String day){
        super(year, month, day);
    }

    public void OccursOn(String year, String month, String day) {
        LocalDate inputDate = LocalDate.parse(year + "-" + month + "-" + day);
        if (inputDate.isEqual(getAppointmentDate()) || inputDate.isAfter(getAppointmentDate())){
            System.out.println("\n=> Monthly appointment");
            System.out.println("Description: " + getDescription());
            System.out.println(getAppointmentDate());
        }
    }

}
