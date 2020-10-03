/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetproblem;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class MinimumSwaps {

    static int minimumSwaps(int[] arr) {
        int swap = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 != arr[i]) {
                int t = i;
                while (arr[t] != i + 1) {
                    t++;
                }
                int temp = arr[t];
                arr[t] = arr[i];
                arr[i] = temp;
                swap++;
            }
        }
        return swap;

    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 3, 6};
        int swaps = minimumSwaps(arr);
        System.out.println("Minimum no of swaps to sort " + swaps);
    }
}
