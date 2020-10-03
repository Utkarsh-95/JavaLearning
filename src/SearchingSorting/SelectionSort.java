/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchingSorting;

import java.util.Arrays;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class SelectionSort<T> {

    public T getS(T obj) {
        return obj;
    }

    public static void main(String[] args) {

        int[] array = {4, 9, 3, 6, 2, 10};
        int size = array.length;
        System.out.println("Unsorted " + Arrays.toString(array));

//        O(n*2) quadratic time
        for (int i = 0; i < size - 1; i++) {//O(n) Complexity
            int min_idx = i;// for selecting minimum index to sort
            for (int j = i + 1; j < size; j++) {//O(n) Complexity and j=j+1 O(1) Complexity
                if (array[j] < array[min_idx]) {
                    min_idx = j;
                }
            }
            int temp = array[i];
            array[i] = array[min_idx];
            array[min_idx] = temp;
        }
        System.out.println("Sorted " + Arrays.toString(array));
    }

}
