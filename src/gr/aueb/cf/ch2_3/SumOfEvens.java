package gr.aueb.cf.ch2_3;

import java.util.Scanner;

/**
 * User gives a number limit and the program calculates the sum of all even numbers up to that limit.
 */
public class SumOfEvens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Please insert limit");
        input = scanner.nextInt();

        while (i <= input) {
            sum += i;
            i += 2;
        }
        System.out.println("The sum of even numbers up to " + input + " is " + sum);
    }
}
