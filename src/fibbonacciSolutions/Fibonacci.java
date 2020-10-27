package fibbonacciSolutions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class Fibonacci {

//    Optimized way
    private static int fibOptimized(int n) {
        int a = 0, b = 1, c;
        if (n == 0) {
            return a;
        }
        for (int i = 0; i < n; i++) {
//            print fib series
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

//    using recursion
    private static int fibUsingRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return fibUsingRecursion(n - 1) + fibUsingRecursion(n - 2);
    }

    private static int fibUsingDP(int n) {
        /* Declare an array to store Fibonacci numbers. */
        int f[] = new int[n + 2]; // 1 extra to handle case, n = 0 
        int i;

        /* 0th and 1st number of the series are 0 and 1*/
        f[0] = 0;
        f[1] = 1;

        System.out.print(f[0] + " " + f[1] + " ");

        for (i = 2; i <= n; i++) {
            /* Add the previous 2 numbers in the series and store it */
            f[i] = f[i - 1] + f[i - 2];
            System.out.print(f[i] + " ");
        }

        return f[n];
    }

    public static void main(String args[]) {
        int n = 9;
//        System.out.println("Recursion " + fibUsingRecursion(n));
        System.out.println("DP " + "nth Element :- " + fibUsingDP(n));
//        System.out.println("Optimized " + fibOptimized(n));
    }
}
