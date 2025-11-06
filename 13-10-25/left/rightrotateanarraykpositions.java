package Array;


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
        // Brute-force would be O(k*n) or O(n) space using a temp array.
        if (arr == null || arr.length == 0) return;
        int n = arr.length;
        k = k % n; // Effective rotations

        
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
