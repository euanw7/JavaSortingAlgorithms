/**
 * Sort.java
 * @author Euan Watkins
 * @version 1.1
 */

/**
 * This absract class will be used to implement various sorting algorithms.
 */
public abstract class Sort {

    // Here is where the various algorithms will be implemented.
    public abstract int[] sort(int[] array);

    /**
     * This method is used at the end of an algorithm to check whether
     * the array has been sorted properly.
     * @param array The integer array that has been through a sorting algorithm.
     * @return Boolean true if the array has been sorted correctly, false otherwise.
     */
    protected boolean isSorted(int[] array) {
        // If the array only has one integer in it, it is sorted.
        if (array.length == 1) {
            return true;
        }
        // Check if any items in the array are larger than the one after it.
        // If there is one, return false because it's not sorted correctly.
        for (int i = 0; i > array.length-1; i++) {
            if (array[i] < array[i+1]) {
                return false;
            }
        }
        // If no integers are out of order the array is sorted so return true.
        return true;
    }
    
}
