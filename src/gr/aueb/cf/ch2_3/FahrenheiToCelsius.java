package gr.aueb.cf.ch2_3;

import java.util.Scanner;

/**
 * Calculate Fahrenheit degrees to Celsius
 */
public class FahrenheiToCelsius {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputFahrenheit = 0;

        while (inputFahrenheit >= 0) {

            System.out.println("Please enter Fahrenheit degrees.");
            inputFahrenheit = scanner.nextInt();
            int celsius = 5 * (inputFahrenheit - 32) / 9;

            System.out.printf("%d degrees Fahrenheit converts to %d degrees Celsius.\n", inputFahrenheit, celsius);
        }
    }
}
