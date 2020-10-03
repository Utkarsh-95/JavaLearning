/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandling;

/**
 *
 * @author Utkarsh Pratap Singh
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DistinctCharsCount {

    public static void main(String[] args) {

        printDistinctCharsWithCount("abcabc");
//        printDistinctCharsWithCount("abcab3");
//        printDistinctCharsWithCount("hi there, i am uttu");
    }

    private static void printDistinctCharsWithCount(String input) {
        Map<Character, Integer> charsWithCountMap = new HashMap<>();

        // using Map merge method from Java 8
        for (char c : input.toCharArray()) {
            charsWithCountMap.merge(c, 1, Integer::sum);
        }
        System.out.println(charsWithCountMap);

        // another way using latest Java enhancements and no for loop, a bit complex though
        List<Character> list = input.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        list.stream().forEach(c -> charsWithCountMap.merge(c, 1, Integer::sum));

        System.out.println(charsWithCountMap);

    }

}
