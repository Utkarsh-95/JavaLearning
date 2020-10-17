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
public class QuickSort {

    /* This function takes last element as pivot, 
	places the pivot element at its correct 
	position in sorted array, and places all 
	smaller (smaller than pivot) to left of 
	pivot and all greater elements to right 
	of pivot */
    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element 
        for (int j = low; j < high; j++) {
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) {
                i++;

                // swap arr[i] and arr[j] 
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    /* The main function that implements QuickSort() 
	arr[] --> Array to be sorted, 
	low --> Starting index, 
	high --> Ending index */
    void sort(int arr[], int low, int high) {//arr, 0, 2
        if (low < high) {
            /* pi is partitioning index, arr[pi] is 
			now at right place */
            int pivot = partition(arr, low, high);

            // Recursively sort elements before partition and after partition 
            sort(arr, low, pivot - 1);
            sort(arr, pivot + 1, high);
        }
    }

    public static void main(String args[]) {
        int arr[] = {2, 10, 4};
        int size = arr.length;

        QuickSort qs = new QuickSort();
        qs.sort(arr, 0, size - 1);

        System.out.println("Sorted array : " + Arrays.toString(arr));
    }
}
