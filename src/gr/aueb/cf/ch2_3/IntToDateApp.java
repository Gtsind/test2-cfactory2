package gr.aueb.cf.ch2_3;

import java.util.Scanner;

/**
 * User gives 3 integers and the program converts them to date in dd/mm/yy format.
 */
public class IntToDateApp {

    public static void main(String[] args) {
        int days = 0;
        int months = 0;
        int year = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please provide 3 integers.");
        days = scanner.nextInt();
        months = scanner.nextInt();
        year = scanner.nextInt();

        System.out.printf("%02d/%02d/%02d", days, months, year);
    }
}
