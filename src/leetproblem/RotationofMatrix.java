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
public class RotationofMatrix {

    static int N = 4;

// Function to rotate the matrix 90 degree clockwise 
    static void rotate90Clockwise(int a[][]) {

        // Traverse each cycle 
        for (int i = 0; i < N / 2; i++) {//run the loop till i less than 2
            for (int j = i; j < N - i - 1; j++) {//run till j is 3

                // Swap elements of each cycle in clockwise direction 
                int temp = a[i][j];
                a[i][j] = a[N - 1 - j][i];
                a[N - 1 - j][i] = a[N - 1 - i][N - 1 - j];
                a[N - 1 - i][N - 1 - j] = a[j][N - 1 - i];
                a[j][N - 1 - i] = temp;
            }
        }
    }

    // Function to rotate the matrix 90 degree anticlockwise 
    static void rotate90AntiClockwise(int a[][]) {

        for (int i = 0; i < N / 2; i++) {//run the loop till i less than 2
            for (int j = i; j < N - i - 1; j++) {//run till j is 3

                // Swap elements of each cycle in anticlockwise direction 
                int temp = a[i][j];
                a[i][j] = a[j][N - 1 - i];
                a[j][N - 1 - i] = a[N - 1 - i][N - 1 - j];// Move values from bottom to right 
                a[N - 1 - i][N - 1 - j] = a[N - 1 - j][i];// Move values from left to bottom 
                a[N - 1 - j][i] = temp;// Assign temp to left
            }
        }
    }

    static void printMatrix(int arr[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};
        rotate90Clockwise(arr);
//        rotate90AntiClockwise(arr);
        printMatrix(arr);
    }
}
