/**
 * BubbleSort.java
 * @author Euan Watkins
 * @version 2.0
 */

public class BubbleSort extends Sort{
    /**
     * Compares successive pairs of items and swaps if unsorted.
     * @param array Array to sort.
     * @return Sorted array.
     */
    public void sort(int[] array) {
        // For every item, compare every successive pair of items.
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-i-1; j++) {
                // If the item is greater than the next one, swap them.
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[i+1];
                    array[j+1] = temp;
                }
            }
        }
        // Check if the array has been sorted, notify the user of the outcome.
        if (isSorted(array)) {
            System.out.println("\nCompleted Bubble Sort Successfully");
        } else {
            System.out.println("\nError while sorting array");
        }
    }
}
