/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class TripletArrayOofnLogNSol {

    static int maxProduct(int arr[], int n) {
        // if size is less than 3, no triplet exists 
        if (n < 3) {
            return -1;
        }

        // Sort the array in ascending order 
        Arrays.sort(arr);

        // Return the maximum of product of last three 
        // elements and product of first two elements 
        // and last element 
        return Math.max(arr[0] * arr[1] * arr[n - 1],
                arr[n - 1] * arr[n - 2] * arr[n - 3]);
    }

// Driver program to test above functions 
    public static void main(String[] args) {
        int arr[] = {2, 10, 4, 6, 20, 1, 9};
        int n = arr.length;

        int max = maxProduct(arr, n);

        if (max == -1) {
            System.out.println("No Triplet Exists");
        } else {
            System.out.println("Maximum product is " + max);
        }

    }
}
