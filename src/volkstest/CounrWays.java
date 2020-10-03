/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volkstest;

/**
 *
 * @author Utkarsh Pratap Singh
 */
// Java program to count ways to build street 
// under given constraints 
public class CounrWays {

// function to count ways of building 
// a street of n rows 
    static long countWays(int n) {
        long dp[][] = new long[2][n + 1];

        // base case 
        dp[0][1] = 1;
        dp[1][1] = 2;

        for (int i = 2; i <= n; i++) {

            // ways of building houses in both 
            // the spots of ith row 
            dp[0][i] = dp[0][i - 1] + dp[1][i - 1];

            // ways of building an office in one of 
            // the two spots of ith row 
            dp[1][i] = dp[0][i - 1] * 2 + dp[1][i - 1];
        }

        // total ways for n rows 
        return dp[0][n] + dp[1][n];
    }

    public static void main(String[] args) {

        int n = 2;
        System.out.print("Total no of ways with n = " + n
                + " are: " + countWays(n));
    }

}
