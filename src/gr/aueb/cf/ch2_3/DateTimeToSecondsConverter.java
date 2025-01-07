package gr.aueb.cf.ch2_3;

import java.util.Scanner;

/**
 * Converts days , hours , minutes and seconds to total seconds.
 * User provides the data and the final result is printed.
 */
public class DateTimeToSecondsConverter {

    public static void main(String[] args) {

        //Declaration/initialization
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int finalSeconds = 0;
        Scanner scanner = new Scanner(System.in);

        //Commands
        System.out.println("Please enter days.");
        days = scanner.nextInt();
        System.out.println("Please enter hours.");
        hours = scanner.nextInt();
        System.out.println("Please enter minutes.");
        minutes = scanner.nextInt();
        System.out.println("Please enter seconds.");
        seconds = scanner.nextInt();

        finalSeconds = (days*24*60*60)  + (hours*60*60) + (minutes*60) + seconds;

        //Print result
        System.out.println("Total seconds are " + finalSeconds);

    }
}
