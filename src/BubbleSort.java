/**
 * BubbleSort.java
 * @author Euan Watkins
 * @version 1.0
 */

public class BubbleSort {
    /**
     * Compares successive pairs of items and swaps if unsorted.
     * @param array Array to sort.
     * @return Sorted array.
     */
    public int[] bubbleSort(int[] array) {
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
        return array;
    }
}
