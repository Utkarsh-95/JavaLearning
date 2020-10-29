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
public class InsertionSort {

    public static void sortArray(String s) {
        System.out.println("Array " + s);
    }

    public static void main(String[] args) {

//        int[] sort_arr = {14, 9, 2, 7, 0, 14, 9, 2, 7, 0, 14, 9, 2, 7, 0, 14, 9, 2, 7, 0};
        int[] sort_arr = {5, 4, 3, 2, 1, 0};

//        System.out.println("By Using Collection API");
//        Arrays.sort(sort_arr);
//
//        System.out.printf("Modified arr[] : %s", Arrays.toString(sort_arr));
//        System.out.println("");
        System.out.println("By Using InsertionSort");
        int[] arr = sort_arr;
        sortArray(Arrays.toString(arr));

        for (int j = 0, size = arr.length; j < size; j++) {

            while (j > 0 && arr[j - 1] > arr[j]) {//here checking 0 index with 1
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        sortArray(Arrays.toString(arr));

    }

}
