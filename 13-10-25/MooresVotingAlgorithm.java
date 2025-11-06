package Array;


public class MooresVotingAlgorithm {

    
    public static int majorityElement(int[] nums) {
      
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        
        
        return candidate; 
    }

    public static void main(String[] args) {
        int[] data = {2, 2, 1, 1, 1, 2, 2}; 
        int result = majorityElement(data);
        System.out.println("Majority Element: " + result);
    }
}
