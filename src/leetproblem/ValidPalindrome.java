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
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int size = s.length();
        String lcs = s.toLowerCase();
        int left = 0;
        int right = size - 1;
        while (right >= left) {
            if (lcs.charAt(right) == lcs.charAt(left)) {
                right--;
                left++;
            } else if (!Character.isLetter(lcs.charAt(right))) {
                right--;
            } else if (!Character.isLetter(lcs.charAt(left))) {
                left++;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        System.out.println(vp.isPalindrome("A man, a plan, a canal : Panama"));
    }
}
