/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orange;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class Arr2isSubsetofArr1 {

    /*Given two unsorted array arr1[]  and arr2[] of m and n  integers respectively, 
    Write a Java program which will check whether arr2 is subset of arr1 or not.
    Make sure time complexity should not be O(m*n).
    Example:
    Input: arr1[] = {1, 2, 7, 5, 6}, arr2[] = {1, 2, 7}
    Output: true
    Input: arr1[] = {10, 51, 17, 23, 19}, arr2[] = {19, 5, 3}
    Output: false*/
    public static void main(String[] args) {
        int[] b = {10, 51, 17, 23, 19};
        int[] c = {19, 5, 3};
        Set<Integer> set = new HashSet<>();
        for (int x : b) {
            set.add(x);
        }

        for (int x : c) {

            if (!set.contains(x)) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
