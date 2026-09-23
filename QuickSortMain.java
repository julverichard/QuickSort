/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sort;

import static Sort.QuickSort.quickSort;

/**
 *
 * @author User
 */
public class QuickSortMain {
    public static void main(String[] args) {

        int[] arr = {40, 10, 30, 50, 20, 60, 15};

        System.out.println("Before Quick Sort:");

        for (int number : arr) {
            System.out.print(number + " ");
        }

        // Call Quick Sort
        quickSort(arr, 0, arr.length - 1);

        System.out.println("\n\nAfter Quick Sort:");

        for (int number : arr) {
            System.out.print(number + " ");
        }
    
}
}
