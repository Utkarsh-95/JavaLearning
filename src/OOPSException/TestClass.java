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
interface InterfaceA {

    public void show();

    default void shows() {
        System.out.println("Database Connection");
        StringBuilder sb = new StringBuilder();
        sb.append("aa").append("bb");
        System.out.println(sb.toString());

    }
}

interface InterfaceB {

    public void show();

    default void shows() {
        System.out.println("File Writing");
    }
}

public class TestClass implements InterfaceA, InterfaceB {

    @Override
    public void shows() {
        // use super keyword to call the show 
        // method of PI1 interface 
        InterfaceA.super.shows();

        // use super keyword to call the show 
        // method of PI2 interface 
        InterfaceB.super.shows();
    }

    public static void main(String args[]) {
        TestClass d = new TestClass();
        d.shows();
        d.show();
    }

    @Override
    public void show() {
        System.out.println("Overriden Method");
    }
}
