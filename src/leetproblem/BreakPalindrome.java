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
public class BreakPalindrome {

    public static String breakPalindrome(String palindrome) {

        if (palindrome.length() == 1) {
            return "";
        }
        char[] chars = palindrome.toCharArray();
//        System.out.println(chars);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 'a') {
                // Skip if the string is of odd length and it is the middle index
                if (palindrome.length() % 2 != 0 && i == palindrome.length() / 2) {
                    continue;
                }
                chars[i] = 'a';
                break;
            }
            // If all chars all 'a' update last char to 'b'
            if (i == chars.length - 1) {
                chars[i] = 'b';
            }
        }
        return String.valueOf(chars);

    }

    public static void main(String[] args) {
        System.out.println(BreakPalindrome.breakPalindrome("aitin"));//nitin
    }
}
