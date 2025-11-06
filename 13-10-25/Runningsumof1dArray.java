package Array;


public class RunningSum {

    public static int[] runningSum(int[] nums) {
        // Brute-force would use O(n) space by creating a new array.
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4};
        int[] result = runningSum(data);
        System.out.println("Running Sum Array: " + java.util.Arrays.toString(result));
    }
}
