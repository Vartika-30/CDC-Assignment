package Array;

import java.util.HashMap;
import java.util.Map;

oblem: Count elements with maximum frequency (Sum of frequencies of max-frequent elements)
 */
public class MaxFrequencyCount {

    
    public static int countMaxFrequencyElements(int[] nums) {
      
        Map<Integer, Integer> freqMap = new HashMap<>();
        int maxFreq = 0;

        
        for (int num : nums) {
            int currentFreq = freqMap.getOrDefault(num, 0) + 1;
            freqMap.put(num, currentFreq);
            maxFreq = Math.max(maxFreq, currentFreq);
        }

                int count = 0;
        for (int freq : freqMap.values()) {
            if (freq == maxFreq) {
                count += maxFreq;
            }
        }
        return count; 
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 2, 3, 1, 4}; 
        int result = countMaxFrequencyElements(data);
        System.out.println("Sum of Max Frequency Elements: " + result);
    }
}
