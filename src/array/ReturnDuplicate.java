/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class ReturnDuplicate {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 5, 6, 6, 7, 8, 9, 10, 10};

        List<Integer> al = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (al.contains(arr[i])) {
                result.add(arr[i]);
//                break;
            } else {
                al.add(arr[i]);
            }
        }

//        result.forEach((resString) -> {
//            System.out.println("In iterating " + resString);
//        });
        System.out.println(result);

    }
}
