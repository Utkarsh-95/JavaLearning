/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListofQues;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class StringQues {

    public static void main(String[] args) {
//        Reverse the string
//        System.out.println(reverseString("HEISAGOODBOY"));
//        Check whether a String is Palindrome or not
//        System.out.println(isPalindromeString("uttu"));
//        Find Duplicate characters in a string
//        System.out.println(duplicateCharacterinString("aaabbccdddddd"));
//        Why strings are immutable in Java
//        System.out.println(immutableString());
//        check whether one string is a rotation of another
//        System.out.println(checkStringRotationofAnother("ABCD", "CDAB"));
//        check whether a string is a valid shuffle of two strings or not
//        System.out.println(validShuffleofTwoStrings(s1, s2));

    }

    private static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    private static boolean isPalindromeString(String str) {
        //corner case
        if (str.length() == 0 || str == null) {
            return false;
        }

        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    private static Map<Character, Integer> duplicateCharacterinString(String str) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
            }
        }

        return map;
    }

    private static String immutableString() {

        String s = "Virat";
//        s.concat("Kolhi");//String is immutable
        s = s.concat(" Kohli");

        return s;
    }

    private static boolean checkStringRotationofAnother(String s1, String s2) {

        if (s1.length() != s2.length()) {
            System.out.println("Strings are not Rotation of each other");
            return false;
        }

        s1 = s1 + s1;
        if ((s1).indexOf(s2) != 0) {
            return true;
        }

        return false;
    }

    private static boolean validShuffleofTwoStrings(String s1, String s2) {
        return false;
    }

}
