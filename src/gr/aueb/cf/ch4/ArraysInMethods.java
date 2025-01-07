package gr.aueb.cf.ch4;

public class ArraysInMethods {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
        System.out.println();
        printArray(arr, 1, 4);

    }

    public static void printArray(int[] arr) {
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    //overloaded printArray
    public static void printArray(int[] arr, int low, int high) {
        if (low < 0 || high > arr.length -1) {
            return;
        }
        for (int i = low ; i <= high ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
