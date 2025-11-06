package Array;


public class KadanesAlgorithm {

    
    public static int maxSubArraySum(int[] arr) {
       
        if (arr.length == 0) return 0;
        
        int max_so_far = arr[0];
        int current_max = arr[0];

        for (int i = 1; i < arr.length; i++) {
       
            current_max = Math.max(arr[i], current_max + arr[i]);
            
            max_so_far = Math.max(max_so_far, current_max);
        }
        return max_so_far;
    }

    public static void main(String[] args) {
        int[] data = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; 
        int result = maxSubArraySum(data);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}
