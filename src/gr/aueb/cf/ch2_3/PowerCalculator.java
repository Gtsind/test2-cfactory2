package gr.aueb.cf.ch2_3;

import java.util.Scanner;

/**
 * Calculates b^power.
 */
public class PowerCalculator {

    public static void main(String[] args) {
        int base = 0;
        int power = 0;
        int i = 1;
        int result = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert base and power.");
        base = scanner.nextInt();
        power = scanner.nextInt();

        while (i <= power) {
            result *=base; // result = result * base;
            i++;
        }
        System.out.println("Result: " + result);
    }
}
