package sec2;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class E9_3 {
    public static void main(String[] args) {

        Scanner myScanner  = new Scanner(System.in);
        String year = "";
        String day = "";
        String month = "";
        String date;

        int checkValid = 1;

        Appointment myAppointment[] = {
                new Onetime("2019","10","03"),
                new Daily("2019", "12","30"),
                new Monthly("2019", "10","01")};

        //checkValid = 1;
        do {
            try{
                System.out.print("year (yyyy): ");
                year = myScanner.next();
                System.out.print("Month (mm): ");
                month = myScanner.next();
                System.out.print("Day (dd): ");
                day = myScanner.next();

                date = year + "-" + month + "-" + day;

                //Check whether the input is a valid date
                LocalDate localDate2 = LocalDate.parse(date);

                //
                checkValid = 2;

            }catch (DateTimeParseException exception){
                System.out.println("Your date format is invalid, please do it again");
            }
        }while (checkValid == 1);

        for (int i = 0; i<3; i++){
            myAppointment[i].OccursOn(year, month, day);

        }

    }
}
