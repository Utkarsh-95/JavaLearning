/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nagarro;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class Majority {

    public static void majorityElement(int[] a) {

        int major = (int) Math.floor((double) a.length / 2.0);
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int m : a) {
            if (map.containsKey(m)) {
                int counter = map.get(m);
                map.put(m, counter + 1);
            } else {
                map.put(m, 1);
            }
        }

        map.entrySet().stream().forEach((Map.Entry<Integer, Integer> e) -> {
            if (e.getValue() > major) {
                System.out.print(e.getKey() + " ");
            }
        });
        System.out.println();

    }

    public static void main(String[] args) {
        int a[] = {2, 2, 1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        majorityElement(a);
    }
}
