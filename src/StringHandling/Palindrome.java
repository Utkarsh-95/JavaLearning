package StringHandling;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class Palindrome {

    public static void main(String[] args) {
        Palindrome.isPalindromeString("");
    }

    private static boolean isPalindromeString(String str) {
        if (str == null) {
            System.out.println("Palindrome.isPalindromeString() is null");
            return false;
        }
        int length = str.length();
        System.out.println(length / 2);
        for (int i = 0; i < length / 2; i++) {

            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
