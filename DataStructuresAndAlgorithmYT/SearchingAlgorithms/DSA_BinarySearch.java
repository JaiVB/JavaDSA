package DataStructuresAndAlgorithmYT.SearchingAlgorithms;

public class DSA_BinarySearch {
    

    public static void main(String[] args) {
        int array[] = new int[100];
        int target = 1;

        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        int index = binarySearch(array, target);

        if(index == -1) {
            System.out.println(target + " not found");
        }
        else System.out.print(target + " FOUND");
    }

    private static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;
    
        while (low <= high) {
            // Finding Middle
            int middle = low + (high - low) /2;	
            int value = array[middle];
    
            // setting new Low
            if (value < target) low = middle + 1;
            
            // Setting New High
            else if (value > target) high = middle + 1;
    
            // Target Found
            else return middle;

            System.out.println(middle);
            
        }
        // Target Not Found
        return -1;
    }
}
