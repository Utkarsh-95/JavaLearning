/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class Secondlargestelementwith1loop {

    /* Function to print the second largest elements */
    public static void print2largest(int arr[], int arr_size) {
        int i, firstMax, secondMax;

        /* There should be atleast two elements */
        if (arr_size < 2) {
            System.out.print(" Invalid Input : There should be atleast two elements");
            return;
        }
        firstMax = secondMax = Integer.MIN_VALUE;
        for (i = 0; i < arr_size; i++) {
            /* If current element is smaller than first then update both first and second */
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                /* If arr[i] is in between first and second then update second */
                secondMax = arr[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.print("There is no second largest element\n");
        } else {
            System.out.print("The second largest element is " + secondMax);
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 35, 1, 10, 34, 1};
        int n = arr.length;
        print2largest(arr, n);
        System.out.println();
    }
}
