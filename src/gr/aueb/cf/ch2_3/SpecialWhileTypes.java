package gr.aueb.cf.ch2_3;

import java.util.Scanner;

public class SpecialWhileTypes {

    public static void main(String[] args) {
        int i = 1;
        Scanner in = new Scanner(System.in);
        int num;

        while ((num = in.nextInt()) <= 0);

        while (i < 1) {
            System.out.println("Never gets in.");
            i++;
        }

        while (i <= 1) {
            System.out.println("Will execute one time.");
            i++;
        }

        while (true) {
            System.out.println("Eternal Loop.");
        }
    }
}
