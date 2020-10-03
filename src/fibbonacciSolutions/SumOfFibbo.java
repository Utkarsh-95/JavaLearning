/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibbonacciSolutions;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class SumOfFibbo {

    static int calculateSum(int n) {
        if (n <= 0) {
            return 0;
        }

        int fibo[] = new int[n + 1];
        System.out.println("Size of an array " + fibo.length);
        fibo[0] = 0;
        fibo[1] = 1;

        // Initialize result 
        int sum = fibo[0] + fibo[1];

        // Add remaining terms 
        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            sum += fibo[i];
        }

        return sum;
    }

    public static void main(String args[]) {
        int n = 9;
        System.out.println("Sum of Fibonacci numbers is : " + calculateSum(n));
    }
}
