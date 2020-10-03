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
public class MinAndMax {

    public int max(int[] array) {
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int min(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {
        int[] myArray = {57, 92, 56, 39, 93};
        MinAndMax m = new MinAndMax();
        System.out.println("Maximum value in the array is::" + m.max(myArray));
        System.out.println("Minimum value in the array is::" + m.min(myArray));
    }
}
