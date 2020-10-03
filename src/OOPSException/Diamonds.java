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
class BaseClass {

    public void foo() {
        System.out.println("BaseClass's foo");
    }

}

interface BaseInterface {

    default public void foo() {
        System.out.println("BaseInterface's foo");
    }

}

public class Diamonds extends BaseClass implements BaseInterface {

    public static void main(String[] args) {

        new Diamonds().foo();

    }

}
