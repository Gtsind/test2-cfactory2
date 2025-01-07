package gr.aueb.cf.ch2_3;

import java.util.Scanner;

/**
 * Checks if someone is eligible to vote.
 */
public class VoteEligible {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = 0;
        final int VOTING_AGE = 18;
        boolean isElibible = false;

        System.out.println("Please enter your age.");

        age = scanner.nextInt();

        isElibible = age >= VOTING_AGE;

        System.out.printf("You are %d. Are you eligible to vote? %b", age , isElibible);
    }
}
