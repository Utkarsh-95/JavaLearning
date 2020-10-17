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
    static void pushZerosToEndTwoPointers(int arr[], int n) {
        int start = 0;
        int end = start + 1;

        while (end < n) {
            if (arr[start] == 0 && arr[end] != 0) {
                //swap
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
            }

            if (arr[start] != 0) {
                start++;
            }
            end++;
        }

    }

    // Function which pushes all zeros to end of an array. 
    static void pushZerosToEnd(int arr[], int n) {
        int count = 0;  // Count of non-zero elements 

        // Traverse the array. If element encountered is 
        // non-zero, then replace the element at index 'count' 
        // with this element 
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i]; // here count is incremented 
            }
        }
        // Now all non-zero elements have been shifted to 
        // front and 'count' is set as index of first 0. 
        // Make all elements 0 from count to end. 
        while (count < n) {
            arr[count++] = 0;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        pushZerosToEnd(arr, n);
        pushZerosToEndTwoPointers(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
