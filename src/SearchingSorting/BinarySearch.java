/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchingSorting;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class BinarySearch {

    public int search(int arr[], int left, int right, int x) {
        if (right >= left) {

//            int mid = left + (right - left) / 2;
            int mid = (left + right) / 2;
//            System.out.println(left + "-" + mid + "-" + right + "->" + x);

            if (arr[mid] == x) {//best case
                return mid;
            }

            if (x < arr[mid]) {
                return search(arr, left, mid - 1, x);
            }

            return search(arr, mid + 1, right, x);

        }
        return -1;
    }

    public static void main(String args[]) {

        BinarySearch binarySearch = new BinarySearch();
        int arr[] = {2, 3, 4, 10, 40};//size is 5
        int size = arr.length, item_to_search = 3;

        int result = binarySearch.search(arr, 0, size - 1, item_to_search);

        if (result == -1) {
            System.out.println("The Item is not present in the Array");
        } else {
            System.out.println("The Item " + item_to_search + " is found at index " + result);
        }

    }

}
