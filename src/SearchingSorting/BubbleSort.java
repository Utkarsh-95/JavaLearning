/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchingSorting;

import java.util.Arrays;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class BubbleSort {

    public static void sortArray(String s) {
        System.out.println("Sorting.BubbleSort.sortArray()" + s);
    }

    public static void main(String[] args) {

        int[] array = {14, 9, 2, 7, 0, 90};
        int size = array.length;
        sortArray(Arrays.toString(array));
        for (int i = 0; i < size - 1; i++) {// this loop is for array index
            boolean swapped = true;
            for (int j = 0; j < size - i - 1; j++) {// this loop is for element of array at that index
                // To sort in descending order, change > to < in this line.
                if (array[j] > array[j + 1]) {
                    // Swap if greater is at the rear position
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = false;
                }
            }
            if (swapped == true) {
                break;
            }
        }
        sortArray(Arrays.toString(array));

    }
}
