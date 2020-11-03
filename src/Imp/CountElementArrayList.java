/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class CountElementArrayList {

    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(1, 1, 1, 2, 2, 2, 4, 4, 4);
        Map<Integer, Integer> resMap = new HashMap<>();

        al.forEach((intObj) -> {
            if (resMap.containsKey(intObj)) {
                resMap.put(intObj, resMap.get(intObj) + 1);
            } else {
                resMap.put(intObj, 1);
            }
        });

        System.out.println("ListofQues.k.main()" + resMap.toString());
    }
}
