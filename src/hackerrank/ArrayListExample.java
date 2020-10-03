/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Utkarsh Pratap Singh
 */

public class ArrayListExample {

    public static void main(String[] args) {

        List<Integer> iList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        iList.forEach(i -> System.out.println("hackerrank.ArrayListExample.main()" + i))
        iList.forEach(System.out::println);

        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        list.forEach(n -> System.out.println(n));

        //Convert to object array
        Object[] array = list.toArray();

        System.out.println(Arrays.toString(array));

        //Iterate and convert to desired type
        for (Object o : array) {
            String s = (String) o;

            System.out.println(s);
        }
    }
}
