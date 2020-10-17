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
public class ExtraElementPresentinArray {

    // Returns index of extra element 
    // in arr1[]. n is size of arr2[]. 
    // Size of arr1[] is n-1. 
    static int findExtraOn(int arr1[], int arr2[], int n) {
        for (int i = 0; i < n; i++) {
            if (arr1[i] != arr2[i]) {
                return i;
            }
        }

        return n;
    }

//Time complexity : O(log n).
//The time complexity of binary search is O(log n)
//Space complexity : O(1).
    static int findExtralogn(int arr1[], int arr2[], int n) {
        int index = n;//6

        // left and right are end points denoting the current range. 
        int left = 0, right = n - 1;//left=0,right=5
        while (left <= right) {
            int mid = (left + right) / 2;

            // If middle element is same of both arrays, it means  
            // that extra element is after mid so we update left to mid+1 
            if (arr2[mid] == arr1[mid]) {
                left = mid + 1;
            } 
            // If middle element is different of the arrays, it means that  
            // the index we are searching for is either mid, or before mid.  
            // Hence we update right to mid-1. 
            else {
                index = mid;
                right = mid - 1;
            }
        }

        // when right is greater than left, our search is complete. 
        return index;
    }

    public static void main(String[] args) {
        int arr1[] = {2, 4, 6, 8, 10, 12, 13};
        int arr2[] = {2, 6, 8, 10, 12, 13};
        int n = arr2.length;

        System.out.println(findExtralogn(arr1, arr2, n));
    }
}
