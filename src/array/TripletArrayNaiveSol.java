/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class TripletArrayNaiveSol {

// Function to find a maximum product of a triplet in array of integers of size n 
    static int maxProduct(int[] arr, int n) {

        // if size is less than 3, no triplet exists 
        if (n < 3) {
            return -1;
        }
        // will contain max product 
        int max_product = Integer.MIN_VALUE;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    max_product = Math.max(max_product,
                            arr[i] * arr[j] * arr[k]);
                }
            }
        }
        return max_product;
    }

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int[] arr = {2, 10, 4, 6, 20, 1, 9};
        int n = arr.length;;

        int max = maxProduct(arr, n);

        if (max == -1) {
            System.out.println("No Triplet Exists");
        } else {
            System.out.println("Maximum product is " + max);
        }
    }
}
