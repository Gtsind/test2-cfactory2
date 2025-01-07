package gr.aueb.cf.ch4;

public class ArrayMinMax {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

    }

    public static int getMinPosition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int minPosition = 0;
        int minValue = arr[minPosition];

        for (int i = 0 ;i < arr.length; i++) {
            if (arr[i] < minValue) {
                minPosition = i;
                minValue = arr[i];
            }
        }
        return minPosition;
    }

    public static int getMaxPosition(int[] arr) {
        if (arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = 0 ;i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}