package Array;


public class EquilibriumElement {

   
    public static int findEquilibriumIndex(int[] nums) {
        
        if (nums == null || nums.length == 0) return -1;

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
           
            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] data = {1, 7, 3, 6, 5, 6}; 
        int index = findEquilibriumIndex(data);
        System.out.println("Equilibrium Index: " + index);
    }
}
