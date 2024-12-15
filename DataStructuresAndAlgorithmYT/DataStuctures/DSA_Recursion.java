package DataStructuresAndAlgorithmYT.DataStuctures;

public class DSA_Recursion {
    public static void main(String[] args) {
        
        // walk(5);

        System.out.println("factorial is " + factorial(7));
        
        System.out.println("power is " + power(2, 8));
    }

    /*      Recursion
     * - When a thing is defined in terms of itself
     * - Apply the result of a procedure, to a procedure
     * - Divide a problem into sub-problems of the same type as the orginal
     * - Commonly used with advanced sorting algorithms and navigating trees
     *          
     * Advantages
     * - easier to read/write
     * - easier to debug
     * 
     * Disadvantages
     * - sometimes slower
     * - uses more memory
    */

    private static int factorial(int num) {
        
        if(num < 1) return 1; //base case

        return num * factorial(num - 1);
    }

    private static int power(int base, int exponent) {
        
        if(exponent < 1) return 1;
        return base * power(base, exponent - 1);
    }







    // private static void walk(int steps) {
        
    //     // Iteration
    //     // for(int i = 0; i < steps; i++){
    //     //     System.out.println("You take a step!");
    //     // }

    //     if(steps < 1) return;
    //     System.out.println("You take a step!");
    //     walk(steps - 1);


    // }
}
