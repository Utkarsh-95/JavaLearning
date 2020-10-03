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
interface Interface1 {

    default public void foo() {
        System.out.println("Interface1's foo");
    }

}

interface Interface2 {

    default public void foo() {
        System.out.println("Interface2's foo");
    }

}

public class Diamond implements Interface1, Interface2 {

    @Override
    public void foo() {
        Interface1.super.foo();
        Interface2.super.foo();
    }

    public static void main(String[] args) {

        new Diamond().foo();

    }

}
