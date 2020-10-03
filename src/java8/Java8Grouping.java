/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class Java8Grouping {

    public static void main(String[] args) {

        //3 apple, 2 banana, others 1
        List<String> items = Arrays.asList("apple", "apple", "banana",
                "apple", "orange", "banana", "papaya");

        Map<String, Long> result = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(result);

    }
}
