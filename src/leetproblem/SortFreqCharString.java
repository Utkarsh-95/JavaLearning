/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetproblem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class SortFreqCharString {

    static String countCharUsingStream(String str) {

        Map<String, Long> map = Arrays.stream(str.split("")).collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        map.entrySet().forEach((Map.Entry<String, Long> entry) -> {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        });

        return str;
    }

    static void countChar(String str) {

        TreeMap<Character, Integer> map = new TreeMap();
        char[] arr = str.toCharArray();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char h = arr[i];
            map.put(h, map.get(h) == null ? 1 : map.get(h) + 1);
        }

        PriorityQueue<Character> heap = new PriorityQueue<>(str.length(), (Character c1, Character c2) -> map.get(c2) - map.get(c1));

        for (char c : map.keySet()) {
            heap.offer(c);
        }

        StringBuilder sb = new StringBuilder();
        while (!heap.isEmpty()) {
            char c = heap.poll();
            int count = map.get(c);
            for (int i = 0; i < count; ++i) {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }

    static void countCharUsingHashMap(String str) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    static void countCharUsingTreeMap(String str) {
        char[] char_array = str.toCharArray();
        TreeMap<Character, Integer> charCounter = new TreeMap<>();
        for (char i : char_array) {
            charCounter.put(i, charCounter.get(i) == null ? 1 : charCounter.get(i) + 1);
        }

        for (Character key : charCounter.keySet()) {
            System.out.println("occurrence of '" + key + "' is  " + charCounter.get(key));
        }
    }

    public static void main(String[] args) {
//        countCharUsingStream("Dzaasacccd");
        countChar("tree");
//        countCharUsingHashMap("zaasacccd");
//        countCharUsingTreeMap("zaasacccd");
    }

}
