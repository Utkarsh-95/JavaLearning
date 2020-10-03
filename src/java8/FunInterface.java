/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8;

/**
 *
 * @author Utkarsh Pratap Singh
 */
@FunctionalInterface
public interface FunInterface {

    void show(int x, int y);

    // we can define N no of static and default methods in Functional Interface
    default void display() {
        System.out.println("I am default method");
    }

    static void print() {
        System.out.println("I am static method");
    }
    
    
}
