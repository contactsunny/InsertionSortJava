package com.contactsunny.poc.insertionsort;

public class App {

    public static void main(String[] args) {
        int[] array = {29, 10, 14, 37, 13, 2, 100};
        System.out.println("Original Array: ");
        printArray(array);
        System.out.println("-------------------------");

        insertionSort(array);

        System.out.println("Sorted Array: ");
        printArray(array);
        System.out.println("-------------------------");
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Method to perform insertion sort on the given array.
     *
     * @param array Given unsorted array.
     */
    private static void insertionSort(int[] array) {
        if (array.length > 0) {
            // Starting the iteration from the 1st item instead of the 0th item,
            // as that will be covered by the minPointer index.
            for (int arrayIndex = 1; arrayIndex < array.length; arrayIndex++) {
                // Creating a temp variable with array[index]'s value for comparison
                int temp = array[arrayIndex];
                // Starting minPointer from one index behind index. So it'll start from 0.
                int minPointer = arrayIndex - 1;
                // Looping backwards from the current index until we reach the 0th element.
                // If the element behind the current element is less than the current element,
                // swapping the two. Continuing the loop backwards until we reach 0th element.
                while (minPointer >= 0 && temp < array[minPointer]) {
                    // Swapping the two elements
                    array[minPointer + 1] = array[minPointer];
                    array[minPointer] = temp;
                    // Decrementing the min pointer.
                    minPointer--;
                }
            }
        }
    }
}
