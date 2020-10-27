package hackerrank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class HackerearthBruteforce {

    static int repeated_digit(int n) {
        LinkedHashSet<Integer> s = new LinkedHashSet<>();

        // Traversing through each digit 
        while (n != 0) {
            int d = n % 10;
            // if the digit is present more than once in the number 
            if (s.contains(d)) {
                // return 0 if the number has repeated digit 
                return 0;
            }
            s.add(d);
            n = n / 10;
        }

        // return 1 if the number has no repeated digit 
        return 1;
    }

// Function to find total number in the given range which has no repeated digit 
    static int calculate(int L, int R) {
        int answer = 0;

        // Traversing through the range 
        for (int i = L; i < R + 1; ++i) {

            // Add 1 to the answer if i has no repeated digit else 0 
            answer = answer + repeated_digit(i);
        }
        System.out.println("Hackerearth.calculate() " + answer);
        return answer;
    }

    public static void main(String[] args) {
        Scanner left = new Scanner(System.in);
        System.out.println("Enter first value");
        int L = left.nextInt();

        Scanner right = new Scanner(System.in);
        System.out.println("Enter Second value");
        int R = right.nextInt();

        System.out.println("Range is: " + L + " to " + R);
        calculate(L, R);
    }
}
