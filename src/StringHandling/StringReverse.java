/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class StringReverse {

//    O(1) space complexity with O(n) time 
    public static void reverseString(char[] s) {
//        two pointer technique
        int left = 0, right = s.length - 1;
        while (left < right) {
            char tmp = s[left];
            s[left++] = s[right];
            s[right--] = tmp;
        }
        System.out.println(s);
    }

    private static void printReverse(char[] str) {
        helper(0, str);
    }

    private static void helper(int index, char[] str) {
        if (str == null || index >= str.length) {
            return;
        }
        helper(index + 1, str);
        System.out.print(str[index]);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String testString = reader.readLine();

        char[] stringToCharArray = testString.toCharArray();

        StringReverse.reverseString(stringToCharArray);
//        StringReverse.printReverse(stringToCharArray);
    }

}
