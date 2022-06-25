/**
 * SelectionSort.java
 * @author Euan Watkins
 * @version 2.1
 */

public class SelectionSort extends Sort {
    /**
     * Selection sort goes through each item one by one finding the
     * next smallest.
     * @param array The array to be sorted.
     * @return The sorted array.
     */
    @Override
    public int[] sort(int[] array) {
        // Compare every item that comes after it.
        for (int i = 0; i < array.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                // Store the index of the smallest item.
                if (array[j] < array[i]) {
                    minIndex = j;
                }
            }
            // Swap the item at the stored index with the currntly observed item.
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        // Check if the array has been sorted, notify the user of the outcome.
        if (isSorted(array)) {
            System.out.println("\nCompleted Selection Sort Successfully");
        } else {
            System.out.println("\nError while sorting array");
        }
        return array;
    }

}
