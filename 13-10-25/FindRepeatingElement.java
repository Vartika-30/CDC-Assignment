package Array;

import java.util.HashSet;
import java.util.Set;


public class FindRepeatingElement {

   
    public static int findRepeatingElement(int[] arr) {
      
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {4, 2, 1, 3, 2, 5};
        int result = findRepeatingElement(data);
        System.out.println("The repeating element is: " + result);
    }
}
