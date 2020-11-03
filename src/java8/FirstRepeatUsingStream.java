/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class FirstRepeatUsingStream {
    
    public static void main(String[] args) {
        String s = "this is Statement";
        Map<Character, Long> collect = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(i -> i, LinkedHashMap::new, Collectors.counting()));
//        collect.forEach((x, y) -> System.out.println("Key: " + x + " Val: " + y));

        Optional<Character> firstNonRepeat = collect.entrySet().stream()
                .filter(e -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
        if (firstNonRepeat.isPresent()) {
            System.out.println("First non repeating:" + firstNonRepeat.get());
        }
        
        Optional<Character> firstRepeat = collect.entrySet().stream().filter((e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
        System.out.println("First repeating:" + firstRepeat.orElse(null));
        
        System.out.println("----------------------------------");
        collect.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
        
        String str[] = {"dsfs", "sdfsdfew", "wrewrew"};
        List<String> lisrStr = new ArrayList<>(Arrays.asList(str));
        lisrStr.add("deepak");
        System.out.println("Adding in list: " + lisrStr);
        List<String> listString = Stream.of(str).collect(Collectors.toCollection(ArrayList::new));
        
        System.out.println("Stream: " + listString);
        
        List lll = new ArrayList();
        lll.add("dsfdf");
        lll.add(1);
        System.out.println("----------------------------------------------------");
//        Collections.sort(lll);
        System.out.println(lll);
        
        ArrayList<Integer> al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(null);
        
        al.stream().forEach(e -> System.out.println(e + ""));
        
    }
}
