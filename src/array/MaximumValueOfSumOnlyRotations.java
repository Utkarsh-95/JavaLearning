/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class MaximumValueOfSumOnlyRotations {

    static int arr[] = new int[]{9, 10, 1, 2, 3, 4, 5, 6, 7, 8};

    // Returns max possible value of i*arr[i] 
    static int maxSum() {
        // Find array sum and i*arr[i] with no rotation 
        int arrSum = 0; // Stores sum of arr[i] 
        int currVal = 0; // Stores sum of i*arr[i] 
        for (int i = 0; i < arr.length; i++) {
            arrSum = arrSum + arr[i];//55
            currVal = currVal + (i * arr[i]);//250
        }
//        System.out.println(arrSum+"-"+currVal);

        // Initialize result as 0 rotation sum 
        int maxVal = currVal;

        // Try all rotations one by one and find the maximum rotation sum. 
        for (int j = 1; j < arr.length; j++) {
            currVal = currVal + arrSum - arr.length * arr[arr.length - j];
//            System.out.println(currVal + arrSum - arr.length * arr[arr.length - j]);
            if (currVal > maxVal) {
                maxVal = currVal;
            }
        }

        // Return result 
        return maxVal;
    }

    public static void main(String[] args) {
        System.out.println("Max sum is " + maxSum());
    }
}
