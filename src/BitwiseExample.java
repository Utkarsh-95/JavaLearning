/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utkarsh Pratap Singh
 */
public class BitwiseExample {

    public static void main(String[] args) {
//Variables Definition and Initialization
        int n1 = 18, n2 = 28;
//Bitwise AND
        System.out.println("num1 & num2 = " + (n1 & n2));
//Bitwise OR
        System.out.println("num1 | num2 = " + (n1 | n2));
//Bitwise XOR
        System.out.println("num1 ^ num2 = " + (n1 ^ n2));
//Binary Complement Operator
        System.out.println("~num1 = " + ~n1);

// left shift operator 
        System.out.println("n1<<2 = " + (n1 << 2)); // right shift operator System.out.println("n2>>2 = " + (n2 >> 2)); 
// unsigned right shift operator 
        System.out.println("n2>>>2 = " + (n2 >>> 2));
    }
}
