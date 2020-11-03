/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPSException;

/**
 *
 * @author Utkarsh Pratap Singh
 */
// Java program to illustrate difference between final and immutability 
class Geeks {

    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("Hello");

        // Even though reference varibale sb is final 
        // We can perform any changes 
        sb.append("GFG");

        System.out.println(sb);

        // Here we will get Compile time error 
        // Because reassignment is not possible for final variable 
//        sb = new StringBuffer("Hello World");
        System.out.println(sb);
    }
}
