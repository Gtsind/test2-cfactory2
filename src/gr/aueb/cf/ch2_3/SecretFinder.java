package gr.aueb.cf.ch2_3;

import java.util.Scanner;

public class SecretFinder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Insert a number to guess the secret");
        num = scanner.nextInt();

        if (num == SECRET) {
            System.out.println("Secret found!!");
        } else {
            System.out.println("Failure!");
        }
    }
}