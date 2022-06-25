# JavaSortingAlgorithms
This code implements three sorting algorithms using Java; selection sort, insertion sort, and bubble sort. The Sort class is the parent class wich the other three inherit from. 
- The sort() method is abstract, this is where the unique sorting algorithms are implemented in each class. It takes an integer array as a parameter. 
- The isSorted() method is accessible by the three subclasses and will return true if the array passed in as a parameter is sorted and false if not.
- Each sorting algorithm method will output to the screen whether the sort was successful or not and also return the array.

## Selection Sort
This sorting algorithm compares every item in the array to every other item and notes down the smallest each time. It will then place the smallest item at the index of the item that it was being compared to (for example, if it was the first iteration it would be placed at index 0). It will then move on to the next item and repeat until every item has been iterated over, which means the array is sorted.

Complexity: O(n^2)

## Insertion Sort
This sorting algorithm first creates a new empty array. It will then iterate over the original array to find the smallest item and insert this item into the new array. This is repeated until all items have been inserted into the original array.

Complexity: O(n^2)

## Bubble Sort
This sorting algorithms compares successive pairs of items in the array and swaps them wherever they are unsorted. If a swap occurs during an iteration, it will go through the array again to compare all of the elements. It will continue until no swaps occur in an iteration, which means the array is sorted.

Complexity: O(n^2)
