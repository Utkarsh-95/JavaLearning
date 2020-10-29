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
class SuperClassA {

    public SuperClassA(String s) {
        System.out.print("A");
    }
}

class SubClassB extends SuperClassA {

//    by default jvm call super to default constructor
    public SubClassB(String s) {
        super(s);
        System.out.print("B");
    }

}

public class InheritanceTest {

    public static void main(String args[]) {
        new SubClassB("C");
        System.out.println(" ");
    }
}
