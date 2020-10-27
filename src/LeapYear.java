/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class LeapYear {

    public static void main(String[] args) {

        int year = 2000;
        boolean leap = false;

        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
            leap = true;
        } else {
            leap = false;
        }

        if (leap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
