/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Imp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class ForEachIterator {

    public static void main(String args[]) {
        // Create a link list which stores integer elements 
        List<Integer> l = new LinkedList<>();

        // Now add elements to the Link List 
        l.add(2);
        l.add(3);
        l.add(4);

        // Make another Link List which stores integer elements 
        List<Integer> s = new LinkedList<>();
        s.add(7);
        s.add(8);
        s.add(9);

        // Iterator to iterate over a Link List 
//        for (Iterator<Integer> itr1 = l.iterator(); itr1.hasNext();) {
//            for (Iterator<Integer> itr2 = s.iterator(); itr2.hasNext();) {
//                if (itr1.next() < itr2.next()) {
//                    System.out.println(itr1.next());
//                }
//            }
//        }
        // Iterator for each to iterate over a Link List 
        for (int a : l) {
            for (int b : s) {
                if (a < b) {
                    System.out.print(a + " ");
                }
            }
        }
    }
}
