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
public class Singleton {
    // static variable single_instance of type Singleton 

    private static Singleton single_instance = null;

    // variable of type String 
    public String s;

    // private constructor restricted to this class itself 
    private Singleton() {
        s = "Hello I am a string part of Singleton class";
    }

    // static method to create instance of Singleton class 
    public static Singleton getInstance() {
        if (single_instance == null) {
            single_instance = new Singleton();
        }

        return single_instance;
    }
}

// Driver Class 
class Main {

    public static void main(String args[]) {
        // instantiating Singleton class with variable x 
        Singleton x = Singleton.getInstance();

        // instantiating Singleton class with variable y 
        Singleton y = Singleton.getInstance();

        // instantiating Singleton class with variable z 
        Singleton z = Singleton.getInstance();

        // changing variable of instance x 
        x.s = (x.s).toUpperCase();

        System.out.println("String from x is " + x);
        System.out.println("String from y is " + y);
        System.out.println("String from z is " + z);
        System.out.println("\n");

        // changing variable of instance z 
        z.s = (z.s).toLowerCase();

        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
    }
}
