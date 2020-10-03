package OOPSException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Utkarsh Pratap Singh
 */
//Constructor Chaining within same class Using this() keyword 
public class ConstructorChaining {
    // default constructor 1 
    // default constructor will call another constructor 
    // using this keyword from same class 

    ConstructorChaining() {
        // calls constructor 2 
        this(5);
        System.out.println("The Default constructor");
    }

    // parameterized constructor 2 
    ConstructorChaining(int x) {
        // calls constructor 3 
        this(5, 15);
        System.out.println(x);
    }

    // parameterized constructor 3 
    ConstructorChaining(int x, int y) {
        this(6, 6, 6);
        System.out.println(x * y);
    }

    ConstructorChaining(int x, int y, int z) {
        System.out.println(x * y * z);
    }

    public static void main(String args[]) {
        // invokes default constructor first 
        new ConstructorChaining();
    }
}
