package sec2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E15_4 {

    public static void main(String[] args) {
                Scanner mykeyboard = new Scanner(System.in);
                char userChoice;
                String name, grade;


                // story the <Name, Grade> of students
                Map<String, String> studentGrades = new HashMap<>();
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
                        // Get the name and grade from the user then add them to the map(studentGrade)
                        case 'a':
                            System.out.print("Enter student name: ");
                            name = mykeyboard.next();
                            System.out.print("Enter student grade: ");
                            grade = mykeyboard.next().toUpperCase();
                            studentGrades.put(name, grade);
                            break;
                        // Get the name of the student to be removed then remove it
                        case 'r':
                            System.out.print("Enter student name: ");
                            name = mykeyboard.next();
                            while (!studentGrades.containsKey(name)){
                                System.out.print("name not found, please enter a valid: ");
                                name = mykeyboard.next();
                            }
                            studentGrades.remove(name);
                            break;
                        // get the name of the student and the updated grade then use the replace method to modify the value
                        case 'm':
                            System.out.print("Enter student name: ");
                            name = mykeyboard.next();
                            while (!studentGrades.containsKey(name)){
                                System.out.print("name not found, please enter a valid: ");
                                name = mykeyboard.next();
                            }
                            System.out.print("Enter the new grade: ");
                            grade = mykeyboard.next().toUpperCase();
                            studentGrades.replace(name, grade);
                            break;
                        // print the map (studentGrade) sorted by value
                        // create a temporary TreeMap to sort the map (studentGrades) then print it out
                        case 'p':
                            Map<String, String> sortedMap = new TreeMap<>(studentGrades);
                            for (String key : sortedMap.keySet())
                                System.out.println(key + ": " + sortedMap.get(key));
                            break;
                        default:
                            break;
                    }

        } while (userChoice != 'q');

    }
}
