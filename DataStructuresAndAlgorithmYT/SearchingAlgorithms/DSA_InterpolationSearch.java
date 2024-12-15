package DataStructuresAndAlgorithmYT.SearchingAlgorithms;

public class DSA_InterpolationSearch {
    /*
- Better binary searches 
- Best used uniformly distributed data
- Guesses where a value might be based on calculated probe results if probe  is incorrect, search area is narrowed

- **If the probe is incorrect, we narrow the search and try again**

- Average Case: O(log(log(n)))
- worst case: O(n) - values(that are being searched) increase exponentially 
*/
    public static void main(String[] args) {
        

        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        int index = interpolationSearch(array, 256);
        if(index != -1) {
            System.out.println("Element found at index: "+ index);
        }
        else {
            System.out.println("Element not found");
        }
    }

    private static int interpolationSearch(int[] array, int value) {

        int high = array.length - 1;
        int low = 0;
        // Checks that value is Still in between the low and high of the Search
        while (value >= array[low] && value <= array[high] && low <= high) {
            // Guesses Value based on the uniformally distributed data
            int probe = low + (high - low) * (value - array[low]) /
                        (array[high] - array[low]);


            System.out.println("probe: " + probe);

            // Checks if the Value was Found in the Current Guess array[probe]
            if (array[probe] == value) {
                return probe;
            }
            // if the Guess(probe) was to low it Disregards the Lower portion of the array
            /*
                EX.
                array = {1, 2, 3, 4, 5, 6, 7, 8}  
                value We're Looking For = 5
                Guess aka probe = 4
                then this disregards the lower portion of the array in the next search

            */ 
            else if(array[probe] < value) {
                low = probe + 1;
            }
            /*
             * Same as the one above but Disregards the Higher portion of the array
             */
            else {
                high = probe - 1;
            }

        }
        // if it is not found it returns -1
        return -1;
    }

}
