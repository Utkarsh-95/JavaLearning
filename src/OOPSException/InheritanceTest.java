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

    public void foo() {
        System.out.println("SuperClassA");
    }

}

class SubClassB extends SuperClassA {

    public void bar() {
        System.out.println("SubClassB");
    }

}

public class InheritanceTest {

    public static void main(String args[]) {
        SubClassB a = new SubClassB();

        a.foo();
        a.bar();
    }
}
