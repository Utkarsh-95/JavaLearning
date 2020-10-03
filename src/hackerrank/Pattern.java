/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int staircase = sc.nextInt();

        int i, j, k;
        for (i = staircase; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (k = staircase + 1; k >= i + 1; k--) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

}
