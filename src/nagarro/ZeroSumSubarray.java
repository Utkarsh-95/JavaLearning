/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagarro;

import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class ZeroSumSubarray {

    // Returns true if arr[] has a subarray with zero sum 
    static Boolean subArrayExists(int arr[]) {

        Set<Integer> hs = new HashSet<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Return true in following cases 
            // a) Current element is 0 
            // b) sum of elements from 0 to i is 0 
            // c) sum is already present in hash map 
            if (arr[i] == 0 || sum == 0 || hs.contains(sum)) {
                return true;
            }

            // Add sum to hash set 
            hs.add(sum);
        }

        // We reach here only when there is no subarray with 0 sum 
        return false;
    }

    public static void main(String arg[]) {
        int arr[] = {4, 2, -3, 1, 6};
        if (subArrayExists(arr)) {
            System.out.println("Found a subarray with 0 sum");
        } else {
            System.out.println("No Such Sub Array Exists!");
        }
    }
}
