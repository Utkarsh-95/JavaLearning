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
public class CyclicallyRotateArrayOne {

    static int arr[] = new int[]{1, 2, 3, 4, 5};

    // Method for rotation 
    static void rotate() {
        int x = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = x;
    }

    public static void main(String[] args) {
        System.out.println("Given Array is");
        System.out.println(Arrays.toString(arr));

        rotate();

        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(arr));
    }
}
