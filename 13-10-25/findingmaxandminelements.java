package Array;


public class MaxMinElements {

    
    public static int[] findMinMax(int[] arr) {
       
        if (arr == null || arr.length == 0) return new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};

        int minVal = arr[0];
        int maxVal = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return new int[]{maxVal, minVal}; 
    }

    public static void main(String[] args) {
        int[] data = {100, 4, 34, 1, 999, 55};
        int[] result = findMinMax(data);
        System.out.println("Max Element: " + result[0]);
        System.out.println("Min Element: " + result[1]);
    }
}
