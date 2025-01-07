package gr.aueb.cf.ch2_3;

import java.util.Scanner;

/**
 * Show a menu at least once.
 */
public class MenuDoWhile {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int choice ;

        do {
            System.out.println("Please select one.");
            System.out.println("Insert.");
            System.out.println("Delete.");
            System.out.println("Quit.");
            choice = in.nextInt();

        } while (choice != 3);

        System.out.println("Goodbye!");
    }
}
