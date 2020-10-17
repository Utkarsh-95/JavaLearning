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
public class FindDuplicateWithoutUsingCollection {

    void print(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            if (arr[Math.abs(arr[i])] >= 0) {
                System.out.println(arr[Math.abs(arr[i])]);
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            } else {
                System.out.println(arr[i] + "");
            }
        }
    }

    void print() {
        for (int i = 1; i < 100; i++) {
            if (i % 10 == 0) {
                System.out.println(i + " hello");
            } else if (i % 5 == 0) {
                System.out.println(i + " hi");
            } else {
                System.out.println(i);
            }
        }
    }

    void hihello() {
        for (int i = 1; i <= 100; i++) {
            String test = "";
            test += (i % 10) == 0 ? "hi" : "";
            test += (i % 5) == 0 ? "hello" : "";
            System.out.println(!test.isEmpty() ? test : i);
        }
    }

    public static void main(String[] args) {
        FindDuplicateWithoutUsingCollection duplicate = new FindDuplicateWithoutUsingCollection();
        int arr[] = {1, 2, 3, 4, 5, 3, 7};
        int n = arr.length - 1;

//        duplicate.print(arr, n);
        duplicate.print();
//        duplicate.hihello();
    }
}
