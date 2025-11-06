package Array;

import java.util.ArrayList;
import java.util.List;


public class UnionIntersectionSorted {

   
    public static List<Integer> findUnion(int[] arr1, int[] arr2) {
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length || j < arr2.length) {
           
            while (i > 0 && i < arr1.length && arr1[i] == arr1[i - 1]) i++;
          
            while (j > 0 && j < arr2.length && arr2[j] == arr2[j - 1]) j++;

            if (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    union.add(arr1[i++]);
                } else if (arr2[j] < arr1[i]) {
                    union.add(arr2[j++]);
                } else { 
                    union.add(arr1[i]);
                    i++; j++;
                }
            } else if (i < arr1.length) {
                union.add(arr1[i++]);
            } else if (j < arr2.length) {
                union.add(arr2[j++]);
            }
        }
        return union;
    }
    
   
    public static List<Integer> findIntersection(int[] arr1, int[] arr2) {
        List<Integer> intersection = new ArrayList<>();
        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr1[i]) {
                j++;
            } else { 
                intersection.add(arr1[i]);
                i++;
                j++;
                
                while (i < arr1.length && arr1[i] == arr1[i - 1]) i++;
                while (j < arr2.length && arr2[j] == arr2[j - 1]) j++;
            }
        }
        return intersection;
    }


    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 5, 6};
        
        System.out.println("Union: " + findUnion(arr1, arr2)); // Expected: [1, 2, 3, 4, 5, 6]
        System.out.println("Intersection: " + findIntersection(arr1, arr2)); // Expected: [2, 4]
    }
}
