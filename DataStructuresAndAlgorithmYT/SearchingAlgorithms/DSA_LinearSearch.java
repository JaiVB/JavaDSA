package DataStructuresAndAlgorithmYT.SearchingAlgorithms;

public class DSA_LinearSearch {

    /*
     * Runtime Complexity O(n)
     *  Disadvantages
     *  - Slow for large data sets
     * 
     *   Advantages
     *   - Fast for searches of small to medium data sets
     *   - Does not need to be sorted
     *   - Useful for data structures that do not have random access (LinkedList)

     */
    
    public static void main(String[] args) {
        
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};
	    int index = linearSearch(array, 1);
        System.out.println(index);
    }

    private static int linearSearch(int[] array, int value) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
