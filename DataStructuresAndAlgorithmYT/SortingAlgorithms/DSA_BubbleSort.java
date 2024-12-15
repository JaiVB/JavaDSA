package DataStructuresAndAlgorithmYT.SortingAlgorithms;

public class DSA_BubbleSort {
    public static void main(String[] args) {
        
        int array[] = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        bubbleSort(array);
        for(int i : array) {
            System.out.print(i);
        }
    }

    /*
     * Pairs of adjecent elements are compared, and the elements are
     * swapped if they are not in order
     * 
     * Run Time Complexity = Quadratic time O(n^2)
     * Small Data Set = Okay-ish
     * Large Data Set = BAD (DO NOT USE)
     */
    public static void bubbleSort(int array[]) {

        //Loops through the array
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++){
            
                /*
                 * Checks if the value in the array is 
                 * Greater than or Less than depending if its 
                 * Descending or Ascending
                 */
                // Ascending =  <
                // Descending = > 
                if(array[j] > array[j + 1]) { 

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    
}
