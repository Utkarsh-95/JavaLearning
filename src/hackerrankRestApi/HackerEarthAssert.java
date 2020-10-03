/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrankRestApi;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class HackerEarthAssert {

    static int val = 3;

    static int getValue() {
        return val--;
    }

    public static void main(String args[]) {
        int n;
        for (int i = 0; i < 5; i++) {
            n = getValue();
            assert n > 2;
            System.out.println(" " + n);
        }
    }
}
