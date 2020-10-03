/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class TwoMaxNumber {

    public void printTwoMaxNumbers(int[] nums) {
        int maxOne = 0;
        int maxTwo = 0;
        for (int n : nums) {
            if (maxOne < n) {
                maxTwo = maxOne;
                maxOne = n;
            } else if (maxTwo < n) {
                maxTwo = n;
            }
        }
        System.out.println("First Max Number: " + maxOne);
        System.out.println("Second Max Number: " + maxTwo);
    }

    public static void main(String[] args) {
        int num[] = {5, 34, 78, 2, 45, 1, 99, 23};
        TwoMaxNumber tmn = new TwoMaxNumber();
        tmn.printTwoMaxNumbers(num);
    }

}
