package gr.aueb.cf.ch2_3;

import java.util.Scanner;

/**
 * Calculates the sum of the digits of an integer.
 */
public class SumOfDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        int temp = 0;
        int rightDigit = 0;

        System.out.println("Enter a positive integer.");
        input = scanner.nextInt();

        temp = input;

        while (temp > 0) {
            rightDigit = temp % 10;
            sum += rightDigit;
            temp /= 10;
        }


        System.out.println("The sum of digits of " + input + " is " + sum);
    }
}
