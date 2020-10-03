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

public class PlusMinus {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] matrix = new int[n];

        int positiveCount = 0, negativeCount = 0, zerosCount = 0;
        float a = 0f, b = 0f, c = 0f;

//        enterMatrixData(scan, matrix, n);

        for (int i = 0; i < n; i++) {
            matrix[i] = scan.nextInt();

            if (matrix[i] < 0) {
                negativeCount++;
            } else if (matrix[i] > 0) {
                positiveCount++;
            } else if (matrix[i] == 0) {
                zerosCount++;
            }
        }

        a = (float) positiveCount / n;
        b = (float) negativeCount / n;
        c = (float) zerosCount / n;
        System.out.printf("%.6f \n", a);
        System.out.printf("%.6f \n", b);
        System.out.printf("%.6f", c);

    }

    public static void enterMatrixData(Scanner scan, int[] matrix, int n) {
        for (int i = 0; i < n; i++) {
            matrix[i] = scan.nextInt();
        }
    }
}
