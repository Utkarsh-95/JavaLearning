/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetproblem;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class MinimizationString {

    static int reduceString(String s, int l) {

        int count = 1, steps = 0;

        // traverse in the string 
        for (int i = 1; i < l; i++) {
            // if adjacent characters 
            // are same 
            if (s.charAt(i) == s.charAt(i - 1)) {
                count += 1;
            } else {
                // if same adjacent pairs 
                // are more than 1 
                steps += (count / 2);

                count = 1;
            }
        }
        steps += count / 2;
        return steps;
    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";

        int l = s.length();
        System.out.print(reduceString(s, l) + "\n");
    }
}
