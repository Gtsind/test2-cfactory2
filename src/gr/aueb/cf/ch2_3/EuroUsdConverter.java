package gr.aueb.cf.ch2_3;

import java.util.Scanner;

/**
 * Converts Euros to Dollars with a fixed exchange rate of 99 cents = 1 euro
 */
public class EuroUsdConverter {

    public static void main(String[] args) {

        //Declaration / initialization
        double euroAmount = 0;
        double exchangeRate = 0.99;
        double dollarAmount = 0;
        Scanner scanner = new Scanner(System.in);

        //Commands
        System.out.println("Please enter the amount in euros.");
        euroAmount = scanner.nextDouble();
        dollarAmount = euroAmount * exchangeRate;

        //Print results
        System.out.println("The amount of " + euroAmount + " euros is " + dollarAmount + " dollars");
    }
}
