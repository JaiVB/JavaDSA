package DataStructuresAndAlgorithmYT.SortingAlgorithms;

public class DSA_QuickSort {
    /*
     * Quick Sort
     * - Moves smaller elements to the left of a pivot
     * - Recusively divides array into 2 partitions
     * 
     * Run Time Complexity = Best Case    O(n log(n))
     *                     = Average Case O(n log(n))
     *                     = Worst Case   O(n^2) IF ALREADY SORTED
     * 
     * Space Complexity    = O(log(n)) DUE TO RECURSION
     */


    public static void main(String[] args) {
        
        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};

        quickSort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        
        if(end <= start) return;// base case
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot +  1, end);

    }
    // Helper Method ^^^^^^^
    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j <= end - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;


        return i; // Location of the pivot
    }
}
