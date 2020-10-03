/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author Utkarsh Pratap Singh
 */
import java.util.Scanner;

public class DiffDiag {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter The Number Of Matrix Rows and Column");

        int n = scan.nextInt();

        //defining 2D array to hold matrix data
        int[][] matrix = new int[n][n];
        // Enter Matrix Data
        enterMatrixData(scan, matrix, n, n);

        System.out.print(difference(matrix, n));
    }

    public static int difference(int arr[][], int n) {
        // Initialize sums of diagonals 
        int d1 = 0, d2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // finding sum of primary diagonal 
                if (i == j) {
                    d1 += arr[i][j];
                }

                // finding sum of secondary diagonal 
                if (i == n - j - 1) {
                    d2 += arr[i][j];
                }
            }
        }

        return Math.abs(d1 - d2);
    }

    public static void enterMatrixData(Scanner scan, int[][] matrix, int matrixRow, int matrixCol) {

        for (int i = 0; i < matrixRow; i++) {
            for (int j = 0; j < matrixCol; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
    }
}
