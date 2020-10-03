
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashSet;
import java.util.Vector;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class HackerearthEffi {

    static int MAX = 100;

    // Prefix Array 
    static Vector<Integer> Prefix = new Vector<>();

    // Function to check if the given 
    // number has repeated digit or not 
    static int repeated_digit(int n) {
        HashSet<Integer> a = new HashSet<>();
        int d;

        // Traversing through each digit 
        while (n != 0) {
            d = n % 10;

            // if the digit is present 
            // more than once in the 
            // number 
            if (a.contains(d)) // return 0 if the number 
            // has repeated digit 
            {
                return 0;
            }
            a.add(d);
            n /= 10;
        }

        // return 1 if the number has no 
        // repeated digit 
        return 1;
    }

    // Function to pre calculate 
    // the Prefix array 
    static void pre_calculations() {
        Prefix.add(0);
        Prefix.add(repeated_digit(1));

        // Traversing through the numbers 
        // from 2 to MAX 
        for (int i = 2; i < MAX + 1; i++) // Generating the Prefix array 
        {
            Prefix.add(repeated_digit(i) + Prefix.elementAt(i - 1));
        }
    }

    // Calclute Function 
    static int calculate(int L, int R) {

        // Answer 
        return Prefix.elementAt(R) - Prefix.elementAt(L - 1);
    }

    // Driver Code 
    public static void main(String[] args) {
        int L = 1, R = 100;

        // Pre-calculating the Prefix array. 
        pre_calculations();

        // Calling the calculate function 
        // to find the total number of number 
        // which has no repeated digit 
        System.out.println(calculate(L, R));
    }
}
