package Array;

/**
 * DSA Practice Sheet: Array I (13/10/2025)
 * Problem: Left/right rotate an array by k positions (Assuming Left Rotate here)
 */
public class RotateArrayByK {

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    
    public static void rotateLeft(int[] arr, int k) {
        
        if (arr == null || arr.length == 0) return;
        int n = arr.length;
        k = k % n; 

        
        reverse(arr, 0, k - 1); 
        
        reverse(arr, k, n - 1); 
      
        reverse(arr, 0, n - 1); 
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        int k = 2;
        System.out.println("Original Array: " + java.util.Arrays.toString(data));
        rotateLeft(data, k);
        System.out.println("Array Rotated Left by " + k + ": " + java.util.Arrays.toString(data));
    }
}
