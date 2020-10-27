/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.math.BigDecimal;

/**
 *
 * @author Utkarsh Pratap Singh
 */
class FinalCheck {

    public final int vari;

    public FinalCheck() {
        this.vari = 0;
        System.out.println(vari);
    }

}

public class Check {

    static String findSum(String str1, String str2) {

        int sum = 0;
        int carry = 0;
        StringBuilder remain = new StringBuilder();
        int n1 = str1.length() - 1, n2 = str2.length() - 1;

        while (n1 >= 0 || n2 >= 0) {
            sum = carry;
            if (n1 >= 0) {
                sum += str1.charAt(n1) - '0';
                n1--;
            }
            if (n2 >= 0) {
                sum += str2.charAt(n2) - '0';
                n2--;
            }

            carry = sum / 10;
            remain.insert(0, sum % 10);

        }

        if (carry > 0) {
            remain.insert(0, carry);
        }

        return remain.toString();
    }

    public static void main(String[] args) {
//        FinalCheck fc = new FinalCheck();

        String s1 = "199";
        String s2 = "199";

        BigDecimal result = new BigDecimal(s1).add(new BigDecimal(s2));
        System.out.println("With Lib " + result);

        System.out.println("Without Lib " + findSum(s1, s2));
    }
}
