/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagarro;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class PushZero {

    // Two pointers Function which pushes all zeros to end of an array. 
    private static void pushZerosToEndTwoPointers(int arr[], int n) {
        int start = 0;
        int end = start + 1;

        while (end < n) {
            if (arr[start] != 0) {
                start++;
            }
            if (arr[start] == 0 && arr[end] != 0) {
                //swap
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
            }
            end++;
        }

    }

    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int n = arr.length;
//        pushZerosToEnd(arr, n);
        pushZerosToEndTwoPointers(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
