package sec3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P15_2 {
    public static void main(String[] args) {
        Scanner mykeyboard = new Scanner(System.in);
        char userChoice;
        String firstName, lastName, grade;
        int id;


        // mapStudent<ID, student>
        Map<Integer, Student> mapStudent = new HashMap<>();
        // mapGrade<student, grade>
        Map<Student, String> mapGrade = new HashMap<>();
        do{
            // Display option to the user
            System.out.println("\nSelect an option: ");
            System.out.println("\t (a) to add a student");
            System.out.println("\t (r) to remove a student");
            System.out.println("\t (m) to modify a grade");
            System.out.println("\t (p) to print all grades");
            System.out.println("\t (q) to quit");
            System.out.print("> ");
            userChoice = mykeyboard.next().toLowerCase().charAt(0);

            // To handle the user's choice
            switch (userChoice){
                // Get the student's information from the user
                // then add it to both mapStudent & mapGrade
                case 'a':
                    System.out.print("Enter student first name: ");
                    firstName = mykeyboard.next();
                    System.out.print("Enter student last name: ");
                    lastName = mykeyboard.next();
                    System.out.print("Enter student ID: ");
                    id = mykeyboard.nextInt();
                    System.out.print("Enter student grade: ");
                    grade = mykeyboard.next().toUpperCase();

                    Student student = new Student(firstName, lastName, id);
                    mapStudent.put(id, student);
                    mapGrade.put(student, grade);
                    break;

                // Get the student ID to be removed then remove from both maps
                case 'r':
                    System.out.print("Enter student ID: ");
                    id = mykeyboard.nextInt();
                    while (!mapStudent.containsKey(id)){
                        System.out.print("student not found, please enter a valid ID: ");
                        id = mykeyboard.nextInt();
                    }
                    // Remove the student from both map
                    mapGrade.remove(mapStudent.remove(id));     // To watch out, might fail
                    break;
                // get the student ID then update the grade to the mapGrade
                // using mapStudent.get(id) to identify the student int the mapGrade
                case 'm':
                    System.out.print("Enter student ID: ");
                    id = mykeyboard.nextInt();
                    while (!mapStudent.containsKey(id)){
                        System.out.print("student not found, please enter a valid ID: ");
                        id = mykeyboard.nextInt();
                    }
                    System.out.print("Enter the new grade: ");
                    grade = mykeyboard.next().toUpperCase();
                    mapGrade.replace(mapStudent.get(id), grade);
                    break;
                // print the map (studentGrade) sorted by value
                // create a temporary TreeMap to sort the map (studentGrades) then print it out
                case 'p':
                    //Map<Integer, Student> sortedMapStudent = new TreeMap<>(mapStudent);
                    Map<Student, String> sortedMapGrade =  new TreeMap<>(mapGrade);
                    for (Student std : sortedMapGrade.keySet())
                        System.out.println(std.toString() + sortedMapGrade.get(std));
                    break;
                default:
                    break;
            }

        } while (userChoice != 'q');

    }
}
