package gr.aueb.cf.ch4;

public class ArrayInit {

    public static void main(String[] args) {
        int [] arr = new int[3]; //declare and initialization
        int [] arr2 = {1, 2, 3, 4, 5 }; //unsized initialization
        int [] arr3 = new int [] {1, 2, 3, 4, 5 }; //array initialization

        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        for ( int i = 0 ; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int el : arr3) { //enhanced for loop
            System.out.print(el + " ");
        }
    }
}
