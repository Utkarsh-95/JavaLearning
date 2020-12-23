/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListofQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class StringQues {

    public static void main(String[] args) {
//        Reverse the string
//        System.out.println(reverseStringwithTwoPointers("HEISAGOODBOY"));
//        System.out.println("));("HEISAGOODBOY"));
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
//        Count the characters in the string
        countChars("aabbdsddddddddccddeea");
//        kth closest element
//        int arr[] = {-2, -1, 1, 2, 3, 4};
//        int k = 4, x = 3;
//        System.out.println(findClosestElements(arr, k, x));

    }

    private static String reverseStringwithTwoPointers(String str) {

        char convertString[] = str.toCharArray();
        int left = 0, right = str.length() - 1;
        while (left < right) {
            char temp = convertString[left];
            convertString[left] = convertString[right];
            convertString[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(convertString);
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

    private static String countChars(String s) {
        TreeMap<Character, Integer> tm = new TreeMap<>();
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if (!tm.containsKey(s.charAt(i))) {
                tm.put(s.charAt(i), 1);
            } else {
                counter = tm.get(s.charAt(i));
                tm.put(s.charAt(i), counter + 1);
            }
//             tm.put(s.charAt(i), tm.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : tm.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println(key + " => " + value);
        }

        tm.entrySet().stream().forEach((Map.Entry<Character, Integer> e) -> {
            System.out.print(e.getKey() + "" + e.getValue());
        });
        return null;

    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> hm = new HashMap<>();

        for (Integer a : arr) {
            hm.put(a, x - a);
        }

        PriorityQueue<Integer> pQueue = new PriorityQueue<>((Integer t, Integer t1) -> {
            return hm.get(t) - hm.get(t1);
        });

        hm.entrySet().stream().forEach(e -> {
            pQueue.add(e.getKey());
            if (pQueue.size() > k) {
                pQueue.poll();
            }
        });

        pQueue.stream().forEach(e -> {
            result.add(e);
        });

        Collections.sort(result);
        return result;
    }
}
