package Array;


public class RemoveDuplicatesSorted {

    
    public static int removeDuplicates(int[] arr) {
        
        if (arr.length <= 1) return arr.length;

        int writePointer = 1;
        for (int readPointer = 1; readPointer < arr.length; readPointer++) {
          
            if (arr[readPointer] != arr[readPointer - 1]) {
                arr[writePointer] = arr[readPointer];
                writePointer++;
            }
        }
        return writePointer; 
    }

    public static void main(String[] args) {
        int[] data = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(data);
        System.out.println("New Length: " + newLength);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
