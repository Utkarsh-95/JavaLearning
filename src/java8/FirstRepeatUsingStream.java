/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

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
                .filter((Map.Entry<Character, Long> e) -> e.getValue() == 1).map(e -> e.getKey()).findFirst();
        if (firstNonRepeat.isPresent()) {
            System.out.println("First non repeating:" + firstNonRepeat.get());
        }

        Optional<Character> firstRepeat = collect.entrySet().stream().filter((e) -> e.getValue() > 1).map(e -> e.getKey()).findFirst();
        System.out.println("First repeating:" + firstRepeat.orElse(null));

        System.out.println("----------------------------------");
        collect.entrySet().stream().forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

    }
}
