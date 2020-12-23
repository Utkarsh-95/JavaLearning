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
public class Segregate0and1s {

    /*Function to put all 0s on left and all 1s on right*/
    void segregate0and1(int arr[], int size) {
        /* Initialize left and right indexes */
        int left = 0, right = size - 1;

        while (left < right) {
            /* Increment left index while we see 0 at left */
            while (arr[left] == 0 && left < right) {
                left++;
            }

            /* Decrement right index while we see 1 at right */
            while (arr[right] == 1 && left < right) {
                right--;
            }

            /* If left is smaller than right then there is a 1 at left 
			and a 0 at right. Exchange arr[left] and arr[right]*/
            if (left < right) {
                arr[left] = 1;
                arr[right] = 0;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        Segregate0and1s seg = new Segregate0and1s();
        int arr[] = new int[]{0, 1, 0, 1, 1, 1};
        int i, arr_size = arr.length;

        seg.segregate0and1(arr, arr_size);

        System.out.print("Array after segregation is ");
        for (i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
