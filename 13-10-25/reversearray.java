package Array;


public class ReverseArray {

    
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    
    public static void reverseArray(int[] arr) {
        
        reverse(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        System.out.println("Original Array: " + java.util.Arrays.toString(data));
        reverseArray(data);
        System.out.println("Reversed Array: " + java.util.Arrays.toString(data));
    }
}
