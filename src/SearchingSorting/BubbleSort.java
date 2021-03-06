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
            for (int j = 0; j < size - i - 1; j++) {// this loop is for element of array at that index
                // To sort in descending order, change > to < in this line.
                if (array[j] > array[j + 1]) {//14 > 9 
                    // Swap if greater
                    int temp = array[j];// temp = 14
                    array[j] = array[j + 1];// array[j] = 9
                    array[j + 1] = temp;// array[j+1] = 14
                }
            }
        }
        sortArray(Arrays.toString(array));

    }
}
