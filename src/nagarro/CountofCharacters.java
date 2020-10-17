/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagarro;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class CountofCharacters {

    private static void countChars(String s) {
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

        tm.entrySet().stream().forEach((Map.Entry<Character, Integer> e) -> {
            System.out.println(e.getKey() + " " + e.getValue());
        });

    }

    public static void main(String[] args) {
        String str = "aabbdsddddddddccddeea";
        countChars(str);

    }

}
