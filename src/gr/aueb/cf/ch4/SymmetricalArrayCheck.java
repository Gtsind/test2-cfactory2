package gr.aueb.cf.ch4;

public class SymmetricalArrayCheck {

    public static void main(String[] args) {

    }

    public static boolean isArraySymmetrical (int[] arr) {

        for (int i = 0; i < arr.length / 2 ; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] mapToDouble(int[] arr) {

        int[] arrDouble = new int[arr.length] ;

        for(int i = 0 ; i < arr.length ; i++) {
            arrDouble[i] = arr[i] * 2;
        }
        return arrDouble;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double average(int[] arr) {
        int sum = 0;

        for(int i = 0 ; i < arr.length ; i++) {
            sum += arr[i];

        }
        double average = (double) sum / arr.length;
        return average;
    }

    public static boolean moreThanTwoConsecutive(int[] arr) {

        int consecutiveCount = 0;

        for (int i = 0; i < arr.length - 2 ; i++) {
            if(arr[i] == arr[i+1] - 1 && arr[i] == arr[i+2] - 2) {
                consecutiveCount++;
                break;
            }
        }
        return consecutiveCount >= 1;
    }

    public static boolean AllAreEven(int[] arr) {
        boolean allEven = false;
        int count = 0;

        for (int el : arr) {
            if (el % 2 == 0) count++;
        }
        return count == arr.length;
    }
}
