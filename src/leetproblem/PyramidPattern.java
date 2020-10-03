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
public class PyramidPattern {

    /* method to print the following pyramid 
    // pattern
     *  1
        3*2
        4*5*6
        10*9*8*7
     */
    static void printPattern(int n) {
        int col, num = 0;

        // loop for row
        for (int row = 1; row <= n; row++) {

            // when row number is odd,then print in increasing order.
            if (row % 2 != 0) {

                // printing in ascending order
                for (col = num + 1; col < num + row; col++) {
                    System.out.print(col + "*");
                }
                System.out.println(col++);

                // update value of 'num' 
                num = col;
            } // when row number is odd,then print in decending order.
            else {

                // update value of 'num' 
                num = num + row - 1;

                // print numbers with the '*' in 
                // decreasing order 
                for (col = num; col > num - row + 1; col--) {
                    System.out.print(col + "*");
                }
                System.out.println(col);
            }
        }
    }

    public static void main(String args[]) {
        int n = 5;
        printPattern(n);
    }
}
