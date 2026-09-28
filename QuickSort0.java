/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sort;

/**
 *
 * @author User
 */
import java.util.Random;

public class QuickSort0 {

    static Random random = new Random();

    // Quick Sort
    static void quickSort(int[] arr, int left, int right) {

        if (left < right) {

            System.out.println("\n================================");
            System.out.println("Sorting: " + arrayToString(arr));
            System.out.println("Range: " + left + " to " + right);

            int pivotIndex = partition(arr, left, right);

            System.out.println("Pivot is now at index " + pivotIndex);
            System.out.println("Array: " + arrayToString(arr));

            // Sort left side
            quickSort(arr, left, pivotIndex - 1);

            // Sort right side
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    // Partition using RANDOM PIVOT
    static int partition(int[] arr, int left, int right) {

        // Choose a random pivot index
        int randomIndex = left + random.nextInt(right - left + 1);

        int pivot = arr[randomIndex];

        System.out.println("\nRandom Pivot Index: " + randomIndex);
        System.out.println("Random Pivot Value: " + pivot);

        // Move random pivot to the end
        swap(arr, randomIndex, right);

        System.out.println("Move pivot " + pivot + " to the end:");
        System.out.println(arrayToString(arr));

        int i = left - 1;

        // Move through the array
        for (int j = left; j < right; j++) {

            System.out.println("\nChecking " + arr[j] +
                               " with pivot " + pivot);

            if (arr[j] < pivot) {

                i++;

                System.out.println(arr[j] + " < " + pivot);

                // Swap
                swap(arr, i, j);

                System.out.println("SWAP:");
                System.out.println(arrayToString(arr));

            } else {

                System.out.println(arr[j] + " >= " + pivot);
                System.out.println("No swap. Move to next element.");
            }
        }

        // Move pivot to its correct position
        swap(arr, i + 1, right);

        System.out.println("\nMove pivot " + pivot +
                           " to correct position:");

        System.out.println(arrayToString(arr));

        return i + 1;
    }

    // Swap method
    static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Display array
    static String arrayToString(int[] arr) {

        String result = "";

        for (int i = 0; i < arr.length; i++) {
            result += arr[i] + " ";
        }

        return result;
    }

    public static void main(String[] args) {

        int[] numbers = {40, 10, 30, 50, 20, 60, 15};

        System.out.println("================================");
        System.out.println("QUICK SORT - RANDOM PIVOT");
        System.out.println("================================");

        System.out.println("Original Array:");
        System.out.println(arrayToString(numbers));

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("\n================================");
        System.out.println("FINAL SORTED ARRAY");
        System.out.println("================================");

        System.out.println(arrayToString(numbers));
    }
}