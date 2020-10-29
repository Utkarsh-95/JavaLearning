/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class Treeset {

    public static void main(String[] args) {

        SortedSet<Integer> setWithNaturalOrdering = new TreeSet<>();
        setWithNaturalOrdering.add(5);
        setWithNaturalOrdering.add(9);
        setWithNaturalOrdering.add(4);
        setWithNaturalOrdering.add(2);
        setWithNaturalOrdering.forEach(System.out::println);
        int chr = 'f';
        System.out.println("The ASCII value :" + chr);

        TreeSet<String> treeSet = new TreeSet<>((o1, o2) -> {
            System.out.println(o1 + " -- " + o2 + " -- " + o1.compareTo(o2));
            return o1.compareTo(o2);

        });

        treeSet.add("Geeks");
        treeSet.add("for");
        treeSet.add("Geeks");
        treeSet.add("GeeksforGeeks");

        for (String temp : treeSet) {
            System.out.printf(temp + " ");
        }

        treeSet = new TreeSet<>((o1, o2) -> {
            System.out.println(o1 + " -- " + o2 + " -- " + o2.compareTo(o1));
            return o2.compareTo(o1);

        });

        treeSet.add("Geeks");
        treeSet.add("for");
        treeSet.add("Geeks");
        treeSet.add("GeeksforGeeks");

        for (String temp : treeSet) {
            System.out.printf(temp + " ");
        }

        System.out.println("\n");
    }
}
