/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchingSorting;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class MergeSort {

    private static void merging(int[] a, int f, int l, int mid) {

        int s1 = mid - f + 1;
        int s2 = l - mid;

        int[] L = new int[s1];
        int[] R = new int[s2];

        for (int i = 0; i < s1; i++) {
            L[i] = a[f + i];
        }

        for (int i = 0; i < s2; i++) {
            R[i] = a[mid + 1 + i];
        }

        // Initial indexes of first and second subarrays 
        int i = 0, j = 0;

        // Initial index of merged subarry array 
        int k = f;
        while (i < s1 && j < s2) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < s1) {
            a[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < s2) {
            a[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {

        if (low < high) {
            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merging(arr, low, high, mid);
        }
    }

    public static void main(String[] args) {

        int[] array = {9, 4, 3, 6, 7, 1, 2, 11, 5};

        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
        mergeSort(array, 0, array.length - 1);

        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
