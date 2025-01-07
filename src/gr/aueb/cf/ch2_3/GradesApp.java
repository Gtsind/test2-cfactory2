package gr.aueb.cf.ch2_3;

import java.util.Scanner;

/**
 * User gives total grades and number of courses. The program will calculate the average grade and will
 * characterize as "Excellent" if average >= 9 , "Very good" if average >= 7 , "Good" if
 * average = >= 5 and "Fail" if average is <=5.
 */
public class GradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = 0;
        int courses = 0;
        int average = 0;

        System.out.println("Please enter total grades:");
        grade = scanner.nextInt();

        if (grade <= 0) {
            System.out.println("Total grades must not be zero or negative.");
            System.exit(1);
        }

        System.out.println("Please enter total courses count:");
        courses = scanner.nextInt();

        if (courses <= 0) {
            System.out.println("Courses count must not be zero or negative.");
            System.exit(1);
        }

        average = grade / courses;

        if (average > 10) {
            System.out.println("Error. The average must be less than or equal than 10.");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent");
        } else if (average >= 7) {
            System.out.println("Very good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else {
            System.out.println("Failed.");
        }
    }
}
