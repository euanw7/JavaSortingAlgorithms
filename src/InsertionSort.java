/**
 * InsertionSort.java
 * @author Euan Watkins
 * @version 1.0
 */

public class InsertionSort {
    /**
     * Finds the smallest item and inserts into a new array.
     * Repeats until original array is empty.
     * @param array The array to be sorted.
     * @return The new sorted array.
     */
    public int[] insertionSort(int[] array) {
        // Creates a new empty array of the same length as the original.
        int[] sortedArray = new int[array.length];
        // Compare every item in the original array with every other item.
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                // Store the index of the smallest item.
                if (array[j] < array[i]) {
                    minIndex = j;
                }
            }
            // Add the smallest item to the new array.
            // Repeat until all items have been moved over.
            sortedArray[i] = array[minIndex];
        }
        return sortedArray;
    }
}
