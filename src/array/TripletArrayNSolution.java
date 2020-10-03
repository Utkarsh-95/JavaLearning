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
public class TripletArrayNSolution {

    static int maxProduct(int[] arr, int n) {
        // if size is less than 3, no triplet exists 
        if (n < 3) {
            return -1;
        }

        // Construct four auxiliary vectors of size n and initailize them by -1 
        int[] leftMin = new int[n];
        int[] rightMin = new int[n];
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        Arrays.fill(leftMin, -1);
        Arrays.fill(leftMax, -1);
        Arrays.fill(rightMax, -1);
        Arrays.fill(rightMin, -1);

        // will contain max product 
        int max_product = Integer.MIN_VALUE;

        // to store maximum element on left of array 
        int max_sum = arr[0];

        // to store minimum element on left of array 
        int min_sum = arr[0];

        // leftMax[i] will contain max element 
        // on left of arr[i] excluding arr[i]. 
        // leftMin[i] will contain min element 
        // on left of arr[i] excluding arr[i]. 
        for (int i = 1; i < n; i++) {
            leftMax[i] = max_sum;
            if (arr[i] > max_sum) {
                max_sum = arr[i];
            }

            leftMin[i] = min_sum;
            if (arr[i] < min_sum) {
                min_sum = arr[i];
            }
        }

        // reset max_sum to store maximum element on 
        // right of array 
        max_sum = arr[n - 1];

        // reset min_sum to store minimum element on 
        // right of array 
        min_sum = arr[n - 1];

        // rightMax[i] will contain max element 
        // on right of arr[i] excluding arr[i]. 
        // rightMin[i] will contain min element 
        // on right of arr[i] excluding arr[i]. 
        for (int j = n - 2; j >= 0; j--) {
            rightMax[j] = max_sum;
            if (arr[j] > max_sum) {
                max_sum = arr[j];
            }

            rightMin[j] = min_sum;
            if (arr[j] < min_sum) {
                min_sum = arr[j];
            }
        }

        // For all array indexes i except first and 
        // last, compute maximum of arr[i]*x*y where 
        // x can be leftMax[i] or leftMin[i] and 
        // y can be rightMax[i] or rightMin[i]. 
        for (int i = 1; i < n - 1; i++) {
            int max1 = Math.max(arr[i] * leftMax[i] * rightMax[i],
                    arr[i] * leftMin[i] * rightMin[i]);

            int max2 = Math.max(arr[i] * leftMax[i] * rightMin[i],
                    arr[i] * leftMin[i] * rightMax[i]);

            max_product = Math.max(max_product, Math.max(max1, max2));
        }

        return max_product;
    }

// Driver code 
    public static void main(String[] args) {
        int[] arr = {2, 10, 4, 6, 20, 1, 9};
        int n = arr.length;

        int max = maxProduct(arr, n);

        if (max == -1) {
            System.out.println("No Triplet Exists");
        } else {
            System.out.println("Maximum product is " + max);
        }
    }
}
