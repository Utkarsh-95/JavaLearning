/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetproblem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class Concordance {

    private static Map<Character, Set<Integer>> characterConcordance(String input) {

        Map<Character, Set<Integer>> concordance = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char charAt = input.charAt(i);
            if (charAt == ' ') {
                continue; // ignore spaces
            }
            Set<Integer> set = concordance.get(charAt);
            if (set == null) {
                set = new HashSet<>();
            }
            set.add(i + 1); // use i for 0-indexed, or (i+1) for 1-indexed positions
            concordance.put(charAt, set);
        }

        return concordance;
    }

    public static void main(final String[] args) {

        System.out.println(Concordance.characterConcordance("IS Java 100% Object ??"));
//        {a=[5, 7], b=[15], c=[18], %=[12], e=[17], I=[1], J=[4], j=[16], O=[14], 0=[10, 11], 1=[9], S=[2], t=[19], v=[6], ?=[21, 22]}
    }
}
