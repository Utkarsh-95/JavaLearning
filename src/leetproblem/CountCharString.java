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
public class CountCharString {

    static final int MAX_CHAR = 256;

    static void getOccuringChar(String str) {
        int countChar[] = new int[MAX_CHAR];
        int len = str.length();

        for (int i = 0; i < len; i++) {
            countChar[str.charAt(i)]++;
        }

        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int count = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == ch[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("Number of Occurrence of " + str.charAt(i) + " is:" + countChar[str.charAt(i)]);
            }
        }
    }

    public static void main(String[] args) {
        getOccuringChar("aacee");
    }
}
