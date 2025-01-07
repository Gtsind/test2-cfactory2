package gr.aueb.cf.ch2_3;

import java.util.Scanner;

/**
 * Reverses a given integer.
 */
public class ReverseAnInt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int reversed = 0;
        int digit = 0;

        System.out.println("Enter a positive int");
        input = scanner.nextInt();

        while (input != 0) {
            digit = input % 10;
            reversed = reversed * 10 + digit;
            input /=10;
        }

        System.out.println("The reversed number is : " + reversed);

    }
}
