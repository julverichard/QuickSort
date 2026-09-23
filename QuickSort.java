/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sort;

/**
 *
 * @author User
 */
public class QuickSort {

    // Partition function
    static int partition(int[] arr, int left, int right) {

        int pivot = arr[right];

        int leftPointer = left;
        int rightPointer = right - 1;

        while (true) {

            // Move left pointer while value is less than pivot
            while (leftPointer <= rightPointer && arr[leftPointer] < pivot) {
                leftPointer++;
            }

            // Move right pointer while value is greater than pivot
            while (rightPointer >= leftPointer && arr[rightPointer] > pivot) {
                rightPointer--;
            }

            // If pointers meet or cross
            if (leftPointer >= rightPointer) {
                break;
            } else {
                // Swap values
                int temp = arr[leftPointer];
                arr[leftPointer] = arr[rightPointer];
                arr[rightPointer] = temp;
            }
        }

        // Swap pivot with left pointer
        int temp = arr[leftPointer];
        arr[leftPointer] = arr[right];
        arr[right] = temp;

        return leftPointer;
    }

    // Quick Sort function
    static void quickSort(int[] arr, int left, int right) {

        // Base condition
        if (right - left <= 0) {
            return;
        }

        // Partition the array
        int pivotIndex = partition(arr, left, right);

        // Quick sort left partition
        quickSort(arr, left, pivotIndex - 1);

        // Quick sort right partition
        quickSort(arr, pivotIndex + 1, right);
    }

    // Main method
    
    }


