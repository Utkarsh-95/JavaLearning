/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringHandling;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        List<Integer> square = number.stream().map(x -> x * x).
                collect(Collectors.toList());
        System.out.println(square);

        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

        // demonstration of filter method 
        List<String> result = names.stream().filter(s -> s.startsWith("S") || s.startsWith("R")).collect(Collectors.toList());
        System.out.println(result);

//        List<String> show = names.stream().sorted().collect(Collectors.toList());
//        System.out.println(show);
//        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);
//
//        // collect method returns a set 
//        Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
//        System.out.println(squareSet);
        // demonstration of forEach method 
//        number.stream().map(x -> x * x).forEach(y -> System.out.println(y));
        // demonstration of reduce method 
//        int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
//        System.out.println(even);
//        StreamAPI.sumIterator(arrli);
        StreamAPI.sumStream((List<Integer>) number);
        StreamAPI.reverseInputString("UTKARSH");
    }

    private static int sumIterator(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while (it.hasNext()) {
            int num = it.next();
            if (num > 4) {
                sum += num;
                System.out.println(sum);
            }
        }
        return sum;
    }

    private static int sumStream(List<Integer> list) {
//        return list.stream().filter(i -> i > 3).mapToInt(i -> i).sum();
        List<Integer> square = list.stream().map(x -> x * x).
                collect(Collectors.toList());
        System.out.println(square);
        return 0;
    }

    private static void reverseInputString(String input) {
        StringBuilder sb = new StringBuilder(input);
        String result = sb.reverse().toString();
        System.out.println(result);
    }

}
