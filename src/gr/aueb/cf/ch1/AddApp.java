package gr.aueb.cf.ch1;

/**
 * Calculates the sum of two integers
 * and the result is printed at console
 * (standard output)
 */
public class AddApp {

    public static void main(String[] args) {
        //declaration and initialization of variables
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        //Commands
        result = num1 + num2;

        //Print result
        System.out.println("Το αποτέλεσμα είναι " + result);
        System.out.printf("Το άθροισμα των %d , %d είναι ίσο με : %d", num1 , num2 , result);
    }
}
