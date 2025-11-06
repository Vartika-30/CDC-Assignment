package Array;

/**
 * DSA Practice Sheet: Array II (13/10/2025)
 * Problem: Find element in an array
 */
public class FindElement {

    
    public static int findElement(int[] arr, int target) {
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; 
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] data = {5, 8, 2, 9, 1};
        int target = 9;
        int index = findElement(data, target);
        System.out.println("Element " + target + " found at index: " + index);
    }
}
