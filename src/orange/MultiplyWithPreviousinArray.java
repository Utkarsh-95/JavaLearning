/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orange;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class MultiplyWithPreviousinArray {

    /*Given an array arr[] of n integers, construct a Multiple Array mult[] (of same size) such that every element is multiplication of previous and next elements with following exceptions. 
     a) First element is replaced by multiplication of first and second.
     b) Last element is replaced by multiplication of last and second last.
    Example:
    Input: arr[] = {2, 3, 4, 5, 6}
    Output: arr[] = {6, 8, 15, 24, 30}
    // We get the above output using following logic
    // arr[] = {2*3, 2*4, 3*5, 4*6, 5*6}
    Solve above problem with O(n) time. */
    public static void main(String[] args) {

        int[] a = {2, 3, 4, 5, 6};

        int[] output = new int[a.length];
        int k = 1;

        output[0] = a[0] * a[1];
        int i = 1;
        for (; i <= a.length - 2; i++) {
            output[k++] = a[i - 1] * a[i + 1];
        }

        output[a.length - 1] = a[a.length - 2] * a[a.length - 1];

        for (int x : output) {
            System.out.print(x + " ");
        }
    }
}
