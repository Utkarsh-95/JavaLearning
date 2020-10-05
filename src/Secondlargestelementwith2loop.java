/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class Secondlargestelementwith2loop {

    static void print2largest(int arr[], int arr_size) {
        int i, first, second;

        // There should be atleast two elements 
        if (arr_size < 2) {
            System.out.printf(" Invalid Input ");
            return;
        }

        int largest = second = Integer.MIN_VALUE;

        // Find the largest element 
        for (i = 0; i < arr_size; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // Find the second largest element 
        for (i = 0; i < arr_size; i++) {
            if (arr[i] != largest) {
                second = Math.max(second, arr[i]);
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.printf("There is no second "
                    + "largest element\n");
        } else {
            System.out.printf("The second largest "
                    + "element is %d\n", second);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n = arr.length;

        print2largest(arr, n);
    }
}
