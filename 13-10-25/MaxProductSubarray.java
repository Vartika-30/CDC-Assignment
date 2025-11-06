package Array;


public class MaxProductSubarray {

    
    public static int maxProductSubarray(int[] nums) {
        if (nums.length == 0) return 0;

        int overall_max = nums[0];
        int current_max = nums[0];
        int current_min = nums[0]; 

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            
          
            int temp_max = current_max; 
            
         
            current_max = Math.max(num, Math.max(temp_max * num, current_min * num));
            
    
            current_min = Math.min(num, Math.min(temp_max * num, current_min * num));

            overall_max = Math.max(overall_max, current_max);
        }
        return overall_max;
    }

    public static void main(String[] args) {
        int[] data = {2, 3, -2, 4, -1}; 
        int result = maxProductSubarray(data);
        System.out.println("Maximum Product Subarray: " + result);
    }
}
